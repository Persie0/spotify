package p204p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class wyf1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f256287a;

    public wyf1(Unsafe unsafe) {
        this.f256287a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo71632a(Object obj, long j);

    /* JADX INFO: renamed from: b */
    public abstract float mo71633b(Object obj, long j);

    /* JADX INFO: renamed from: c */
    public abstract void mo71634c(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: d */
    public abstract void mo71635d(Object obj, long j, byte b);

    /* JADX INFO: renamed from: e */
    public abstract void mo71636e(Object obj, long j, double d);

    /* JADX INFO: renamed from: f */
    public abstract void mo71637f(Object obj, long j, float f);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo71638g(Object obj, long j);

    /* JADX INFO: renamed from: h */
    public final int m89352h(Class cls) {
        return this.f256287a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: i */
    public final int m89353i(Class cls) {
        return this.f256287a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: j */
    public final int m89354j(long j, Object obj) {
        return this.f256287a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: k */
    public final long m89355k(long j, Object obj) {
        return this.f256287a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public final void m89356l(Field field) {
        this.f256287a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: m */
    public final Object m89357m(long j, Object obj) {
        return this.f256287a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: n */
    public final void m89358n(long j, Object obj, int i) {
        this.f256287a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: o */
    public final void m89359o(Object obj, long j, long j2) {
        this.f256287a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public final void m89360p(Object obj, long j, Object obj2) {
        this.f256287a.putObject(obj, j, obj2);
    }
}
