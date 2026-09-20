package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ng11 {

    /* JADX INFO: renamed from: a */
    public final String f153525a;

    /* JADX INFO: renamed from: b */
    public final boolean f153526b;

    /* JADX INFO: renamed from: c */
    public final boolean f153527c;

    /* JADX INFO: renamed from: d */
    public final gh00 f153528d;

    /* JADX INFO: renamed from: e */
    public final eh00 f153529e;

    /* JADX INFO: renamed from: f */
    public final eh00 f153530f;

    /* JADX INFO: renamed from: g */
    public final String f153531g;

    public ng11(String str, boolean z, boolean z2, gh00 gh00Var, eh00 eh00Var, eh00 eh00Var2, String str2) {
        this.f153525a = str;
        this.f153526b = z;
        this.f153527c = z2;
        this.f153528d = gh00Var;
        this.f153529e = eh00Var;
        this.f153530f = eh00Var2;
        this.f153531g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng11)) {
            return false;
        }
        ng11 ng11Var = (ng11) obj;
        return wj50.m88271j(this.f153525a, ng11Var.f153525a) && this.f153526b == ng11Var.f153526b && this.f153527c == ng11Var.f153527c && wj50.m88271j(this.f153528d, ng11Var.f153528d) && wj50.m88271j(this.f153529e, ng11Var.f153529e) && wj50.m88271j(this.f153530f, ng11Var.f153530f) && wj50.m88271j(this.f153531g, ng11Var.f153531g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(this.f153525a.hashCode() * 31, 31, this.f153526b), 31, this.f153527c);
        gh00 gh00Var = this.f153528d;
        int iHashCode = (iM77245d + (gh00Var == null ? 0 : gh00Var.hashCode())) * 31;
        eh00 eh00Var = this.f153529e;
        int iHashCode2 = (iHashCode + (eh00Var == null ? 0 : eh00Var.hashCode())) * 31;
        eh00 eh00Var2 = this.f153530f;
        int iHashCode3 = (iHashCode2 + (eh00Var2 == null ? 0 : eh00Var2.hashCode())) * 31;
        String str = this.f153531g;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
