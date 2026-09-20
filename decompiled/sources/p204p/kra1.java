package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kra1 {

    /* JADX INFO: renamed from: a */
    public final int f125595a;

    /* JADX INFO: renamed from: b */
    public final int f125596b;

    /* JADX INFO: renamed from: c */
    public final int f125597c;

    /* JADX INFO: renamed from: d */
    public final String f125598d;

    /* JADX INFO: renamed from: e */
    public final String f125599e;

    public kra1(String str, int i, int i2, int i3, String str2) {
        this.f125595a = i;
        this.f125596b = i2;
        this.f125597c = i3;
        this.f125598d = str;
        this.f125599e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kra1)) {
            return false;
        }
        kra1 kra1Var = (kra1) obj;
        return this.f125595a == kra1Var.f125595a && this.f125596b == kra1Var.f125596b && this.f125597c == kra1Var.f125597c && wj50.m88271j(this.f125598d, kra1Var.f125598d) && wj50.m88271j(this.f125599e, kra1Var.f125599e);
    }

    public final int hashCode() {
        return this.f125599e.hashCode() + s571.m77243b(mt60.m62800g(this.f125597c, mt60.m62800g(this.f125596b, Integer.hashCode(this.f125595a) * 31, 31), 31), 31, this.f125598d);
    }
}
