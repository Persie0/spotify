package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class u4a1 extends y4a1 {
    public u4a1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: c */
    public final boolean mo63664c(long j, Object obj) {
        return this.f269112a.getBoolean(obj, j);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: d */
    public final byte mo63665d(long j, Object obj) {
        return this.f269112a.getByte(obj, j);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: e */
    public final double mo63666e(long j, Object obj) {
        return this.f269112a.getDouble(obj, j);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: f */
    public final float mo63667f(long j, Object obj) {
        return this.f269112a.getFloat(obj, j);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: k */
    public final void mo63668k(Object obj, long j, boolean z) {
        this.f269112a.putBoolean(obj, j, z);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: l */
    public final void mo63669l(Object obj, long j, byte b) {
        this.f269112a.putByte(obj, j, b);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: m */
    public final void mo63670m(Object obj, long j, double d) {
        this.f269112a.putDouble(obj, j, d);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: n */
    public final void mo63671n(Object obj, long j, float f) {
        this.f269112a.putFloat(obj, j, f);
    }
}
