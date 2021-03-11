package com.example.avro.serde.serializer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaAvroSerializer<T extends SpecificRecordBase> implements Serializer<T> {

  private static final Logger logger = LoggerFactory.getLogger(KafkaAvroSerializer.class);

  @Override
  public void close() {
  }

  @Override
  public void configure(Map<String, ?> arg0, boolean arg1) {
  }

  @Override
  public byte[] serialize(String topic, T msg) {
    try {
      byte[] result = null;

      if (msg != null) {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BinaryEncoder binaryEncoder =
            EncoderFactory.get().binaryEncoder(byteArrayOutputStream, null);

        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(msg.getSchema());
        datumWriter.write(msg, binaryEncoder);

        binaryEncoder.flush();
        byteArrayOutputStream.close();

        result = byteArrayOutputStream.toByteArray();
      }
      return result;
    } catch (IOException e) {
      throw new SerializationException(
          "Serialization exception for Event Message:" + msg + "' for topic='" + topic + "'", e);
    }
  }
}