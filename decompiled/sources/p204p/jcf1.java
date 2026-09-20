package p204p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jcf1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f111115a;

    /* JADX INFO: renamed from: b */
    public static final Class f111116b;

    /* JADX INFO: renamed from: c */
    public static final j7f1 f111117c;

    /* JADX INFO: renamed from: d */
    public static final boolean f111118d;

    /* JADX INFO: renamed from: e */
    public static final boolean f111119e;

    static {
        boolean z;
        j7f1 j7f1Var;
        Unsafe unsafeM52971h = m52971h();
        f111115a = unsafeM52971h;
        int i = m9f1.f141300a;
        f111116b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM52972i = m52972i(cls);
        Class cls2 = Integer.TYPE;
        boolean zM52972i2 = m52972i(cls2);
        j7f1 hcf1Var = null;
        if (unsafeM52971h != null) {
            if (zM52972i) {
                hcf1Var = new icf1(unsafeM52971h);
            } else if (zM52972i2) {
                hcf1Var = new hcf1(unsafeM52971h);
            }
        }
        f111117c = hcf1Var;
        if (hcf1Var != null) {
            try {
                Class<?> cls3 = hcf1Var.f109588a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                m52979p();
            } catch (Throwable th) {
                Logger.getLogger(jcf1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        j7f1 j7f1Var2 = f111117c;
        if (j7f1Var2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = j7f1Var2.f109588a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(jcf1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        f111118d = z;
        m52977n(byte[].class);
        m52977n(boolean[].class);
        m52978o(boolean[].class);
        m52977n(int[].class);
        m52978o(int[].class);
        m52977n(long[].class);
        m52978o(long[].class);
        m52977n(float[].class);
        m52978o(float[].class);
        m52977n(double[].class);
        m52978o(double[].class);
        m52977n(Object[].class);
        m52978o(Object[].class);
        Field fieldM52979p = m52979p();
        if (fieldM52979p != null && (j7f1Var = f111117c) != null) {
            j7f1Var.f109588a.objectFieldOffset(fieldM52979p);
        }
        f111119e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static Object m52964a(Class cls) {
        try {
            return f111115a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m52965b(long j, Object obj) {
        return f111117c.f109588a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: c */
    public static void m52966c(long j, Object obj, int i) {
        f111117c.f109588a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: d */
    public static long m52967d(Object obj, long j) {
        return f111117c.f109588a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: e */
    public static void m52968e(Object obj, long j, long j2) {
        f111117c.f109588a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: f */
    public static Object m52969f(long j, Object obj) {
        return f111117c.f109588a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public static void m52970g(Object obj, long j, Object obj2) {
        f111117c.f109588a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: h */
    public static Unsafe m52971h() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new gcf1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(jcf1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m52972i(Class cls) {
        int i = m9f1.f141300a;
        try {
            Class cls2 = f111116b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m52973j(long j, Object obj) {
        return ((byte) ((f111117c.f109588a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m52974k(long j, Object obj) {
        return ((byte) ((f111117c.f109588a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m52975l(Object obj, long j, boolean z) {
        Unsafe unsafe = f111117c.f109588a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m52976m(Object obj, long j, boolean z) {
        Unsafe unsafe = f111117c.f109588a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j2)));
    }

    /* JADX INFO: renamed from: n */
    public static void m52977n(Class cls) {
        if (f111118d) {
            f111117c.f109588a.arrayBaseOffset(cls);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m52978o(Class cls) {
        if (f111118d) {
            f111117c.f109588a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: p */
    public static Field m52979p() {
        Field declaredField;
        Field declaredField2;
        int i = m9f1.f141300a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }
}
