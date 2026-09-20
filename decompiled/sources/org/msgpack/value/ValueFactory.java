package org.msgpack.value;

import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.value.impl.ImmutableArrayValueImpl;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;
import org.msgpack.value.impl.ImmutableBinaryValueImpl;
import org.msgpack.value.impl.ImmutableBooleanValueImpl;
import org.msgpack.value.impl.ImmutableDoubleValueImpl;
import org.msgpack.value.impl.ImmutableExtensionValueImpl;
import org.msgpack.value.impl.ImmutableLongValueImpl;
import org.msgpack.value.impl.ImmutableMapValueImpl;
import org.msgpack.value.impl.ImmutableNilValueImpl;
import org.msgpack.value.impl.ImmutableStringValueImpl;

/* JADX INFO: loaded from: classes16.dex */
public final class ValueFactory {

    public static class MapBuilder {
        private final Map<Value, Value> map = new LinkedHashMap();

        public MapValue build() {
            return ValueFactory.newMap(this.map);
        }

        public MapBuilder put(Map.Entry<? extends Value, ? extends Value> entry) {
            put(entry.getKey(), entry.getValue());
            return this;
        }

        public MapBuilder putAll(Iterable<? extends Map.Entry<? extends Value, ? extends Value>> iterable) {
            for (Map.Entry<? extends Value, ? extends Value> entry : iterable) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public MapBuilder put(Value value, Value value2) {
            this.map.put(value, value2);
            return this;
        }

        public MapBuilder putAll(Map<? extends Value, ? extends Value> map) {
            Iterator<Map.Entry<? extends Value, ? extends Value>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }
    }

    private ValueFactory() {
    }

    public static ImmutableArrayValue emptyArray() {
        return ImmutableArrayValueImpl.empty();
    }

    public static ImmutableMapValue emptyMap() {
        return ImmutableMapValueImpl.empty();
    }

    public static ImmutableArrayValue newArray(List<? extends Value> list) {
        return list.isEmpty() ? ImmutableArrayValueImpl.empty() : new ImmutableArrayValueImpl((Value[]) list.toArray(new Value[list.size()]));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr) {
        return newBinary(bArr, false);
    }

    public static ImmutableBooleanValue newBoolean(boolean z) {
        return z ? ImmutableBooleanValueImpl.TRUE : ImmutableBooleanValueImpl.FALSE;
    }

    public static ImmutableExtensionValue newExtension(byte b, byte[] bArr) {
        return new ImmutableExtensionValueImpl(b, bArr);
    }

    public static ImmutableFloatValue newFloat(float f) {
        return new ImmutableDoubleValueImpl(f);
    }

    public static ImmutableIntegerValue newInteger(byte b) {
        return new ImmutableLongValueImpl(b);
    }

    public static <K extends Value, V extends Value> ImmutableMapValue newMap(Map<K, V> map) {
        Value[] valueArr = new Value[map.size() * 2];
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            valueArr[i] = entry.getKey();
            valueArr[i + 1] = entry.getValue();
            i += 2;
        }
        return new ImmutableMapValueImpl(valueArr);
    }

    public static MapBuilder newMapBuilder() {
        return new MapBuilder();
    }

    public static Map.Entry<Value, Value> newMapEntry(Value value, Value value2) {
        return new AbstractMap.SimpleEntry(value, value2);
    }

    public static ImmutableNilValue newNil() {
        return ImmutableNilValueImpl.get();
    }

    public static ImmutableStringValue newString(String str) {
        return new ImmutableStringValueImpl(str);
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, boolean z) {
        return z ? new ImmutableBinaryValueImpl(bArr) : new ImmutableBinaryValueImpl(Arrays.copyOf(bArr, bArr.length));
    }

    public static ImmutableFloatValue newFloat(double d) {
        return new ImmutableDoubleValueImpl(d);
    }

    public static ImmutableIntegerValue newInteger(short s) {
        return new ImmutableLongValueImpl(s);
    }

    public static ImmutableStringValue newString(byte[] bArr) {
        return new ImmutableStringValueImpl(bArr);
    }

    public static ImmutableIntegerValue newInteger(int i) {
        return new ImmutableLongValueImpl(i);
    }

    public static ImmutableStringValue newString(byte[] bArr, boolean z) {
        if (z) {
            return new ImmutableStringValueImpl(bArr);
        }
        return new ImmutableStringValueImpl(Arrays.copyOf(bArr, bArr.length));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, int i, int i2) {
        return newBinary(bArr, i, i2, false);
    }

    public static ImmutableIntegerValue newInteger(long j) {
        return new ImmutableLongValueImpl(j);
    }

    public static ImmutableArrayValue newArray(Value... valueArr) {
        if (valueArr.length == 0) {
            return ImmutableArrayValueImpl.empty();
        }
        return new ImmutableArrayValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, int i, int i2, boolean z) {
        if (z && i == 0 && i2 == bArr.length) {
            return new ImmutableBinaryValueImpl(bArr);
        }
        return new ImmutableBinaryValueImpl(Arrays.copyOfRange(bArr, i, i2));
    }

    public static ImmutableIntegerValue newInteger(BigInteger bigInteger) {
        return new ImmutableBigIntegerValueImpl(bigInteger);
    }

    public static ImmutableStringValue newString(byte[] bArr, int i, int i2) {
        return newString(bArr, i, i2, false);
    }

    public static ImmutableMapValue newMap(Value... valueArr) {
        if (valueArr.length == 0) {
            return ImmutableMapValueImpl.empty();
        }
        return new ImmutableMapValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableStringValue newString(byte[] bArr, int i, int i2, boolean z) {
        if (z && i == 0 && i2 == bArr.length) {
            return new ImmutableStringValueImpl(bArr);
        }
        return new ImmutableStringValueImpl(Arrays.copyOfRange(bArr, i, i2));
    }

    public static ImmutableArrayValue newArray(Value[] valueArr, boolean z) {
        if (valueArr.length == 0) {
            return ImmutableArrayValueImpl.empty();
        }
        if (z) {
            return new ImmutableArrayValueImpl(valueArr);
        }
        return new ImmutableArrayValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableMapValue newMap(Value[] valueArr, boolean z) {
        if (valueArr.length == 0) {
            return ImmutableMapValueImpl.empty();
        }
        if (z) {
            return new ImmutableMapValueImpl(valueArr);
        }
        return new ImmutableMapValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static MapValue newMap(Map.Entry<? extends Value, ? extends Value>... entryArr) {
        Value[] valueArr = new Value[entryArr.length * 2];
        for (int i = 0; i < entryArr.length; i += 2) {
            int i2 = i * 2;
            valueArr[i2] = entryArr[i].getKey();
            valueArr[i2 + 1] = entryArr[i].getValue();
        }
        return newMap(valueArr, true);
    }
}
