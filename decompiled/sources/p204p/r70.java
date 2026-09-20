package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r70 implements t70 {

    /* JADX INFO: renamed from: a */
    public final String f196398a;

    /* JADX INFO: renamed from: b */
    public final String f196399b;

    /* JADX INFO: renamed from: c */
    public final eh00 f196400c;

    /* JADX INFO: renamed from: d */
    public final wwu f196401d;

    /* JADX INFO: renamed from: e */
    public final udu f196402e;

    /* JADX INFO: renamed from: f */
    public final sgj f196403f;

    public r70(String str, String str2, eh00 eh00Var, wwu wwuVar, udu uduVar, rgj rgjVar, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        wwuVar = (i & 8) != 0 ? null : wwuVar;
        uduVar = (i & 32) != 0 ? sdu.f208086a : uduVar;
        sgj sgjVar = (i & 64) != 0 ? qgj.f188480a : rgjVar;
        this.f196398a = str;
        this.f196399b = str2;
        this.f196400c = eh00Var;
        this.f196401d = wwuVar;
        this.f196402e = uduVar;
        this.f196403f = sgjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r70)) {
            return false;
        }
        r70 r70Var = (r70) obj;
        return this.f196398a.equals(r70Var.f196398a) && wj50.m88271j(this.f196399b, r70Var.f196399b) && wj50.m88271j(this.f196400c, r70Var.f196400c) && wj50.m88271j(this.f196401d, r70Var.f196401d) && wj50.m88271j(this.f196402e, r70Var.f196402e) && wj50.m88271j(this.f196403f, r70Var.f196403f);
    }

    @Override // p204p.t70
    public final String getKey() {
        return this.f196398a;
    }

    public final int hashCode() {
        int iHashCode = this.f196398a.hashCode() * 31;
        String str = this.f196399b;
        int iM68853j = p1v.m68853j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f196400c, 31);
        wwu wwuVar = this.f196401d;
        return this.f196403f.hashCode() + ((this.f196402e.hashCode() + ((iM68853j + (wwuVar != null ? wwuVar.hashCode() : 0)) * 961)) * 31);
    }
}
