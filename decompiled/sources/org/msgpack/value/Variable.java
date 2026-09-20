package org.msgpack.value;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeCastException;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;

/* JADX INFO: loaded from: classes16.dex */
public class Variable implements Value {
    private static final long BYTE_MAX = 127;
    private static final long BYTE_MIN = -128;
    private static final long INT_MAX = 2147483647L;
    private static final long INT_MIN = -2147483648L;
    private static final long SHORT_MAX = 32767;
    private static final long SHORT_MIN = -32768;
    private AbstractValueAccessor accessor;
    private final ArrayValueAccessor arrayAccessor;
    private final BinaryValueAccessor binaryAccessor;
    private final BooleanValueAccessor booleanAccessor;
    private double doubleValue;
    private final ExtensionValueAccessor extensionAccessor;
    private final FloatValueAccessor floatAccessor;
    private final IntegerValueAccessor integerAccessor;
    private long longValue;
    private final MapValueAccessor mapAccessor;
    private final NilValueAccessor nilAccessor;
    private Object objectValue;
    private final StringValueAccessor stringAccessor;
    private Type type;
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);

    public abstract class AbstractNumberValueAccessor extends AbstractValueAccessor implements NumberValue {
        private AbstractNumberValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public NumberValue asNumberValue() {
            return this;
        }

        @Override // org.msgpack.value.NumberValue
        public BigInteger toBigInteger() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return (BigInteger) Variable.this.objectValue;
            }
            return Variable.this.type == Type.DOUBLE ? new BigDecimal(Variable.this.doubleValue).toBigInteger() : BigInteger.valueOf(Variable.this.longValue);
        }

        @Override // org.msgpack.value.NumberValue
        public byte toByte() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).byteValue() : (byte) Variable.this.longValue;
        }

        @Override // org.msgpack.value.NumberValue
        public double toDouble() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.objectValue).doubleValue();
            }
            return Variable.this.type == Type.DOUBLE ? Variable.this.doubleValue : Variable.this.longValue;
        }

        @Override // org.msgpack.value.NumberValue
        public float toFloat() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.objectValue).floatValue();
            }
            return Variable.this.type == Type.DOUBLE ? (float) Variable.this.doubleValue : Variable.this.longValue;
        }

        @Override // org.msgpack.value.NumberValue
        public int toInt() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).intValue() : (int) Variable.this.longValue;
        }

        @Override // org.msgpack.value.NumberValue
        public long toLong() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).longValue() : Variable.this.longValue;
        }

        @Override // org.msgpack.value.NumberValue
        public short toShort() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).shortValue() : (short) Variable.this.longValue;
        }
    }

    public abstract class AbstractRawValueAccessor extends AbstractValueAccessor implements RawValue {
        private AbstractRawValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.RawValue
        public byte[] asByteArray() {
            return (byte[]) Variable.this.objectValue;
        }

        @Override // org.msgpack.value.RawValue
        public ByteBuffer asByteBuffer() {
            return ByteBuffer.wrap(asByteArray());
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public RawValue asRawValue() {
            return this;
        }

        @Override // org.msgpack.value.RawValue
        public String asString() {
            byte[] bArr = (byte[]) Variable.this.objectValue;
            try {
                CharsetDecoder charsetDecoderNewDecoder = MessagePack.UTF8.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.RawValue
        public String toString() {
            byte[] bArr = (byte[]) Variable.this.objectValue;
            try {
                CharsetDecoder charsetDecoderNewDecoder = MessagePack.UTF8.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
    }

    public abstract class AbstractValueAccessor implements Value {
        private AbstractValueAccessor() {
        }

        @Override // org.msgpack.value.Value
        public ArrayValue asArrayValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public BinaryValue asBinaryValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public BooleanValue asBooleanValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public ExtensionValue asExtensionValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public FloatValue asFloatValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public IntegerValue asIntegerValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public MapValue asMapValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public NilValue asNilValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public NumberValue asNumberValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public RawValue asRawValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public StringValue asStringValue() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.Value
        public boolean equals(Object obj) {
            return Variable.this.equals(obj);
        }

        public int hashCode() {
            return Variable.this.hashCode();
        }

        @Override // org.msgpack.value.Value
        public boolean isArrayValue() {
            return getValueType().isArrayType();
        }

        @Override // org.msgpack.value.Value
        public boolean isBinaryValue() {
            return getValueType().isBinaryType();
        }

        @Override // org.msgpack.value.Value
        public boolean isBooleanValue() {
            return getValueType().isBooleanType();
        }

        @Override // org.msgpack.value.Value
        public boolean isExtensionValue() {
            return getValueType().isExtensionType();
        }

        @Override // org.msgpack.value.Value
        public boolean isFloatValue() {
            return getValueType().isFloatType();
        }

        @Override // org.msgpack.value.Value
        public boolean isIntegerValue() {
            return getValueType().isIntegerType();
        }

        @Override // org.msgpack.value.Value
        public boolean isMapValue() {
            return getValueType().isMapType();
        }

        @Override // org.msgpack.value.Value
        public boolean isNilValue() {
            return getValueType().isNilType();
        }

        @Override // org.msgpack.value.Value
        public boolean isNumberValue() {
            return getValueType().isNumberType();
        }

        @Override // org.msgpack.value.Value
        public boolean isRawValue() {
            return getValueType().isRawType();
        }

        @Override // org.msgpack.value.Value
        public boolean isStringValue() {
            return getValueType().isStringType();
        }

        @Override // org.msgpack.value.Value
        public String toJson() {
            return Variable.this.toJson();
        }

        public String toString() {
            return Variable.this.toString();
        }
    }

    public class ArrayValueAccessor extends AbstractValueAccessor implements ArrayValue {
        private ArrayValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public ArrayValue asArrayValue() {
            return this;
        }

        @Override // org.msgpack.value.ArrayValue
        public Value get(int i) {
            return list().get(i);
        }

        @Override // org.msgpack.value.ArrayValue
        public Value getOrNilValue(int i) {
            List<Value> list = list();
            return (list.size() >= i || i < 0) ? list.get(i) : ValueFactory.newNil();
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.ARRAY;
        }

        @Override // org.msgpack.value.ArrayValue, java.lang.Iterable
        public Iterator<Value> iterator() {
            return list().iterator();
        }

        @Override // org.msgpack.value.ArrayValue
        public List<Value> list() {
            return (List) Variable.this.objectValue;
        }

        @Override // org.msgpack.value.ArrayValue
        public int size() {
            return list().size();
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            List<Value> list = list();
            messagePacker.packArrayHeader(list.size());
            Iterator<Value> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeTo(messagePacker);
            }
        }

        @Override // org.msgpack.value.Value
        public ImmutableArrayValue immutableValue() {
            return ValueFactory.newArray(list());
        }
    }

    public class BinaryValueAccessor extends AbstractRawValueAccessor implements BinaryValue {
        private BinaryValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public BinaryValue asBinaryValue() {
            return this;
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.BINARY;
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            byte[] bArr = (byte[]) Variable.this.objectValue;
            messagePacker.packBinaryHeader(bArr.length);
            messagePacker.writePayload(bArr);
        }

        @Override // org.msgpack.value.Value
        public ImmutableBinaryValue immutableValue() {
            return ValueFactory.newBinary(asByteArray());
        }
    }

    public class BooleanValueAccessor extends AbstractValueAccessor implements BooleanValue {
        private BooleanValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public BooleanValue asBooleanValue() {
            return this;
        }

        @Override // org.msgpack.value.BooleanValue
        public boolean getBoolean() {
            return Variable.this.longValue == 1;
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.BOOLEAN;
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            messagePacker.packBoolean(Variable.this.longValue == 1);
        }

        @Override // org.msgpack.value.Value
        public ImmutableBooleanValue immutableValue() {
            return ValueFactory.newBoolean(getBoolean());
        }
    }

    public class ExtensionValueAccessor extends AbstractValueAccessor implements ExtensionValue {
        private ExtensionValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public ExtensionValue asExtensionValue() {
            return this;
        }

        @Override // org.msgpack.value.ExtensionValue
        public byte[] getData() {
            return ((ImmutableExtensionValue) Variable.this.objectValue).getData();
        }

        @Override // org.msgpack.value.ExtensionValue
        public byte getType() {
            return ((ImmutableExtensionValue) Variable.this.objectValue).getType();
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.EXTENSION;
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            ((ImmutableExtensionValue) Variable.this.objectValue).writeTo(messagePacker);
        }

        @Override // org.msgpack.value.Value
        public ImmutableExtensionValue immutableValue() {
            return (ImmutableExtensionValue) Variable.this.objectValue;
        }
    }

    public class FloatValueAccessor extends AbstractNumberValueAccessor implements FloatValue {
        private FloatValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public FloatValue asFloatValue() {
            return this;
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.FLOAT;
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            messagePacker.packDouble(Variable.this.doubleValue);
        }

        @Override // org.msgpack.value.Value
        public ImmutableFloatValue immutableValue() {
            return ValueFactory.newFloat(Variable.this.doubleValue);
        }
    }

    public class IntegerValueAccessor extends AbstractNumberValueAccessor implements IntegerValue {
        private IntegerValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.IntegerValue
        public BigInteger asBigInteger() {
            return Variable.this.type == Type.BIG_INTEGER ? (BigInteger) Variable.this.objectValue : BigInteger.valueOf(Variable.this.longValue);
        }

        @Override // org.msgpack.value.IntegerValue
        public byte asByte() {
            if (isInByteRange()) {
                return (byte) Variable.this.longValue;
            }
            throw new MessageIntegerOverflowException(Variable.this.longValue);
        }

        @Override // org.msgpack.value.IntegerValue
        public int asInt() {
            if (isInIntRange()) {
                return (int) Variable.this.longValue;
            }
            throw new MessageIntegerOverflowException(Variable.this.longValue);
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public IntegerValue asIntegerValue() {
            return this;
        }

        @Override // org.msgpack.value.IntegerValue
        public long asLong() {
            if (isInLongRange()) {
                return Variable.this.longValue;
            }
            throw new MessageIntegerOverflowException(Variable.this.longValue);
        }

        @Override // org.msgpack.value.IntegerValue
        public short asShort() {
            if (isInByteRange()) {
                return (short) Variable.this.longValue;
            }
            throw new MessageIntegerOverflowException(Variable.this.longValue);
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.INTEGER;
        }

        @Override // org.msgpack.value.IntegerValue
        public boolean isInByteRange() {
            return Variable.this.type != Type.BIG_INTEGER && Variable.BYTE_MIN <= Variable.this.longValue && Variable.this.longValue <= Variable.BYTE_MAX;
        }

        @Override // org.msgpack.value.IntegerValue
        public boolean isInIntRange() {
            return Variable.this.type != Type.BIG_INTEGER && Variable.INT_MIN <= Variable.this.longValue && Variable.this.longValue <= Variable.INT_MAX;
        }

        @Override // org.msgpack.value.IntegerValue
        public boolean isInLongRange() {
            return Variable.this.type != Type.BIG_INTEGER;
        }

        @Override // org.msgpack.value.IntegerValue
        public boolean isInShortRange() {
            return Variable.this.type != Type.BIG_INTEGER && Variable.SHORT_MIN <= Variable.this.longValue && Variable.this.longValue <= Variable.SHORT_MAX;
        }

        @Override // org.msgpack.value.IntegerValue
        public MessageFormat mostSuccinctMessageFormat() {
            return ImmutableBigIntegerValueImpl.mostSuccinctMessageFormat(this);
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            if (Variable.this.type == Type.BIG_INTEGER) {
                messagePacker.packBigInteger((BigInteger) Variable.this.objectValue);
            } else {
                messagePacker.packLong(Variable.this.longValue);
            }
        }

        @Override // org.msgpack.value.Value
        public ImmutableIntegerValue immutableValue() {
            return Variable.this.type == Type.BIG_INTEGER ? ValueFactory.newInteger((BigInteger) Variable.this.objectValue) : ValueFactory.newInteger(Variable.this.longValue);
        }
    }

    public class MapValueAccessor extends AbstractValueAccessor implements MapValue {
        private MapValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public MapValue asMapValue() {
            return this;
        }

        @Override // org.msgpack.value.MapValue
        public Set<Map.Entry<Value, Value>> entrySet() {
            return map().entrySet();
        }

        @Override // org.msgpack.value.MapValue
        public Value[] getKeyValueArray() {
            Map<Value, Value> map = map();
            Value[] valueArr = new Value[map.size() * 2];
            int i = 0;
            for (Map.Entry<Value, Value> entry : map.entrySet()) {
                valueArr[i] = entry.getKey();
                valueArr[i + 1] = entry.getValue();
                i += 2;
            }
            return valueArr;
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.MAP;
        }

        @Override // org.msgpack.value.MapValue
        public Set<Value> keySet() {
            return map().keySet();
        }

        @Override // org.msgpack.value.MapValue
        public Map<Value, Value> map() {
            return (Map) Variable.this.objectValue;
        }

        @Override // org.msgpack.value.MapValue
        public int size() {
            return map().size();
        }

        @Override // org.msgpack.value.MapValue
        public Collection<Value> values() {
            return map().values();
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            Map<Value, Value> map = map();
            messagePacker.packArrayHeader(map.size());
            for (Map.Entry<Value, Value> entry : map.entrySet()) {
                entry.getKey().writeTo(messagePacker);
                entry.getValue().writeTo(messagePacker);
            }
        }

        @Override // org.msgpack.value.Value
        public ImmutableMapValue immutableValue() {
            return ValueFactory.newMap(map());
        }
    }

    public class NilValueAccessor extends AbstractValueAccessor implements NilValue {
        private NilValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public NilValue asNilValue() {
            return this;
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.NIL;
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            messagePacker.packNil();
        }

        @Override // org.msgpack.value.Value
        public ImmutableNilValue immutableValue() {
            return ValueFactory.newNil();
        }
    }

    public class StringValueAccessor extends AbstractRawValueAccessor implements StringValue {
        private StringValueAccessor() {
            super();
        }

        @Override // org.msgpack.value.Variable.AbstractValueAccessor, org.msgpack.value.Value
        public StringValue asStringValue() {
            return this;
        }

        @Override // org.msgpack.value.Value
        public ValueType getValueType() {
            return ValueType.STRING;
        }

        @Override // org.msgpack.value.Value
        public void writeTo(MessagePacker messagePacker) {
            byte[] bArr = (byte[]) Variable.this.objectValue;
            messagePacker.packRawStringHeader(bArr.length);
            messagePacker.writePayload(bArr);
        }

        @Override // org.msgpack.value.Value
        public ImmutableStringValue immutableValue() {
            return ValueFactory.newString((byte[]) Variable.this.objectValue);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LONG' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BIG_INTEGER;
        public static final Type BOOLEAN;
        public static final Type BYTE_ARRAY;
        public static final Type DOUBLE;
        public static final Type EXTENSION;
        public static final Type LIST;
        public static final Type LONG;
        public static final Type MAP;
        public static final Type NULL;
        public static final Type RAW_STRING;
        private final ValueType valueType;

        static {
            Type type = new Type("NULL", 0, ValueType.NIL);
            NULL = type;
            Type type2 = new Type("BOOLEAN", 1, ValueType.BOOLEAN);
            BOOLEAN = type2;
            ValueType valueType = ValueType.INTEGER;
            Type type3 = new Type("LONG", 2, valueType);
            LONG = type3;
            Type type4 = new Type("BIG_INTEGER", 3, valueType);
            BIG_INTEGER = type4;
            Type type5 = new Type("DOUBLE", 4, ValueType.FLOAT);
            DOUBLE = type5;
            Type type6 = new Type("BYTE_ARRAY", 5, ValueType.BINARY);
            BYTE_ARRAY = type6;
            Type type7 = new Type("RAW_STRING", 6, ValueType.STRING);
            RAW_STRING = type7;
            Type type8 = new Type("LIST", 7, ValueType.ARRAY);
            LIST = type8;
            Type type9 = new Type("MAP", 8, ValueType.MAP);
            MAP = type9;
            Type type10 = new Type("EXTENSION", 9, ValueType.EXTENSION);
            EXTENSION = type10;
            $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9, type10};
        }

        private Type(String str, int i, ValueType valueType) {
            super(str, i);
            this.valueType = valueType;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public ValueType getValueType() {
            return this.valueType;
        }
    }

    public Variable() {
        this.nilAccessor = new NilValueAccessor();
        this.booleanAccessor = new BooleanValueAccessor();
        this.integerAccessor = new IntegerValueAccessor();
        this.floatAccessor = new FloatValueAccessor();
        this.binaryAccessor = new BinaryValueAccessor();
        this.stringAccessor = new StringValueAccessor();
        this.arrayAccessor = new ArrayValueAccessor();
        this.mapAccessor = new MapValueAccessor();
        this.extensionAccessor = new ExtensionValueAccessor();
        setNilValue();
    }

    @Override // org.msgpack.value.Value
    public ArrayValue asArrayValue() {
        if (isArrayValue()) {
            return (ArrayValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public BinaryValue asBinaryValue() {
        if (isBinaryValue()) {
            return (BinaryValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public BooleanValue asBooleanValue() {
        if (isBooleanValue()) {
            return (BooleanValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public ExtensionValue asExtensionValue() {
        if (isExtensionValue()) {
            return (ExtensionValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public FloatValue asFloatValue() {
        if (isFloatValue()) {
            return (FloatValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public IntegerValue asIntegerValue() {
        if (isIntegerValue()) {
            return (IntegerValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public MapValue asMapValue() {
        if (isMapValue()) {
            return (MapValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public NilValue asNilValue() {
        if (isNilValue()) {
            return (NilValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public NumberValue asNumberValue() {
        if (isNumberValue()) {
            return (NumberValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public RawValue asRawValue() {
        if (isRawValue()) {
            return (RawValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public StringValue asStringValue() {
        if (isStringValue()) {
            return (StringValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.Value
    public boolean equals(Object obj) {
        return immutableValue().equals(obj);
    }

    @Override // org.msgpack.value.Value
    public ValueType getValueType() {
        return this.type.getValueType();
    }

    public int hashCode() {
        return immutableValue().hashCode();
    }

    @Override // org.msgpack.value.Value
    public ImmutableValue immutableValue() {
        return this.accessor.immutableValue();
    }

    @Override // org.msgpack.value.Value
    public boolean isArrayValue() {
        return getValueType().isArrayType();
    }

    @Override // org.msgpack.value.Value
    public boolean isBinaryValue() {
        return getValueType().isBinaryType();
    }

    @Override // org.msgpack.value.Value
    public boolean isBooleanValue() {
        return getValueType().isBooleanType();
    }

    @Override // org.msgpack.value.Value
    public boolean isExtensionValue() {
        return getValueType().isExtensionType();
    }

    @Override // org.msgpack.value.Value
    public boolean isFloatValue() {
        return getValueType().isFloatType();
    }

    @Override // org.msgpack.value.Value
    public boolean isIntegerValue() {
        return getValueType().isIntegerType();
    }

    @Override // org.msgpack.value.Value
    public boolean isMapValue() {
        return getValueType().isMapType();
    }

    @Override // org.msgpack.value.Value
    public boolean isNilValue() {
        return getValueType().isNilType();
    }

    @Override // org.msgpack.value.Value
    public boolean isNumberValue() {
        return getValueType().isNumberType();
    }

    @Override // org.msgpack.value.Value
    public boolean isRawValue() {
        return getValueType().isRawType();
    }

    @Override // org.msgpack.value.Value
    public boolean isStringValue() {
        return getValueType().isStringType();
    }

    public Variable setArrayValue(List<Value> list) {
        this.type = Type.LIST;
        this.accessor = this.arrayAccessor;
        this.objectValue = list;
        return this;
    }

    public Variable setBinaryValue(byte[] bArr) {
        this.type = Type.BYTE_ARRAY;
        this.accessor = this.binaryAccessor;
        this.objectValue = bArr;
        return this;
    }

    public Variable setBooleanValue(boolean z) {
        this.type = Type.BOOLEAN;
        this.accessor = this.booleanAccessor;
        this.longValue = z ? 1L : 0L;
        return this;
    }

    public Variable setExtensionValue(byte b, byte[] bArr) {
        this.type = Type.EXTENSION;
        this.accessor = this.extensionAccessor;
        this.objectValue = ValueFactory.newExtension(b, bArr);
        return this;
    }

    public Variable setFloatValue(double d) {
        this.type = Type.DOUBLE;
        this.accessor = this.floatAccessor;
        this.doubleValue = d;
        this.longValue = (long) d;
        return this;
    }

    public Variable setIntegerValue(long j) {
        this.type = Type.LONG;
        this.accessor = this.integerAccessor;
        this.longValue = j;
        return this;
    }

    public Variable setMapValue(Map<Value, Value> map) {
        this.type = Type.MAP;
        this.accessor = this.mapAccessor;
        this.objectValue = map;
        return this;
    }

    public Variable setNilValue() {
        this.type = Type.NULL;
        this.accessor = this.nilAccessor;
        return this;
    }

    public Variable setStringValue(String str) {
        return setStringValue(str.getBytes(MessagePack.UTF8));
    }

    @Override // org.msgpack.value.Value
    public String toJson() {
        return immutableValue().toJson();
    }

    public String toString() {
        return immutableValue().toString();
    }

    @Override // org.msgpack.value.Value
    public void writeTo(MessagePacker messagePacker) {
        this.accessor.writeTo(messagePacker);
    }

    public Variable setStringValue(byte[] bArr) {
        this.type = Type.RAW_STRING;
        this.accessor = this.stringAccessor;
        this.objectValue = bArr;
        return this;
    }

    public Variable setIntegerValue(BigInteger bigInteger) {
        if (bigInteger.compareTo(LONG_MIN) >= 0 && bigInteger.compareTo(LONG_MAX) <= 0) {
            this.type = Type.LONG;
            this.accessor = this.integerAccessor;
            this.longValue = bigInteger.longValue();
            return this;
        }
        this.type = Type.BIG_INTEGER;
        this.accessor = this.integerAccessor;
        this.objectValue = bigInteger;
        return this;
    }

    public Variable setFloatValue(float f) {
        this.type = Type.DOUBLE;
        this.accessor = this.floatAccessor;
        this.longValue = (long) f;
        return this;
    }
}
