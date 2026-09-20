package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u41 {

    /* JADX INFO: renamed from: a */
    public final String f226526a;

    /* JADX INFO: renamed from: b */
    public final boolean f226527b;

    /* JADX INFO: renamed from: c */
    public final String f226528c;

    public u41(String str, String str2, boolean z) {
        this.f226526a = str;
        this.f226527b = z;
        this.f226528c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u41)) {
            return false;
        }
        u41 u41Var = (u41) obj;
        return wj50.m88271j(this.f226526a, u41Var.f226526a) && this.f226527b == u41Var.f226527b && wj50.m88271j(this.f226528c, u41Var.f226528c);
    }

    public final int hashCode() {
        int iHashCode = (k8j0.f120376a.hashCode() + s571.m77245d(this.f226526a.hashCode() * 31, 31, this.f226527b)) * 31;
        String str = this.f226528c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
