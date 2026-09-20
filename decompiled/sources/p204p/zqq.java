package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zqq implements yqq {

    /* JADX INFO: renamed from: a */
    public final float f285431a;

    /* JADX INFO: renamed from: b */
    public final float f285432b;

    public zqq(float f, float f2) {
        this.f285431a = f;
        this.f285432b = f2;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f285432b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqq)) {
            return false;
        }
        zqq zqqVar = (zqq) obj;
        return Float.compare(this.f285431a, zqqVar.f285431a) == 0 && Float.compare(this.f285432b, zqqVar.f285432b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f285432b) + (Float.hashCode(this.f285431a) * 31);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f285431a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f285431a);
        sb.append(", fontScale=");
        return ms2.m62684i(sb, this.f285432b, ')');
    }
}
