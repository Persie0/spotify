package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    public static class Std extends FromStringDeserializer<Object> {
    }

    public static class StringBufferDeserializer extends FromStringDeserializer<Object> {
        public StringBufferDeserializer() {
            super(StringBuffer.class);
        }
    }

    public static class StringBuilderDeserializer extends FromStringDeserializer<Object> {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }
    }

    public FromStringDeserializer(Class<?> cls) {
        super(cls);
    }
}
