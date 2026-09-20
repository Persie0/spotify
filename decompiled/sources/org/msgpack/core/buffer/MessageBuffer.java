package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.msgpack.core.Preconditions;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a A[Catch: all -> 0x003e, Exception -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x003e, blocks: (B:6:0x0024, B:19:0x004b, B:36:0x008a, B:65:0x010e, B:17:0x0045), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[Catch: all -> 0x00bc, Exception -> 0x00c0, TRY_ENTER, TryCatch #11 {Exception -> 0x00c0, all -> 0x00bc, blocks: (B:38:0x009e, B:41:0x00aa, B:42:0x00bb, B:47:0x00c3, B:48:0x00ca), top: B:95:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa A[Catch: all -> 0x00bc, Exception -> 0x00c0, TryCatch #11 {Exception -> 0x00c0, all -> 0x00bc, blocks: (B:38:0x009e, B:41:0x00aa, B:42:0x00bb, B:47:0x00c3, B:48:0x00ca), top: B:95:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3 A[Catch: all -> 0x00bc, Exception -> 0x00c0, TryCatch #11 {Exception -> 0x00c0, all -> 0x00bc, blocks: (B:38:0x009e, B:41:0x00aa, B:42:0x00bb, B:47:0x00c3, B:48:0x00ca), top: B:95:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00aa, please report this as an issue */
    static {
        boolean z;
        boolean z2;
        boolean z3;
        Unsafe unsafe2;
        int iArrayIndexScale;
        String str = BIGENDIAN_MESSAGE_BUFFER;
        Class cls = Integer.TYPE;
        String str2 = UNIVERSAL_MESSAGE_BUFFER;
        Unsafe unsafe3 = null;
        boolean z4 = false;
        int iArrayBaseOffset = 16;
        try {
            try {
                String property = System.getProperty("java.specification.version", "");
                int iIndexOf = property.indexOf(46);
                try {
                    try {
                        if (iIndexOf != -1) {
                            try {
                                try {
                                    int i = Integer.parseInt(property.substring(0, iIndexOf));
                                    int i2 = Integer.parseInt(property.substring(iIndexOf + 1));
                                    if (i > 1 || (i == 1 && i2 >= 7)) {
                                        z = true;
                                    }
                                } catch (NumberFormatException e) {
                                    e.printStackTrace(System.err);
                                }
                                Class.forName("sun.misc.Unsafe");
                                z2 = true;
                                boolean zContains = System.getProperty("java.runtime.name", "").toLowerCase().contains("android");
                                if (System.getProperty("com.google.appengine.runtime.version") != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false")) && !zContains && !z3 && z && z2) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (!z4) {
                                    Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                                    declaredField.setAccessible(true);
                                    unsafe2 = (Unsafe) declaredField.get(null);
                                    try {
                                        if (unsafe2 != null) {
                                            throw new RuntimeException("Unsafe is unavailable");
                                        }
                                        iArrayBaseOffset = unsafe2.arrayBaseOffset(byte[].class);
                                        iArrayIndexScale = unsafe2.arrayIndexScale(byte[].class);
                                        if (iArrayIndexScale == 1) {
                                            throw new IllegalStateException("Byte array index scale must be 1, but is " + iArrayIndexScale);
                                        }
                                        unsafe3 = unsafe2;
                                    } catch (Exception e2) {
                                        e = e2;
                                        unsafe3 = unsafe2;
                                        e.printStackTrace(System.err);
                                        unsafe = unsafe3;
                                        ARRAY_BYTE_BASE_OFFSET = 16;
                                        isUniversalBuffer = true;
                                        try {
                                            Class<?> cls2 = Class.forName(UNIVERSAL_MESSAGE_BUFFER);
                                            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(byte[].class, cls, cls);
                                            declaredConstructor.setAccessible(true);
                                            mbArrConstructor = declaredConstructor;
                                            Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(ByteBuffer.class);
                                            declaredConstructor2.setAccessible(true);
                                            mbBBConstructor = declaredConstructor2;
                                            return;
                                        } catch (Exception e3) {
                                            e3.printStackTrace(System.err);
                                            throw new RuntimeException(e3);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        unsafe3 = unsafe2;
                                        unsafe = unsafe3;
                                        ARRAY_BYTE_BASE_OFFSET = 16;
                                        isUniversalBuffer = z4;
                                        if (!z4) {
                                            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                                                str = DEFAULT_MESSAGE_BUFFER;
                                            }
                                            str2 = str;
                                        }
                                        try {
                                            Class<?> cls3 = Class.forName(str2);
                                            Constructor<?> declaredConstructor3 = cls3.getDeclaredConstructor(byte[].class, cls, cls);
                                            declaredConstructor3.setAccessible(true);
                                            mbArrConstructor = declaredConstructor3;
                                            Constructor<?> declaredConstructor4 = cls3.getDeclaredConstructor(ByteBuffer.class);
                                            declaredConstructor4.setAccessible(true);
                                            mbBBConstructor = declaredConstructor4;
                                            throw th;
                                        } catch (Exception e4) {
                                            e4.printStackTrace(System.err);
                                            throw new RuntimeException(e4);
                                        }
                                    }
                                }
                                unsafe = unsafe3;
                                ARRAY_BYTE_BASE_OFFSET = iArrayBaseOffset;
                                isUniversalBuffer = z4;
                                if (!z4) {
                                    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                                        str = DEFAULT_MESSAGE_BUFFER;
                                    }
                                    str2 = str;
                                }
                                Class<?> cls4 = Class.forName(str2);
                                Constructor<?> declaredConstructor5 = cls4.getDeclaredConstructor(byte[].class, cls, cls);
                                declaredConstructor5.setAccessible(true);
                                mbArrConstructor = declaredConstructor5;
                                Constructor<?> declaredConstructor6 = cls4.getDeclaredConstructor(ByteBuffer.class);
                                declaredConstructor6.setAccessible(true);
                                mbBBConstructor = declaredConstructor6;
                                return;
                            } catch (Exception e5) {
                                e = e5;
                                e.printStackTrace(System.err);
                                unsafe = unsafe3;
                                ARRAY_BYTE_BASE_OFFSET = 16;
                                isUniversalBuffer = true;
                                Class<?> cls5 = Class.forName(UNIVERSAL_MESSAGE_BUFFER);
                                Constructor<?> declaredConstructor7 = cls5.getDeclaredConstructor(byte[].class, cls, cls);
                                declaredConstructor7.setAccessible(true);
                                mbArrConstructor = declaredConstructor7;
                                Constructor<?> declaredConstructor8 = cls5.getDeclaredConstructor(ByteBuffer.class);
                                declaredConstructor8.setAccessible(true);
                                mbBBConstructor = declaredConstructor8;
                                return;
                            }
                        }
                        Class.forName("sun.misc.Unsafe");
                        z2 = true;
                    } catch (Exception unused) {
                        z2 = false;
                    }
                    Class<?> cls6 = Class.forName(str2);
                    Constructor<?> declaredConstructor9 = cls6.getDeclaredConstructor(byte[].class, cls, cls);
                    declaredConstructor9.setAccessible(true);
                    mbArrConstructor = declaredConstructor9;
                    Constructor<?> declaredConstructor10 = cls6.getDeclaredConstructor(ByteBuffer.class);
                    declaredConstructor10.setAccessible(true);
                    mbBBConstructor = declaredConstructor10;
                    return;
                } catch (Exception e6) {
                    e6.printStackTrace(System.err);
                    throw new RuntimeException(e6);
                }
                z = false;
                boolean zContains2 = System.getProperty("java.runtime.name", "").toLowerCase().contains("android");
                if (System.getProperty("com.google.appengine.runtime.version") != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false"))) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (!z4) {
                    Field declaredField2 = Unsafe.class.getDeclaredField("theUnsafe");
                    declaredField2.setAccessible(true);
                    unsafe2 = (Unsafe) declaredField2.get(null);
                    if (unsafe2 != null) {
                        throw new RuntimeException("Unsafe is unavailable");
                    }
                    iArrayBaseOffset = unsafe2.arrayBaseOffset(byte[].class);
                    iArrayIndexScale = unsafe2.arrayIndexScale(byte[].class);
                    if (iArrayIndexScale == 1) {
                        throw new IllegalStateException("Byte array index scale must be 1, but is " + iArrayIndexScale);
                    }
                    unsafe3 = unsafe2;
                }
                unsafe = unsafe3;
                ARRAY_BYTE_BASE_OFFSET = iArrayBaseOffset;
                isUniversalBuffer = z4;
                if (!z4) {
                    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                        str = DEFAULT_MESSAGE_BUFFER;
                    }
                    str2 = str;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e7) {
            e = e7;
        } catch (Throwable th3) {
            th = th3;
            z4 = false;
        }
    }

    public MessageBuffer(byte[] bArr, int i, int i2) {
        this.base = bArr;
        this.address = ARRAY_BYTE_BASE_OFFSET + i;
        this.size = i2;
        this.reference = null;
    }

    public static MessageBuffer allocate(int i) {
        if (i >= 0) {
            return wrap(new byte[i]);
        }
        throw new IllegalArgumentException("size must not be negative");
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw new IllegalStateException(e3.getCause());
        }
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i, int i2) {
        Preconditions.checkNotNull(bArr);
        return newInstance(mbArrConstructor, bArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (isUniversalBuffer || messageBuffer.hasArray()) {
            return;
        }
        if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
            DirectBufferAccess.clean(messageBuffer.reference);
        } else {
            unsafe.freeMemory(messageBuffer.address);
        }
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), messageBuffer.base, ((long) i2) + messageBuffer.address, i3);
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + ((long) i));
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + ((long) i));
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), bArr, ARRAY_BYTE_BASE_OFFSET + i2, i3);
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + ((long) i)));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + ((long) i)));
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + ((long) i)));
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + ((long) i), z);
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + ((long) i), b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position()), this.base, this.address + ((long) i), i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), ARRAY_BYTE_BASE_OFFSET + byteBuffer.position(), this.base, this.address + ((long) i), i2);
            byteBuffer.position(byteBuffer.position() + i2);
        } else {
            if (hasArray()) {
                byteBuffer.get((byte[]) this.base, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                unsafe.putByte(this.base, this.address + ((long) i), byteBuffer.get());
            }
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(bArr, ARRAY_BYTE_BASE_OFFSET + i2, this.base, this.address + ((long) i), i3);
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + ((long) i), Integer.reverseBytes(i2));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, ((long) i) + this.address, Long.reverseBytes(j));
    }

    public void putMessageBuffer(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + ((long) i2), this.base, ((long) i) + this.address, i3);
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + ((long) i), Short.reverseBytes(s));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        Preconditions.checkArgument(i + i2 <= size());
        return new MessageBuffer(this.base, this.address + ((long) i), i2);
    }

    public ByteBuffer sliceAsByteBuffer(int i, int i2) {
        return hasArray() ? ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ((long) ARRAY_BYTE_BASE_OFFSET)) + ((long) i)), i2) : DirectBufferAccess.newByteBuffer(this.address, i, i2, this.reference);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, ARRAY_BYTE_BASE_OFFSET, size());
        return bArr;
    }

    public String toHexString(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(" ");
            }
            sb.append(String.format("%02x", Byte.valueOf(getByte(i3))));
        }
        return sb.toString();
    }

    public static MessageBuffer wrap(byte[] bArr, int i, int i2) {
        return newMessageBuffer(bArr, i, i2);
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i2) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(sliceAsByteBuffer(i, i2));
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        return newInstance(mbBBConstructor, byteBuffer);
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }

    public MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (!isUniversalBuffer) {
                this.base = null;
                this.address = DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position());
                this.size = byteBuffer.remaining();
                this.reference = byteBuffer;
                return;
            }
            throw new UnsupportedOperationException("Cannot create MessageBuffer from a DirectBuffer on this platform");
        }
        if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = ARRAY_BYTE_BASE_OFFSET + byteBuffer.arrayOffset() + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
    }

    public MessageBuffer(Object obj, long j, int i) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = null;
    }
}
