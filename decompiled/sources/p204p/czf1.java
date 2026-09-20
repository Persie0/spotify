package p204p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class czf1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f43552a;

    /* JADX INFO: renamed from: b */
    public static final Class f43553b;

    /* JADX INFO: renamed from: c */
    public static final wyf1 f43554c;

    /* JADX INFO: renamed from: d */
    public static final boolean f43555d;

    /* JADX INFO: renamed from: e */
    public static final boolean f43556e;

    /* JADX INFO: renamed from: f */
    public static final long f43557f;

    /* JADX INFO: renamed from: g */
    public static final boolean f43558g;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z;
        boolean z2;
        wyf1 wyf1Var;
        Unsafe unsafeM34441f = m34441f();
        f43552a = unsafeM34441f;
        f43553b = ccf1.m32247a();
        Class cls = Long.TYPE;
        boolean zM34446k = m34446k(cls);
        Class cls2 = Integer.TYPE;
        boolean zM34446k2 = m34446k(cls2);
        wyf1 pyf1Var = null;
        if (unsafeM34441f != null) {
            if (zM34446k) {
                pyf1Var = new syf1(unsafeM34441f);
            } else if (zM34446k2) {
                pyf1Var = new pyf1(unsafeM34441f);
            }
        }
        f43554c = pyf1Var;
        if (pyf1Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = pyf1Var.f256287a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m34437b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(czf1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f43555d = z;
        wyf1 wyf1Var2 = f43554c;
        if (wyf1Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = wyf1Var2.f256287a.getClass();
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
                Logger.getLogger(czf1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        f43556e = z2;
        f43557f = m34447l(byte[].class);
        m34447l(boolean[].class);
        m34436a(boolean[].class);
        m34447l(int[].class);
        m34436a(int[].class);
        m34447l(long[].class);
        m34436a(long[].class);
        m34447l(float[].class);
        m34436a(float[].class);
        m34447l(double[].class);
        m34436a(double[].class);
        m34447l(Object[].class);
        m34436a(Object[].class);
        Field fieldM34437b = m34437b();
        if (fieldM34437b != null && (wyf1Var = f43554c) != null) {
            wyf1Var.m89356l(fieldM34437b);
        }
        f43558g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m34436a(Class cls) {
        if (f43556e) {
            f43554c.m89353i(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m34437b() {
        Field declaredField;
        Field declaredField2;
        int i = ccf1.f36400a;
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
    public static void m34438c(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        wyf1 wyf1Var = f43554c;
        int iM89354j = wyf1Var.m89354j(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        wyf1Var.m89358n(j2, obj, ((255 & b) << i) | (iM89354j & (~(255 << i))));
    }

    /* JADX INFO: renamed from: d */
    public static void m34439d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        wyf1 wyf1Var = f43554c;
        int i = (((int) j) & 3) << 3;
        wyf1Var.m89358n(j2, obj, ((255 & b) << i) | (wyf1Var.m89354j(j2, obj) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: e */
    public static Object m34440e(Class cls) {
        try {
            return f43552a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Unsafe m34441f() {
        try {
            return (Unsafe) AccessController.doPrivileged(new lyf1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m34442g(Object obj, long j, int i) {
        f43554c.m89358n(j, obj, i);
    }

    /* JADX INFO: renamed from: h */
    public static void m34443h(Object obj, long j, Object obj2) {
        f43554c.m89360p(obj, j, obj2);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ boolean m34444i(Object obj, long j) {
        return ((byte) ((f43554c.m89354j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ boolean m34445j(Object obj, long j) {
        return ((byte) ((f43554c.m89354j((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m34446k(Class cls) {
        int i = ccf1.f36400a;
        try {
            Class cls2 = f43553b;
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

    /* JADX INFO: renamed from: l */
    public static int m34447l(Class cls) {
        if (f43556e) {
            return f43554c.m89352h(cls);
        }
        return -1;
    }
}
