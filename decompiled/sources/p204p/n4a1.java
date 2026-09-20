package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class n4a1 extends y4a1 {
    @Override // p204p.y4a1
    /* JADX INFO: renamed from: c */
    public final boolean mo63664c(long j, Object obj) {
        if (c5a1.f34129h) {
            return c5a1.m31471g(j, obj) != 0;
        }
        return c5a1.m31472h(j, obj) != 0;
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: d */
    public final byte mo63665d(long j, Object obj) {
        return c5a1.f34129h ? c5a1.m31471g(j, obj) : c5a1.m31472h(j, obj);
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: e */
    public final double mo63666e(long j, Object obj) {
        return Double.longBitsToDouble(m92805h(j, obj));
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: f */
    public final float mo63667f(long j, Object obj) {
        return Float.intBitsToFloat(m92804g(j, obj));
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: k */
    public final void mo63668k(Object obj, long j, boolean z) {
        if (c5a1.f34129h) {
            c5a1.m31475k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            c5a1.m31476l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: l */
    public final void mo63669l(Object obj, long j, byte b) {
        if (c5a1.f34129h) {
            c5a1.m31475k(obj, j, b);
        } else {
            c5a1.m31476l(obj, j, b);
        }
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: m */
    public final void mo63670m(Object obj, long j, double d) {
        m92809p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p204p.y4a1
    /* JADX INFO: renamed from: n */
    public final void mo63671n(Object obj, long j, float f) {
        m92808o(j, obj, Float.floatToIntBits(f));
    }
}
