package p204p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class y4a1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f269112a;

    public y4a1(Unsafe unsafe) {
        this.f269112a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m92802a(Class cls) {
        return this.f269112a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m92803b(Class cls) {
        return this.f269112a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo63664c(long j, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract byte mo63665d(long j, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract double mo63666e(long j, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract float mo63667f(long j, Object obj);

    /* JADX INFO: renamed from: g */
    public final int m92804g(long j, Object obj) {
        return this.f269112a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final long m92805h(long j, Object obj) {
        return this.f269112a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final Object m92806i(long j, Object obj) {
        return this.f269112a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m92807j(Field field) {
        return this.f269112a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo63668k(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo63669l(Object obj, long j, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo63670m(Object obj, long j, double d);

    /* JADX INFO: renamed from: n */
    public abstract void mo63671n(Object obj, long j, float f);

    /* JADX INFO: renamed from: o */
    public final void m92808o(long j, Object obj, int i) {
        this.f269112a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m92809p(Object obj, long j, long j2) {
        this.f269112a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m92810q(Object obj, long j, Object obj2) {
        this.f269112a.putObject(obj, j, obj2);
    }
}
