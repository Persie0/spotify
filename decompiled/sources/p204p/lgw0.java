package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lgw0 {

    /* JADX INFO: renamed from: a */
    public final int f133305a;

    /* JADX INFO: renamed from: b */
    public final int f133306b;

    /* JADX INFO: renamed from: c */
    public final Integer f133307c;

    public lgw0(int i, int i2, Integer num) {
        this.f133305a = i;
        this.f133306b = i2;
        this.f133307c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgw0)) {
            return false;
        }
        lgw0 lgw0Var = (lgw0) obj;
        return this.f133305a == lgw0Var.f133305a && this.f133306b == lgw0Var.f133306b && wj50.m88271j(this.f133307c, lgw0Var.f133307c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f133306b, Integer.hashCode(this.f133305a) * 31, 31);
        Integer num = this.f133307c;
        return iM62800g + (num == null ? 0 : num.hashCode());
    }
}
