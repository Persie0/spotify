package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j98 {

    /* JADX INFO: renamed from: a */
    public final String f110114a;

    /* JADX INFO: renamed from: b */
    public final String f110115b;

    /* JADX INFO: renamed from: c */
    public final boolean f110116c;

    /* JADX INFO: renamed from: d */
    public final String f110117d;

    public j98(String str, String str2, boolean z, String str3) {
        this.f110114a = str;
        this.f110115b = str2;
        this.f110116c = z;
        this.f110117d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j98)) {
            return false;
        }
        j98 j98Var = (j98) obj;
        return wj50.m88271j(this.f110114a, j98Var.f110114a) && wj50.m88271j(this.f110115b, j98Var.f110115b) && this.f110116c == j98Var.f110116c && wj50.m88271j(this.f110117d, j98Var.f110117d);
    }

    public final int hashCode() {
        String str = this.f110114a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f110115b;
        int iM77245d = s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f110116c);
        String str3 = this.f110117d;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }
}
