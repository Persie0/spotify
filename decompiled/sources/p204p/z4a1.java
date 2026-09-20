package p204p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z4a1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f279179a;

    /* JADX INFO: renamed from: b */
    public static final Class f279180b;

    /* JADX INFO: renamed from: c */
    public static final v4a1 f279181c;

    /* JADX INFO: renamed from: d */
    public static final boolean f279182d;

    /* JADX INFO: renamed from: e */
    public static final boolean f279183e;

    /* JADX INFO: renamed from: f */
    public static final long f279184f;

    /* JADX INFO: renamed from: g */
    public static final boolean f279185g;

    static {
        Unsafe unsafeM95334i = m95334i();
        f279179a = unsafeM95334i;
        f279180b = mt3.f146939a;
        boolean zM95333h = m95333h(Long.TYPE);
        boolean zM95333h2 = m95333h(Integer.TYPE);
        v4a1 r4a1Var = null;
        if (unsafeM95334i != null) {
            if (!mt3.m62787a()) {
                r4a1Var = new r4a1(unsafeM95334i);
            } else if (zM95333h) {
                r4a1Var = new k4a1(unsafeM95334i, 1);
            } else if (zM95333h2) {
                r4a1Var = new k4a1(unsafeM95334i, 0);
            }
        }
        f279181c = r4a1Var;
        f279182d = r4a1Var == null ? false : r4a1Var.mo55368r();
        f279183e = r4a1Var == null ? false : r4a1Var.mo74743q();
        f279184f = m95330e(byte[].class);
        m95330e(boolean[].class);
        m95331f(boolean[].class);
        m95330e(int[].class);
        m95331f(int[].class);
        m95330e(long[].class);
        m95331f(long[].class);
        m95330e(float[].class);
        m95331f(float[].class);
        m95330e(double[].class);
        m95331f(double[].class);
        m95330e(Object[].class);
        m95331f(Object[].class);
        Field fieldM95332g = m95332g();
        if (fieldM95332g != null && r4a1Var != null) {
            r4a1Var.m84645i(fieldM95332g);
        }
        f279185g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m95326a(Throwable th) {
        Logger.getLogger(z4a1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m95327b(long j, Object obj) {
        return ((byte) ((f279181c.m84642f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m95328c(long j, Object obj) {
        return ((byte) ((f279181c.m84642f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static Object m95329d(Class cls) {
        try {
            return f279179a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m95330e(Class cls) {
        if (f279183e) {
            return f279181c.m84640a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m95331f(Class cls) {
        if (f279183e) {
            f279181c.m84641b(cls);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Field m95332g() {
        Field declaredField;
        Field declaredField2;
        if (mt3.m62787a()) {
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

    /* JADX INFO: renamed from: h */
    public static boolean m95333h(Class cls) {
        if (!mt3.m62787a()) {
            return false;
        }
        try {
            Class cls2 = f279180b;
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

    /* JADX INFO: renamed from: i */
    public static Unsafe m95334i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new g4a1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m95335j(byte[] bArr, long j, byte b) {
        f279181c.mo55365k(bArr, f279184f + j, b);
    }

    /* JADX INFO: renamed from: k */
    public static void m95336k(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM84642f = f279181c.m84642f(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m95338m(j2, obj, ((255 & b) << i) | (iM84642f & (~(255 << i))));
    }

    /* JADX INFO: renamed from: l */
    public static void m95337l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m95338m(j2, obj, ((255 & b) << i) | (f279181c.m84642f(j2, obj) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m95338m(long j, Object obj, int i) {
        f279181c.m84646n(j, obj, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m95339n(Object obj, long j, long j2) {
        f279181c.m84647o(obj, j, j2);
    }

    /* JADX INFO: renamed from: o */
    public static void m95340o(Object obj, long j, Object obj2) {
        f279181c.m84648p(obj, j, obj2);
    }
}
