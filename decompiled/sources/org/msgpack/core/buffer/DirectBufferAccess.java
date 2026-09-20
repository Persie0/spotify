package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
class DirectBufferAccess {
    static Constructor byteBufferConstructor;
    static DirectBufferConstructorType directBufferConstructorType;
    static Class<?> directByteBufferClass;
    static Method mClean;
    static Method mCleaner;
    static Method mGetAddress;
    static Method memoryBlockWrapFromJni;

    /* JADX INFO: renamed from: org.msgpack.core.buffer.DirectBufferAccess$1 */
    public static /* synthetic */ class C16461 {

        /* JADX INFO: renamed from: $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType */
        static final /* synthetic */ int[] f10963x6d3725bd;

        static {
            int[] iArr = new int[DirectBufferConstructorType.values().length];
            f10963x6d3725bd = iArr;
            try {
                iArr[DirectBufferConstructorType.ARGS_LONG_INT_REF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10963x6d3725bd[DirectBufferConstructorType.ARGS_LONG_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10963x6d3725bd[DirectBufferConstructorType.ARGS_INT_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10963x6d3725bd[DirectBufferConstructorType.ARGS_MB_INT_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum DirectBufferConstructorType {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    static {
        Constructor<?> declaredConstructor;
        Method method;
        DirectBufferConstructorType directBufferConstructorType2;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        try {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("java.nio.DirectByteBuffer");
            directByteBufferClass = clsLoadClass;
            try {
                try {
                    try {
                        declaredConstructor = clsLoadClass.getDeclaredConstructor(cls, cls2, Object.class);
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT_REF;
                    } catch (NoSuchMethodException unused) {
                        Class<?> cls3 = Class.forName("java.nio.MemoryBlock");
                        Method declaredMethod = cls3.getDeclaredMethod("wrapFromJni", cls2, cls);
                        declaredMethod.setAccessible(true);
                        declaredConstructor = directByteBufferClass.getDeclaredConstructor(cls3, cls2, cls2);
                        method = declaredMethod;
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_MB_INT_INT;
                    }
                } catch (NoSuchMethodException unused2) {
                    declaredConstructor = directByteBufferClass.getDeclaredConstructor(cls2, cls2);
                    directBufferConstructorType2 = DirectBufferConstructorType.ARGS_INT_INT;
                }
            } catch (NoSuchMethodException unused3) {
                declaredConstructor = directByteBufferClass.getDeclaredConstructor(cls, cls2);
                directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT;
            }
            method = null;
            byteBufferConstructor = declaredConstructor;
            directBufferConstructorType = directBufferConstructorType2;
            memoryBlockWrapFromJni = method;
            if (declaredConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            declaredConstructor.setAccessible(true);
            Method declaredMethod2 = directByteBufferClass.getDeclaredMethod("address", null);
            mGetAddress = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = directByteBufferClass.getDeclaredMethod("cleaner", null);
            mCleaner = declaredMethod3;
            declaredMethod3.setAccessible(true);
            Method declaredMethod4 = mCleaner.getReturnType().getDeclaredMethod("clean", null);
            mClean = declaredMethod4;
            declaredMethod4.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private DirectBufferAccess() {
    }

    public static void clean(Object obj) {
        try {
            mClean.invoke(mCleaner.invoke(obj, null), null);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static long getAddress(Object obj) {
        try {
            return ((Long) mGetAddress.invoke(obj, null)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean isDirectByteBufferInstance(Object obj) {
        return directByteBufferClass.isInstance(obj);
    }

    public static ByteBuffer newByteBuffer(long j, int i, int i2, ByteBuffer byteBuffer) {
        try {
            int i3 = C16461.f10963x6d3725bd[directBufferConstructorType.ordinal()];
            if (i3 == 1) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j + ((long) i)), Integer.valueOf(i2), byteBuffer);
            }
            if (i3 == 2) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j + ((long) i)), Integer.valueOf(i2));
            }
            if (i3 == 3) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Integer.valueOf(((int) j) + i), Integer.valueOf(i2));
            }
            if (i3 == 4) {
                return (ByteBuffer) byteBufferConstructor.newInstance(memoryBlockWrapFromJni.invoke(null, Long.valueOf(j + ((long) i)), Integer.valueOf(i2)), Integer.valueOf(i2), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
