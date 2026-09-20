package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sxa0 {

    /* JADX INFO: renamed from: a */
    public final String f214859a;

    /* JADX INFO: renamed from: b */
    public final String f214860b;

    /* JADX INFO: renamed from: c */
    public final wwu f214861c;

    /* JADX INFO: renamed from: d */
    public final rxa0 f214862d;

    /* JADX INFO: renamed from: e */
    public final rxa0 f214863e;

    /* JADX INFO: renamed from: f */
    public final lhr f214864f;

    /* JADX INFO: renamed from: g */
    public final eh00 f214865g;

    /* JADX INFO: renamed from: h */
    public final eh00 f214866h;

    public sxa0(String str, String str2, wwu wwuVar, rxa0 rxa0Var, rxa0 rxa0Var2, lhr lhrVar, eh00 eh00Var, eh00 eh00Var2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        wwuVar = (i & 4) != 0 ? null : wwuVar;
        rxa0Var2 = (i & 16) != 0 ? null : rxa0Var2;
        lhrVar = (i & 32) != 0 ? new lhr(7, false, false, false) : lhrVar;
        eh00Var = (i & 64) != 0 ? bba0.f25509Z0 : eh00Var;
        eh00Var2 = (i & 128) != 0 ? bba0.f25510a1 : eh00Var2;
        this.f214859a = str;
        this.f214860b = str2;
        this.f214861c = wwuVar;
        this.f214862d = rxa0Var;
        this.f214863e = rxa0Var2;
        this.f214864f = lhrVar;
        this.f214865g = eh00Var;
        this.f214866h = eh00Var2;
    }

    /* JADX INFO: renamed from: a */
    public final eh00 m79590a() {
        return this.f214865g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxa0)) {
            return false;
        }
        sxa0 sxa0Var = (sxa0) obj;
        return wj50.m88271j(this.f214859a, sxa0Var.f214859a) && wj50.m88271j(this.f214860b, sxa0Var.f214860b) && wj50.m88271j(this.f214861c, sxa0Var.f214861c) && wj50.m88271j(this.f214862d, sxa0Var.f214862d) && wj50.m88271j(this.f214863e, sxa0Var.f214863e) && wj50.m88271j(this.f214864f, sxa0Var.f214864f) && wj50.m88271j(this.f214865g, sxa0Var.f214865g) && wj50.m88271j(this.f214866h, sxa0Var.f214866h);
    }

    public final int hashCode() {
        String str = this.f214859a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f214860b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        wwu wwuVar = this.f214861c;
        int iHashCode3 = (iHashCode2 + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31;
        rxa0 rxa0Var = this.f214862d;
        int iHashCode4 = (iHashCode3 + (rxa0Var == null ? 0 : rxa0Var.hashCode())) * 31;
        rxa0 rxa0Var2 = this.f214863e;
        return this.f214866h.hashCode() + p1v.m68853j((this.f214864f.hashCode() + ((iHashCode4 + (rxa0Var2 != null ? rxa0Var2.hashCode() : 0)) * 31)) * 31, this.f214865g, 31);
    }
}
