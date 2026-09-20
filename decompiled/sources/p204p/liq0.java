package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class liq0 {

    /* JADX INFO: renamed from: a */
    public final String f133863a;

    /* JADX INFO: renamed from: b */
    public final int f133864b;

    /* JADX INFO: renamed from: c */
    public final int f133865c;

    /* JADX INFO: renamed from: d */
    public final float f133866d;

    public liq0(String str, int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        this.f133863a = str;
        this.f133864b = i;
        this.f133865c = i2;
        this.f133866d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liq0)) {
            return false;
        }
        liq0 liq0Var = (liq0) obj;
        return wj50.m88271j(this.f133863a, liq0Var.f133863a) && this.f133864b == liq0Var.f133864b && this.f133865c == liq0Var.f133865c && Float.compare(this.f133866d, liq0Var.f133866d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f133866d) + mt60.m62800g(this.f133865c, mt60.m62800g(this.f133864b, this.f133863a.hashCode() * 31, 31), 31);
    }
}
