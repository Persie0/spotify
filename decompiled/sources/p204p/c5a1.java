package p204p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class c5a1 {

    /* JADX INFO: renamed from: a */
    public static final Logger f34122a = Logger.getLogger(c5a1.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f34123b;

    /* JADX INFO: renamed from: c */
    public static final Class f34124c;

    /* JADX INFO: renamed from: d */
    public static final y4a1 f34125d;

    /* JADX INFO: renamed from: e */
    public static final boolean f34126e;

    /* JADX INFO: renamed from: f */
    public static final boolean f34127f;

    /* JADX INFO: renamed from: g */
    public static final long f34128g;

    /* JADX INFO: renamed from: h */
    public static final boolean f34129h;

    static {
        boolean z;
        boolean z2;
        y4a1 y4a1Var;
        Unsafe unsafeM31473i = m31473i();
        f34123b = unsafeM31473i;
        f34124c = pt3.f181033a;
        Class cls = Long.TYPE;
        boolean zM31469e = m31469e(cls);
        Class cls2 = Integer.TYPE;
        boolean zM31469e2 = m31469e(cls2);
        y4a1 u4a1Var = null;
        if (unsafeM31473i != null) {
            if (!pt3.m70890a()) {
                u4a1Var = new u4a1(unsafeM31473i);
            } else if (zM31469e) {
                u4a1Var = new q4a1(unsafeM31473i);
            } else if (zM31469e2) {
                u4a1Var = new n4a1(unsafeM31473i);
            }
        }
        f34125d = u4a1Var;
        Class cls3 = Byte.TYPE;
        Class<Field> cls4 = Field.class;
        if (unsafeM31473i == null) {
            z = false;
        } else {
            try {
                Class<?> cls5 = unsafeM31473i.getClass();
                cls5.getMethod("objectFieldOffset", cls4);
                cls5.getMethod("getLong", Object.class, cls);
                if (m31468d() == null) {
                    z = false;
                } else {
                    if (!pt3.m70890a()) {
                        cls5.getMethod("getByte", cls);
                        cls5.getMethod("putByte", cls, cls3);
                        cls5.getMethod("getInt", cls);
                        cls5.getMethod("putInt", cls, cls2);
                        cls5.getMethod("getLong", cls);
                        cls5.getMethod("putLong", cls, cls);
                        cls5.getMethod("copyMemory", cls, cls, cls);
                        cls5.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    }
                    cls4 = cls4;
                    z = true;
                }
            } catch (Throwable th) {
                f34122a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
        }
        f34126e = z;
        Unsafe unsafe = f34123b;
        if (unsafe == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls6 = unsafe.getClass();
                cls6.getMethod("objectFieldOffset", cls4);
                cls6.getMethod("arrayBaseOffset", Class.class);
                cls6.getMethod("arrayIndexScale", Class.class);
                cls6.getMethod("getInt", Object.class, cls);
                cls6.getMethod("putInt", Object.class, cls, cls2);
                cls6.getMethod("getLong", Object.class, cls);
                cls6.getMethod("putLong", Object.class, cls, cls);
                cls6.getMethod("getObject", Object.class, cls);
                cls6.getMethod("putObject", Object.class, cls, Object.class);
                if (!pt3.m70890a()) {
                    cls6.getMethod("getByte", Object.class, cls);
                    cls6.getMethod("putByte", Object.class, cls, cls3);
                    cls6.getMethod("getBoolean", Object.class, cls);
                    cls6.getMethod("putBoolean", Object.class, cls, Boolean.TYPE);
                    cls6.getMethod("getFloat", Object.class, cls);
                    cls6.getMethod("putFloat", Object.class, cls, Float.TYPE);
                    cls6.getMethod("getDouble", Object.class, cls);
                    cls6.getMethod("putDouble", Object.class, cls, Double.TYPE);
                }
                z2 = true;
            } catch (Throwable th2) {
                f34122a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z2 = false;
            }
        }
        f34127f = z2;
        f34128g = m31466b(byte[].class);
        m31466b(boolean[].class);
        m31467c(boolean[].class);
        m31466b(int[].class);
        m31467c(int[].class);
        m31466b(long[].class);
        m31467c(long[].class);
        m31466b(float[].class);
        m31467c(float[].class);
        m31466b(double[].class);
        m31467c(double[].class);
        m31466b(Object[].class);
        m31467c(Object[].class);
        Field fieldM31468d = m31468d();
        if (fieldM31468d != null && (y4a1Var = f34125d) != null) {
            y4a1Var.m92807j(fieldM31468d);
        }
        f34129h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static Object m31465a(Class cls) {
        try {
            return f34123b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m31466b(Class cls) {
        if (f34127f) {
            return f34125d.m92802a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static void m31467c(Class cls) {
        if (f34127f) {
            f34125d.m92803b(cls);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Field m31468d() {
        Field declaredField;
        Field declaredField2;
        if (pt3.m70890a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m31469e(Class cls) {
        if (!pt3.m70890a()) {
            return false;
        }
        try {
            Class cls2 = f34124c;
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

    /* JADX INFO: renamed from: f */
    public static byte m31470f(long j, byte[] bArr) {
        return f34125d.mo63665d(f34128g + j, bArr);
    }

    /* JADX INFO: renamed from: g */
    public static byte m31471g(long j, Object obj) {
        return (byte) ((f34125d.m92804g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: h */
    public static byte m31472h(long j, Object obj) {
        return (byte) ((f34125d.m92804g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static Unsafe m31473i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j4a1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m31474j(byte[] bArr, long j, byte b) {
        f34125d.mo63669l(bArr, f34128g + j, b);
    }

    /* JADX INFO: renamed from: k */
    public static void m31475k(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM92804g = f34125d.m92804g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m31477m(j2, obj, ((255 & b) << i) | (iM92804g & (~(255 << i))));
    }

    /* JADX INFO: renamed from: l */
    public static void m31476l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m31477m(j2, obj, ((255 & b) << i) | (f34125d.m92804g(j2, obj) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m31477m(long j, Object obj, int i) {
        f34125d.m92808o(j, obj, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m31478n(Object obj, long j, long j2) {
        f34125d.m92809p(obj, j, j2);
    }

    /* JADX INFO: renamed from: o */
    public static void m31479o(Object obj, long j, Object obj2) {
        f34125d.m92810q(obj, j, obj2);
    }
}
