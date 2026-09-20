package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bzd0 {

    /* JADX INFO: renamed from: a */
    public final String f32466a;

    /* JADX INFO: renamed from: b */
    public final String f32467b;

    /* JADX INFO: renamed from: c */
    public final String f32468c;

    /* JADX INFO: renamed from: d */
    public final String f32469d;

    /* JADX INFO: renamed from: e */
    public final String f32470e;

    /* JADX INFO: renamed from: f */
    public final String f32471f;

    /* JADX INFO: renamed from: g */
    public final eh00 f32472g;

    /* JADX INFO: renamed from: h */
    public final String f32473h;

    /* JADX INFO: renamed from: i */
    public final String f32474i;

    /* JADX INFO: renamed from: j */
    public final eh00 f32475j;

    public bzd0(String str, String str2, String str3, String str4, String str5, String str6, eh00 eh00Var, String str7, String str8, eh00 eh00Var2) {
        this.f32466a = str;
        this.f32467b = str2;
        this.f32468c = str3;
        this.f32469d = str4;
        this.f32470e = str5;
        this.f32471f = str6;
        this.f32472g = eh00Var;
        this.f32473h = str7;
        this.f32474i = str8;
        this.f32475j = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzd0)) {
            return false;
        }
        bzd0 bzd0Var = (bzd0) obj;
        return wj50.m88271j(this.f32466a, bzd0Var.f32466a) && wj50.m88271j(this.f32467b, bzd0Var.f32467b) && wj50.m88271j(this.f32468c, bzd0Var.f32468c) && wj50.m88271j(this.f32469d, bzd0Var.f32469d) && wj50.m88271j(this.f32470e, bzd0Var.f32470e) && wj50.m88271j(this.f32471f, bzd0Var.f32471f) && wj50.m88271j(this.f32472g, bzd0Var.f32472g) && wj50.m88271j(this.f32473h, bzd0Var.f32473h) && wj50.m88271j(this.f32474i, bzd0Var.f32474i) && wj50.m88271j(this.f32475j, bzd0Var.f32475j);
    }

    public final int hashCode() {
        int iM68853j = p1v.m68853j(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f32466a.hashCode() * 31, 31, this.f32467b), 31, this.f32468c), 31, this.f32469d), 31, this.f32470e), 31, this.f32471f), this.f32472g, 31);
        String str = this.f32473h;
        int iHashCode = (iM68853j + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32474i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        eh00 eh00Var = this.f32475j;
        return iHashCode2 + (eh00Var != null ? eh00Var.hashCode() : 0);
    }
}
