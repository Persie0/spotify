package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p0m {

    /* JADX INFO: renamed from: a */
    public final String f172712a;

    /* JADX INFO: renamed from: b */
    public final String f172713b;

    /* JADX INFO: renamed from: c */
    public final String f172714c;

    public p0m(String str, String str2, String str3) {
        this.f172712a = str;
        this.f172713b = str2;
        this.f172714c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0m)) {
            return false;
        }
        p0m p0mVar = (p0m) obj;
        return wj50.m88271j(this.f172712a, p0mVar.f172712a) && wj50.m88271j(this.f172713b, p0mVar.f172713b) && wj50.m88271j(this.f172714c, p0mVar.f172714c);
    }

    public final int hashCode() {
        return this.f172714c.hashCode() + s571.m77243b(this.f172712a.hashCode() * 31, 31, this.f172713b);
    }
}
