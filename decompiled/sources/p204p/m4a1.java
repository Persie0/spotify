package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m4a1 extends x4a1 {
    @Override // p204p.x4a1
    /* JADX INFO: renamed from: c */
    public final void mo60796c(long j, byte[] bArr, long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: d */
    public final boolean mo60797d(long j, Object obj) {
        if (b5a1.f23541h) {
            return b5a1.m28161h(j, obj) != 0;
        }
        return b5a1.m28162i(j, obj) != 0;
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: e */
    public final byte mo60798e(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: f */
    public final byte mo60799f(long j, Object obj) {
        return b5a1.f23541h ? b5a1.m28161h(j, obj) : b5a1.m28162i(j, obj);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: g */
    public final double mo60800g(long j, Object obj) {
        return Double.longBitsToDouble(m89843j(j, obj));
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: h */
    public final float mo60801h(long j, Object obj) {
        return Float.intBitsToFloat(m89842i(j, obj));
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: m */
    public final void mo60802m(Object obj, long j, boolean z) {
        if (b5a1.f23541h) {
            b5a1.m28165l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            b5a1.m28166m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: n */
    public final void mo60803n(Object obj, long j, byte b) {
        if (b5a1.f23541h) {
            b5a1.m28165l(obj, j, b);
        } else {
            b5a1.m28166m(obj, j, b);
        }
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: o */
    public final void mo60804o(Object obj, long j, double d) {
        m89847r(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: p */
    public final void mo60805p(Object obj, long j, float f) {
        m89846q(j, obj, Float.floatToIntBits(f));
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: u */
    public final boolean mo60806u() {
        return false;
    }
}
