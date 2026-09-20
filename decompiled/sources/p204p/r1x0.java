package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r1x0 {

    /* JADX INFO: renamed from: a */
    public final Integer f194942a;

    /* JADX INFO: renamed from: b */
    public final int f194943b;

    /* JADX INFO: renamed from: c */
    public final int f194944c;

    /* JADX INFO: renamed from: d */
    public final Integer f194945d;

    /* JADX INFO: renamed from: e */
    public final int f194946e;

    public r1x0(Integer num, int i, int i2, Integer num2, int i3) {
        this.f194942a = num;
        this.f194943b = i;
        this.f194944c = i2;
        this.f194945d = num2;
        this.f194946e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1x0)) {
            return false;
        }
        r1x0 r1x0Var = (r1x0) obj;
        return wj50.m88271j(this.f194942a, r1x0Var.f194942a) && this.f194943b == r1x0Var.f194943b && this.f194944c == r1x0Var.f194944c && wj50.m88271j(this.f194945d, r1x0Var.f194945d) && this.f194946e == r1x0Var.f194946e;
    }

    public final int hashCode() {
        Integer num = this.f194942a;
        int iM62800g = mt60.m62800g(this.f194944c, mt60.m62800g(this.f194943b, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
        Integer num2 = this.f194945d;
        return Integer.hashCode(this.f194946e) + ((iM62800g + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
