package p204p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v4a1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f237104a;

    public v4a1(Unsafe unsafe) {
        this.f237104a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m84640a(Class cls) {
        return this.f237104a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m84641b(Class cls) {
        return this.f237104a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo55361c(long j, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract double mo55362d(long j, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract float mo55363e(long j, Object obj);

    /* JADX INFO: renamed from: f */
    public final int m84642f(long j, Object obj) {
        return this.f237104a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public final long m84643g(long j, Object obj) {
        return this.f237104a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final Object m84644h(long j, Object obj) {
        return this.f237104a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final long m84645i(Field field) {
        return this.f237104a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo55364j(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: k */
    public abstract void mo55365k(Object obj, long j, byte b);

    /* JADX INFO: renamed from: l */
    public abstract void mo55366l(Object obj, long j, double d);

    /* JADX INFO: renamed from: m */
    public abstract void mo55367m(Object obj, long j, float f);

    /* JADX INFO: renamed from: n */
    public final void m84646n(long j, Object obj, int i) {
        this.f237104a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: o */
    public final void m84647o(Object obj, long j, long j2) {
        this.f237104a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public final void m84648p(Object obj, long j, Object obj2) {
        this.f237104a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo74743q() {
        Unsafe unsafe = this.f237104a;
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
            z4a1.m95326a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo55368r();
}
