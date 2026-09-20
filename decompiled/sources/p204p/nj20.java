package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nj20 {

    /* JADX INFO: renamed from: a */
    public final String f154423a;

    /* JADX INFO: renamed from: b */
    public final String f154424b;

    /* JADX INFO: renamed from: c */
    public final lj20 f154425c;

    public nj20(String str, String str2, lj20 lj20Var) {
        this.f154423a = str;
        this.f154424b = str2;
        this.f154425c = lj20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj20)) {
            return false;
        }
        nj20 nj20Var = (nj20) obj;
        return wj50.m88271j(this.f154423a, nj20Var.f154423a) && wj50.m88271j(this.f154424b, nj20Var.f154424b) && wj50.m88271j(this.f154425c, nj20Var.f154425c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f154423a.hashCode() * 31, 31, this.f154424b);
        lj20 lj20Var = this.f154425c;
        return iM77243b + (lj20Var == null ? 0 : lj20Var.hashCode());
    }
}
