package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ug00 {

    /* JADX INFO: renamed from: a */
    public final String f229934a;

    /* JADX INFO: renamed from: b */
    public final boolean f229935b;

    /* JADX INFO: renamed from: c */
    public final String f229936c;

    /* JADX INFO: renamed from: d */
    public final String f229937d;

    /* JADX INFO: renamed from: e */
    public final boolean f229938e;

    /* JADX INFO: renamed from: f */
    public final String f229939f;

    public ug00(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f229934a = str;
        this.f229935b = z;
        this.f229936c = str2;
        this.f229937d = str3;
        this.f229938e = z2;
        this.f229939f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug00)) {
            return false;
        }
        ug00 ug00Var = (ug00) obj;
        return wj50.m88271j(this.f229934a, ug00Var.f229934a) && this.f229935b == ug00Var.f229935b && wj50.m88271j(this.f229936c, ug00Var.f229936c) && wj50.m88271j(this.f229937d, ug00Var.f229937d) && this.f229938e == ug00Var.f229938e && wj50.m88271j(this.f229939f, ug00Var.f229939f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77245d(this.f229934a.hashCode() * 31, 31, this.f229935b), 31, this.f229936c), 31, this.f229937d), 31, this.f229938e);
        String str = this.f229939f;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
