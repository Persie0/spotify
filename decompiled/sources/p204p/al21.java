package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class al21 {

    /* JADX INFO: renamed from: a */
    public final Integer f16749a;

    /* JADX INFO: renamed from: b */
    public final int f16750b;

    /* JADX INFO: renamed from: c */
    public final int f16751c;

    /* JADX INFO: renamed from: d */
    public final Integer f16752d;

    /* JADX INFO: renamed from: e */
    public final boolean f16753e;

    public al21(Integer num, int i, int i2, Integer num2, boolean z) {
        this.f16749a = num;
        this.f16750b = i;
        this.f16751c = i2;
        this.f16752d = num2;
        this.f16753e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al21)) {
            return false;
        }
        al21 al21Var = (al21) obj;
        return wj50.m88271j(this.f16749a, al21Var.f16749a) && this.f16750b == al21Var.f16750b && this.f16751c == al21Var.f16751c && wj50.m88271j(this.f16752d, al21Var.f16752d) && this.f16753e == al21Var.f16753e;
    }

    public final int hashCode() {
        Integer num = this.f16749a;
        int iM62800g = mt60.m62800g(this.f16751c, mt60.m62800g(this.f16750b, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
        Integer num2 = this.f16752d;
        return Boolean.hashCode(this.f16753e) + ((iM62800g + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
