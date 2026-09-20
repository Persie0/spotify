package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b060 implements c060 {

    /* JADX INFO: renamed from: a */
    public final String f21778a;

    /* JADX INFO: renamed from: b */
    public final String f21779b;

    /* JADX INFO: renamed from: c */
    public final boolean f21780c;

    /* JADX INFO: renamed from: d */
    public final boolean f21781d;

    public b060(String str, boolean z, String str2, boolean z2) {
        this.f21778a = str;
        this.f21779b = str2;
        this.f21780c = z;
        this.f21781d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b060)) {
            return false;
        }
        b060 b060Var = (b060) obj;
        return wj50.m88271j(this.f21778a, b060Var.f21778a) && wj50.m88271j(this.f21779b, b060Var.f21779b) && this.f21780c == b060Var.f21780c && this.f21781d == b060Var.f21781d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21781d) + s571.m77245d(s571.m77243b(this.f21778a.hashCode() * 31, 31, this.f21779b), 31, this.f21780c);
    }
}
