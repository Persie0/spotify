package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n410 {

    /* JADX INFO: renamed from: a */
    public final String f150162a;

    /* JADX INFO: renamed from: b */
    public final String f150163b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f150164c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f150165d;

    /* JADX INFO: renamed from: e */
    public final String f150166e;

    /* JADX INFO: renamed from: f */
    public final String f150167f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f150168g;

    /* JADX INFO: renamed from: h */
    public final int f150169h;

    /* JADX INFO: renamed from: i */
    public final Integer f150170i;

    /* JADX INFO: renamed from: j */
    public final String f150171j;

    public n410(String str, String str2, CharSequence charSequence, CharSequence charSequence2, String str3, String str4, rcm0 rcm0Var, int i, Integer num, String str5) {
        this.f150162a = str;
        this.f150163b = str2;
        this.f150164c = charSequence;
        this.f150165d = charSequence2;
        this.f150166e = str3;
        this.f150167f = str4;
        this.f150168g = rcm0Var;
        this.f150169h = i;
        this.f150170i = num;
        this.f150171j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n410)) {
            return false;
        }
        n410 n410Var = (n410) obj;
        return wj50.m88271j(this.f150162a, n410Var.f150162a) && wj50.m88271j(this.f150163b, n410Var.f150163b) && wj50.m88271j(this.f150164c, n410Var.f150164c) && wj50.m88271j(this.f150165d, n410Var.f150165d) && wj50.m88271j(this.f150166e, n410Var.f150166e) && wj50.m88271j(this.f150167f, n410Var.f150167f) && wj50.m88271j(this.f150168g, n410Var.f150168g) && this.f150169h == n410Var.f150169h && wj50.m88271j(this.f150170i, n410Var.f150170i) && wj50.m88271j(this.f150171j, n410Var.f150171j);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f150169h, yds.m93483m(this.f150168g, s571.m77243b(s571.m77243b((this.f150165d.hashCode() + ((this.f150164c.hashCode() + s571.m77243b(this.f150162a.hashCode() * 31, 31, this.f150163b)) * 31)) * 31, 31, this.f150166e), 31, this.f150167f), 31), 31);
        Integer num = this.f150170i;
        int iHashCode = (iM62800g + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f150171j;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
