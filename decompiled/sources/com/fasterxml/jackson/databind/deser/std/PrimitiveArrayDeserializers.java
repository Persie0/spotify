package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.NullValueProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> {
    protected final NullValueProvider _nuller;
    protected final Boolean _unwrapSingle;

    public static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        public BooleanDeser() {
            super(boolean[].class);
        }
    }

    public static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        public ByteDeser() {
            super(byte[].class);
        }
    }

    public static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        public CharDeser() {
            super(char[].class);
        }
    }

    public static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        public DoubleDeser() {
            super(double[].class);
        }
    }

    public static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        public FloatDeser() {
            super(float[].class);
        }
    }

    public static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser instance = new IntDeser();

        public IntDeser() {
            super(int[].class);
        }
    }

    public static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser instance = new LongDeser();

        public LongDeser() {
            super(long[].class);
        }
    }

    public static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        public ShortDeser() {
            super(short[].class);
        }
    }

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super(cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }
}
