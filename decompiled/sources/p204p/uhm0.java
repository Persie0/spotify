package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uhm0 implements vhm0 {

    /* JADX INFO: renamed from: a */
    public final float f230484a;

    public uhm0(float f) {
        this.f230484a = f;
    }

    @Override // p204p.vhm0
    /* JADX INFO: renamed from: b */
    public final int mo30690b(lv70 lv70Var, int i) {
        return lv70Var.f137253b.mo35990l0(this.f230484a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhm0)) {
            return false;
        }
        return ybs.m93301b(this.f230484a, ((uhm0) obj).f230484a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f230484a);
    }
}
