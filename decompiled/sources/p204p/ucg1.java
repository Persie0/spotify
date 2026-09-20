package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ucg1 extends j7f1 {
    @Override // p204p.j7f1
    /* JADX INFO: renamed from: a */
    public final double mo52618a(Object obj, long j) {
        return Double.longBitsToDouble(this.f109588a.getLong(obj, j));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: d */
    public final float mo52619d(Object obj, long j) {
        return Float.intBitsToFloat(this.f109588a.getInt(obj, j));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: h */
    public final void mo43817h(Object obj, long j, boolean z) {
        if (adg1.f14626g) {
            adg1.m25541c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            adg1.m25542d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: j */
    public final void mo52620j(Object obj, long j, byte b) {
        if (adg1.f14626g) {
            adg1.m25541c(obj, j, b);
        } else {
            adg1.m25542d(obj, j, b);
        }
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: m */
    public final void mo52621m(Object obj, long j, double d) {
        this.f109588a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: q */
    public final void mo52622q(Object obj, long j, float f) {
        this.f109588a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: s */
    public final boolean mo52623s(Object obj, long j) {
        return adg1.f14626g ? adg1.m25551m(obj, j) : adg1.m25552n(obj, j);
    }
}
