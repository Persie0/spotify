package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class icf1 extends j7f1 {
    @Override // p204p.j7f1
    /* JADX INFO: renamed from: c */
    public final boolean mo47111c(long j, Object obj) {
        return jcf1.f111119e ? jcf1.m52973j(j, obj) : jcf1.m52974k(j, obj);
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: e */
    public final void mo47112e(Object obj, long j, boolean z) {
        if (jcf1.f111119e) {
            jcf1.m52975l(obj, j, z);
        } else {
            jcf1.m52976m(obj, j, z);
        }
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: g */
    public final float mo47113g(long j, Object obj) {
        return Float.intBitsToFloat(this.f109588a.getInt(obj, j));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: k */
    public final void mo47114k(Object obj, long j, float f) {
        this.f109588a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: l */
    public final double mo47115l(long j, Object obj) {
        return Double.longBitsToDouble(this.f109588a.getLong(obj, j));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: p */
    public final void mo47116p(Object obj, long j, double d) {
        this.f109588a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
