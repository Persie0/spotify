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
public abstract class k7f1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f120081a;

    /* JADX INFO: renamed from: b */
    public static final Class f120082b;

    /* JADX INFO: renamed from: c */
    public static final j7f1 f120083c;

    /* JADX INFO: renamed from: d */
    public static final boolean f120084d;

    /* JADX INFO: renamed from: e */
    public static final boolean f120085e;

    /* JADX INFO: renamed from: f */
    public static final long f120086f;

    /* JADX INFO: renamed from: g */
    public static final boolean f120087g;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z;
        boolean z2;
        j7f1 j7f1Var;
        Unsafe unsafeM55655l = m55655l();
        f120081a = unsafeM55655l;
        int i = bah1.f25203a;
        f120082b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM55656m = m55656m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM55656m2 = m55656m(cls2);
        j7f1 g7f1Var = null;
        if (unsafeM55655l != null) {
            if (zM55656m) {
                g7f1Var = new h7f1(unsafeM55655l);
            } else if (zM55656m2) {
                g7f1Var = new g7f1(unsafeM55655l);
            }
        }
        f120083c = g7f1Var;
        if (g7f1Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = g7f1Var.f109588a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m55645b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(k7f1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f120084d = z;
        j7f1 j7f1Var2 = f120083c;
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
                Logger.getLogger(k7f1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        f120085e = z2;
        f120086f = m55659p(byte[].class);
        m55659p(boolean[].class);
        m55644a(boolean[].class);
        m55659p(int[].class);
        m55644a(int[].class);
        m55659p(long[].class);
        m55644a(long[].class);
        m55659p(float[].class);
        m55644a(float[].class);
        m55659p(double[].class);
        m55644a(double[].class);
        m55659p(Object[].class);
        m55644a(Object[].class);
        Field fieldM55645b = m55645b();
        if (fieldM55645b != null && (j7f1Var = f120083c) != null) {
            j7f1Var.f109588a.objectFieldOffset(fieldM55645b);
        }
        f120087g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m55644a(Class cls) {
        if (f120085e) {
            f120083c.f109588a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m55645b() {
        Field declaredField;
        Field declaredField2;
        int i = bah1.f25203a;
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
    public static void m55646c(Object obj, long j, byte b) {
        Unsafe unsafe = f120083c.f109588a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: d */
    public static void m55647d(Object obj, long j, byte b) {
        Unsafe unsafe = f120083c.f109588a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: e */
    public static Object m55648e(Class cls) {
        try {
            return f120081a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m55649f(long j, Object obj) {
        return f120083c.f109588a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public static void m55650g(long j, Object obj, int i) {
        f120083c.f109588a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: h */
    public static long m55651h(long j, Object obj) {
        return f120083c.f109588a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static void m55652i(Object obj, long j, long j2) {
        f120083c.f109588a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: j */
    public static Object m55653j(long j, Object obj) {
        return f120083c.f109588a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: k */
    public static void m55654k(Object obj, long j, Object obj2) {
        f120083c.f109588a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static Unsafe m55655l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e7f1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m55656m(Class cls) {
        int i = bah1.f25203a;
        try {
            Class cls2 = f120082b;
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

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m55657n(Object obj, long j) {
        return ((byte) ((f120083c.f109588a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m55658o(long j, Object obj) {
        return ((byte) ((f120083c.f109588a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: p */
    public static int m55659p(Class cls) {
        if (f120085e) {
            return f120083c.f109588a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
