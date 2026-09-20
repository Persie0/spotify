package p204p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class w4a1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f247759a;

    public w4a1(Unsafe unsafe) {
        this.f247759a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m87169a(Class cls) {
        return this.f247759a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m87170b(Class cls) {
        return this.f247759a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo58132c(long j, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract byte mo58133d(long j, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract double mo58134e(long j, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract float mo58135f(long j, Object obj);

    /* JADX INFO: renamed from: g */
    public final int m87171g(long j, Object obj) {
        return this.f247759a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final long m87172h(long j, Object obj) {
        return this.f247759a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final Object m87173i(long j, Object obj) {
        return this.f247759a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m87174j(Field field) {
        return this.f247759a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo58136k(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo58137l(Object obj, long j, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo58138m(Object obj, long j, double d);

    /* JADX INFO: renamed from: n */
    public abstract void mo58139n(Object obj, long j, float f);

    /* JADX INFO: renamed from: o */
    public final void m87175o(long j, Object obj, int i) {
        this.f247759a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m87176p(Object obj, long j, long j2) {
        this.f247759a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m87177q(Object obj, long j, Object obj2) {
        this.f247759a.putObject(obj, j, obj2);
    }
}
