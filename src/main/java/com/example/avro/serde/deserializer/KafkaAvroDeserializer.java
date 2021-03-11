package com.example.avro.serde.deserializer;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;
import java.util.Arrays;


public class KafkaAvroDeserializer<T extends SpecificRecordBase> implements Deserializer<T> {

  private static final Logger logger = LoggerFactory.getLogger(KafkaAvroDeserializer.class);

  protected final Class<T> targetType;

  public KafkaAvroDeserializer(Class<T> targetType) {
    this.targetType = targetType;
  }

  @Override
  public void close() {
  }

  @Override
  public void configure(Map<String, ?> arg0, boolean arg1) {
  }

  @SuppressWarnings("unchecked")
  @Override
  public T deserialize(String topic, byte[] msg) {
    try {
      T result = null;
      if (msg != null) {
        DatumReader<GenericRecord> datumReader =
            new SpecificDatumReader<>(targetType.newInstance().getSchema());
        Decoder decoder = DecoderFactory.get().binaryDecoder(msg, null);
        result = (T) datumReader.read(null, decoder);
      }
      return result;
    } catch (Exception ex) {
      throw new SerializationException(
          "Deserialize exception for Event Message: '" + Arrays.toString(msg) + "' from topic '" + topic + "'", ex);
    }
  }
}

