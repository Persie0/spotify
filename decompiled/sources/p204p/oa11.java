package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oa11 {

    /* JADX INFO: renamed from: a */
    public final pla1 f163174a;

    /* JADX INFO: renamed from: b */
    public final String f163175b;

    /* JADX INFO: renamed from: c */
    public final int f163176c;

    /* JADX INFO: renamed from: d */
    public final String f163177d;

    public oa11(pla1 pla1Var, String str, int i, String str2) {
        this.f163174a = pla1Var;
        this.f163175b = str;
        this.f163176c = i;
        this.f163177d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa11)) {
            return false;
        }
        oa11 oa11Var = (oa11) obj;
        return wj50.m88271j(this.f163174a, oa11Var.f163174a) && wj50.m88271j(this.f163175b, oa11Var.f163175b) && this.f163176c == oa11Var.f163176c && wj50.m88271j(this.f163177d, oa11Var.f163177d);
    }

    public final int hashCode() {
        return this.f163177d.hashCode() + mt60.m62800g(this.f163176c, s571.m77243b(this.f163174a.hashCode() * 31, 31, this.f163175b), 31);
    }
}
