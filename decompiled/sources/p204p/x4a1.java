package p204p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class x4a1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f258034a;

    public x4a1(Unsafe unsafe) {
        this.f258034a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m89840a(Class cls) {
        return this.f258034a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m89841b(Class cls) {
        return this.f258034a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo60796c(long j, byte[] bArr, long j2);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo60797d(long j, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract byte mo60798e(long j);

    /* JADX INFO: renamed from: f */
    public abstract byte mo60799f(long j, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract double mo60800g(long j, Object obj);

    /* JADX INFO: renamed from: h */
    public abstract float mo60801h(long j, Object obj);

    /* JADX INFO: renamed from: i */
    public final int m89842i(long j, Object obj) {
        return this.f258034a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m89843j(long j, Object obj) {
        return this.f258034a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: k */
    public final Object m89844k(long j, Object obj) {
        return this.f258034a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public final long m89845l(Field field) {
        return this.f258034a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo60802m(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: n */
    public abstract void mo60803n(Object obj, long j, byte b);

    /* JADX INFO: renamed from: o */
    public abstract void mo60804o(Object obj, long j, double d);

    /* JADX INFO: renamed from: p */
    public abstract void mo60805p(Object obj, long j, float f);

    /* JADX INFO: renamed from: q */
    public final void m89846q(long j, Object obj, int i) {
        this.f258034a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: r */
    public final void m89847r(Object obj, long j, long j2) {
        this.f258034a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: s */
    public final void m89848s(Object obj, long j, Object obj2) {
        this.f258034a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: t */
    public boolean mo80058t() {
        Unsafe unsafe = this.f258034a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            b5a1.m28154a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo60806u();
}
