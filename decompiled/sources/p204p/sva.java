package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sva extends qva {

    /* JADX INFO: renamed from: e */
    public float f214369e;

    public sva(float f) {
        super(null);
        this.f214369e = f;
    }

    @Override // p204p.qva
    /* JADX INFO: renamed from: e */
    public final float mo73979e() {
        char[] cArr;
        if (Float.isNaN(this.f214369e) && (cArr = this.f192949a) != null && cArr.length >= 1) {
            this.f214369e = Float.parseFloat(m73978d());
        }
        return this.f214369e;
    }

    @Override // p204p.qva
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sva) {
            float fMo73979e = mo73979e();
            float fMo73979e2 = ((sva) obj).mo73979e();
            if ((Float.isNaN(fMo73979e) && Float.isNaN(fMo73979e2)) || fMo73979e == fMo73979e2) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.qva
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f = this.f214369e;
        return iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    @Override // p204p.qva
    /* JADX INFO: renamed from: i */
    public final int mo73980i() {
        char[] cArr;
        if (Float.isNaN(this.f214369e) && (cArr = this.f192949a) != null && cArr.length >= 1) {
            this.f214369e = Integer.parseInt(m73978d());
        }
        return (int) this.f214369e;
    }
}
