package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NumberSerializers {

    public static abstract class Base<T> extends StdScalarSerializer<T> {
        protected final boolean _isInt;
        protected final JsonParser$NumberType _numberType;
        protected final String _schemaType;

        public Base(Class<?> cls, JsonParser$NumberType jsonParser$NumberType, String str) {
            super(cls, false);
            this._numberType = jsonParser$NumberType;
            this._schemaType = str;
            this._isInt = jsonParser$NumberType == JsonParser$NumberType.INT || jsonParser$NumberType == JsonParser$NumberType.LONG || jsonParser$NumberType == JsonParser$NumberType.BIG_INTEGER;
        }
    }

    public static class DoubleSerializer extends Base<Object> {
        public DoubleSerializer(Class<?> cls) {
            super(cls, JsonParser$NumberType.DOUBLE, "number");
        }
    }

    public static class FloatSerializer extends Base<Object> {
        static final FloatSerializer instance = new FloatSerializer();

        public FloatSerializer() {
            super(Float.class, JsonParser$NumberType.FLOAT, "number");
        }
    }

    public static class IntLikeSerializer extends Base<Object> {
        static final IntLikeSerializer instance = new IntLikeSerializer();

        public IntLikeSerializer() {
            super(Number.class, JsonParser$NumberType.INT, "integer");
        }
    }

    public static class IntegerSerializer extends Base<Object> {
        public IntegerSerializer(Class<?> cls) {
            super(cls, JsonParser$NumberType.INT, "integer");
        }
    }

    public static class LongSerializer extends Base<Object> {
        public LongSerializer(Class<?> cls) {
            super(cls, JsonParser$NumberType.LONG, "number");
        }
    }

    public static class ShortSerializer extends Base<Object> {
        static final ShortSerializer instance = new ShortSerializer();

        public ShortSerializer() {
            super(Short.class, JsonParser$NumberType.INT, "number");
        }
    }

    public static void addAll(Map<String, JsonSerializer<?>> map) {
        map.put(Integer.class.getName(), new IntegerSerializer(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new IntegerSerializer(cls));
        map.put(Long.class.getName(), new LongSerializer(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new LongSerializer(cls2));
        String name = Byte.class.getName();
        IntLikeSerializer intLikeSerializer = IntLikeSerializer.instance;
        map.put(name, intLikeSerializer);
        map.put(Byte.TYPE.getName(), intLikeSerializer);
        String name2 = Short.class.getName();
        ShortSerializer shortSerializer = ShortSerializer.instance;
        map.put(name2, shortSerializer);
        map.put(Short.TYPE.getName(), shortSerializer);
        map.put(Double.class.getName(), new DoubleSerializer(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new DoubleSerializer(cls3));
        String name3 = Float.class.getName();
        FloatSerializer floatSerializer = FloatSerializer.instance;
        map.put(name3, floatSerializer);
        map.put(Float.TYPE.getName(), floatSerializer);
    }
}
