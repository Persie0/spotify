package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class s4a1 extends w4a1 {
    public s4a1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: c */
    public final boolean mo58132c(long j, Object obj) {
        return this.f247759a.getBoolean(obj, j);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: d */
    public final byte mo58133d(long j, Object obj) {
        return this.f247759a.getByte(obj, j);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: e */
    public final double mo58134e(long j, Object obj) {
        return this.f247759a.getDouble(obj, j);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: f */
    public final float mo58135f(long j, Object obj) {
        return this.f247759a.getFloat(obj, j);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: k */
    public final void mo58136k(Object obj, long j, boolean z) {
        this.f247759a.putBoolean(obj, j, z);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: l */
    public final void mo58137l(Object obj, long j, byte b) {
        this.f247759a.putByte(obj, j, b);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: m */
    public final void mo58138m(Object obj, long j, double d) {
        this.f247759a.putDouble(obj, j, d);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: n */
    public final void mo58139n(Object obj, long j, float f) {
        this.f247759a.putFloat(obj, j, f);
    }
}
