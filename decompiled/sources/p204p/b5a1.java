package p204p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class b5a1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f23534a;

    /* JADX INFO: renamed from: b */
    public static final Class f23535b;

    /* JADX INFO: renamed from: c */
    public static final x4a1 f23536c;

    /* JADX INFO: renamed from: d */
    public static final boolean f23537d;

    /* JADX INFO: renamed from: e */
    public static final boolean f23538e;

    /* JADX INFO: renamed from: f */
    public static final long f23539f;

    /* JADX INFO: renamed from: g */
    public static final long f23540g;

    /* JADX INFO: renamed from: h */
    public static final boolean f23541h;

    static {
        Unsafe unsafeM28163j = m28163j();
        f23534a = unsafeM28163j;
        f23535b = ot3.f168957a;
        boolean zM28159f = m28159f(Long.TYPE);
        boolean zM28159f2 = m28159f(Integer.TYPE);
        x4a1 t4a1Var = null;
        if (unsafeM28163j != null) {
            if (!ot3.m67760a()) {
                t4a1Var = new t4a1(unsafeM28163j);
            } else if (zM28159f) {
                t4a1Var = new p4a1(unsafeM28163j);
            } else if (zM28159f2) {
                t4a1Var = new m4a1(unsafeM28163j);
            }
        }
        f23536c = t4a1Var;
        f23537d = t4a1Var == null ? false : t4a1Var.mo60806u();
        f23538e = t4a1Var == null ? false : t4a1Var.mo80058t();
        f23539f = m28156c(byte[].class);
        m28156c(boolean[].class);
        m28157d(boolean[].class);
        m28156c(int[].class);
        m28157d(int[].class);
        m28156c(long[].class);
        m28157d(long[].class);
        m28156c(float[].class);
        m28157d(float[].class);
        m28156c(double[].class);
        m28157d(double[].class);
        m28156c(Object[].class);
        m28157d(Object[].class);
        Field fieldM28158e = m28158e();
        f23540g = (fieldM28158e == null || t4a1Var == null) ? -1L : t4a1Var.m89845l(fieldM28158e);
        f23541h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m28154a(Throwable th) {
        Logger.getLogger(b5a1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    /* JADX INFO: renamed from: b */
    public static Object m28155b(Class cls) {
        try {
            return f23534a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m28156c(Class cls) {
        if (f23538e) {
            return f23536c.m89840a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m28157d(Class cls) {
        if (f23538e) {
            f23536c.m89841b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m28158e() {
        Field declaredField;
        Field declaredField2;
        if (ot3.m67760a()) {
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

    /* JADX INFO: renamed from: f */
    public static boolean m28159f(Class cls) {
        if (!ot3.m67760a()) {
            return false;
        }
        try {
            Class cls2 = f23535b;
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

    /* JADX INFO: renamed from: g */
    public static byte m28160g(long j, byte[] bArr) {
        return f23536c.mo60799f(f23539f + j, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte m28161h(long j, Object obj) {
        return (byte) ((f23536c.m89842i((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m28162i(long j, Object obj) {
        return (byte) ((f23536c.m89842i((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m28163j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new i4a1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m28164k(byte[] bArr, long j, byte b) {
        f23536c.mo60803n(bArr, f23539f + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m28165l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM89842i = f23536c.m89842i(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m28167n(j2, obj, ((255 & b) << i) | (iM89842i & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m28166m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m28167n(j2, obj, ((255 & b) << i) | (f23536c.m89842i(j2, obj) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: n */
    public static void m28167n(long j, Object obj, int i) {
        f23536c.m89846q(j, obj, i);
    }

    /* JADX INFO: renamed from: o */
    public static void m28168o(Object obj, long j, long j2) {
        f23536c.m89847r(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public static void m28169p(Object obj, long j, Object obj2) {
        f23536c.m89848s(obj, j, obj2);
    }
}
