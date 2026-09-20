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
public abstract class adg1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f14620a;

    /* JADX INFO: renamed from: b */
    public static final Class f14621b;

    /* JADX INFO: renamed from: c */
    public static final j7f1 f14622c;

    /* JADX INFO: renamed from: d */
    public static final boolean f14623d;

    /* JADX INFO: renamed from: e */
    public static final boolean f14624e;

    /* JADX INFO: renamed from: f */
    public static final long f14625f;

    /* JADX INFO: renamed from: g */
    public static final boolean f14626g;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z;
        boolean z2;
        j7f1 j7f1Var;
        Unsafe unsafeM25547i = m25547i();
        f14620a = unsafeM25547i;
        int i = dyf1.f54334a;
        f14621b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM25553o = m25553o(cls);
        Class cls2 = Integer.TYPE;
        boolean zM25553o2 = m25553o(cls2);
        j7f1 pcg1Var = null;
        if (unsafeM25547i != null) {
            if (zM25553o) {
                pcg1Var = new ucg1(unsafeM25547i);
            } else if (zM25553o2) {
                pcg1Var = new pcg1(unsafeM25547i);
            }
        }
        f14622c = pcg1Var;
        if (pcg1Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = pcg1Var.f109588a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m25540b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(adg1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f14623d = z;
        j7f1 j7f1Var2 = f14622c;
        if (j7f1Var2 == null) {
            z2 = false;
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
                z2 = true;
            } catch (Throwable th2) {
                Logger.getLogger(adg1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        f14624e = z2;
        f14625f = m25554p(byte[].class);
        m25554p(boolean[].class);
        m25539a(boolean[].class);
        m25554p(int[].class);
        m25539a(int[].class);
        m25554p(long[].class);
        m25539a(long[].class);
        m25554p(float[].class);
        m25539a(float[].class);
        m25554p(double[].class);
        m25539a(double[].class);
        m25554p(Object[].class);
        m25539a(Object[].class);
        Field fieldM25540b = m25540b();
        if (fieldM25540b != null && (j7f1Var = f14622c) != null) {
            j7f1Var.f109588a.objectFieldOffset(fieldM25540b);
        }
        f14626g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m25539a(Class cls) {
        if (f14624e) {
            f14622c.f109588a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m25540b() {
        Field declaredField;
        Field declaredField2;
        int i = dyf1.f54334a;
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

    /* JADX INFO: renamed from: c */
    public static void m25541c(Object obj, long j, byte b) {
        Unsafe unsafe = f14622c.f109588a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: d */
    public static void m25542d(Object obj, long j, byte b) {
        Unsafe unsafe = f14622c.f109588a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: e */
    public static int m25543e(Object obj, long j) {
        return f14622c.f109588a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: f */
    public static long m25544f(Object obj, long j) {
        return f14622c.f109588a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public static Object m25545g(Class cls) {
        try {
            return f14620a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object m25546h(Object obj, long j) {
        return f14622c.f109588a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static Unsafe m25547i() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new lcg1());
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
            Logger.getLogger(adg1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m25548j(Object obj, long j, int i) {
        f14622c.f109588a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: k */
    public static void m25549k(Object obj, long j, long j2) {
        f14622c.f109588a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: l */
    public static void m25550l(Object obj, long j, Object obj2) {
        f14622c.f109588a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m25551m(Object obj, long j) {
        return ((byte) ((f14622c.f109588a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m25552n(Object obj, long j) {
        return ((byte) ((f14622c.f109588a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m25553o(Class cls) {
        int i = dyf1.f54334a;
        try {
            Class cls2 = f14621b;
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

    /* JADX INFO: renamed from: p */
    public static int m25554p(Class cls) {
        if (f14624e) {
            return f14622c.f109588a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
