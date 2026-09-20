package p204p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class a5a1 {

    /* JADX INFO: renamed from: a */
    public static final Logger f12470a = Logger.getLogger(a5a1.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f12471b;

    /* JADX INFO: renamed from: c */
    public static final Class f12472c;

    /* JADX INFO: renamed from: d */
    public static final w4a1 f12473d;

    /* JADX INFO: renamed from: e */
    public static final boolean f12474e;

    /* JADX INFO: renamed from: f */
    public static final boolean f12475f;

    /* JADX INFO: renamed from: g */
    public static final long f12476g;

    /* JADX INFO: renamed from: h */
    public static final boolean f12477h;

    static {
        boolean z;
        boolean z2;
        w4a1 w4a1Var;
        Unsafe unsafeM24786i = m24786i();
        f12471b = unsafeM24786i;
        f12472c = nt3.f157967a;
        Class cls = Long.TYPE;
        boolean zM24782e = m24782e(cls);
        Class cls2 = Integer.TYPE;
        boolean zM24782e2 = m24782e(cls2);
        w4a1 s4a1Var = null;
        if (unsafeM24786i != null) {
            if (!nt3.m65594a()) {
                s4a1Var = new s4a1(unsafeM24786i);
            } else if (zM24782e) {
                s4a1Var = new o4a1(unsafeM24786i);
            } else if (zM24782e2) {
                s4a1Var = new l4a1(unsafeM24786i);
            }
        }
        f12473d = s4a1Var;
        Class cls3 = Byte.TYPE;
        Class<Field> cls4 = Field.class;
        if (unsafeM24786i == null) {
            z = false;
        } else {
            try {
                Class<?> cls5 = unsafeM24786i.getClass();
                cls5.getMethod("objectFieldOffset", cls4);
                cls5.getMethod("getLong", Object.class, cls);
                if (m24781d() == null) {
                    z = false;
                } else {
                    if (!nt3.m65594a()) {
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
                f12470a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
        }
        f12474e = z;
        Unsafe unsafe = f12471b;
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
                if (!nt3.m65594a()) {
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
                f12470a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z2 = false;
            }
        }
        f12475f = z2;
        f12476g = m24779b(byte[].class);
        m24779b(boolean[].class);
        m24780c(boolean[].class);
        m24779b(int[].class);
        m24780c(int[].class);
        m24779b(long[].class);
        m24780c(long[].class);
        m24779b(float[].class);
        m24780c(float[].class);
        m24779b(double[].class);
        m24780c(double[].class);
        m24779b(Object[].class);
        m24780c(Object[].class);
        Field fieldM24781d = m24781d();
        if (fieldM24781d != null && (w4a1Var = f12473d) != null) {
            w4a1Var.m87174j(fieldM24781d);
        }
        f12477h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static Object m24778a(Class cls) {
        try {
            return f12471b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m24779b(Class cls) {
        if (f12475f) {
            return f12473d.m87169a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static void m24780c(Class cls) {
        if (f12475f) {
            f12473d.m87170b(cls);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Field m24781d() {
        Field declaredField;
        Field declaredField2;
        if (nt3.m65594a()) {
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
    public static boolean m24782e(Class cls) {
        if (!nt3.m65594a()) {
            return false;
        }
        try {
            Class cls2 = f12472c;
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
    public static byte m24783f(long j, byte[] bArr) {
        return f12473d.mo58133d(f12476g + j, bArr);
    }

    /* JADX INFO: renamed from: g */
    public static byte m24784g(long j, Object obj) {
        return (byte) ((f12473d.m87171g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: h */
    public static byte m24785h(long j, Object obj) {
        return (byte) ((f12473d.m87171g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static Unsafe m24786i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new h4a1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m24787j(byte[] bArr, long j, byte b) {
        f12473d.mo58137l(bArr, f12476g + j, b);
    }

    /* JADX INFO: renamed from: k */
    public static void m24788k(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM87171g = f12473d.m87171g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m24790m(j2, obj, ((255 & b) << i) | (iM87171g & (~(255 << i))));
    }

    /* JADX INFO: renamed from: l */
    public static void m24789l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m24790m(j2, obj, ((255 & b) << i) | (f12473d.m87171g(j2, obj) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m24790m(long j, Object obj, int i) {
        f12473d.m87175o(j, obj, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m24791n(Object obj, long j, long j2) {
        f12473d.m87176p(obj, j, j2);
    }

    /* JADX INFO: renamed from: o */
    public static void m24792o(Object obj, long j, Object obj2) {
        f12473d.m87177q(obj, j, obj2);
    }
}
