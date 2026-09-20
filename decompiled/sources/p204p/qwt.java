package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qwt {

    /* JADX INFO: renamed from: a */
    public final loi0 f193418a;

    /* JADX INFO: renamed from: b */
    public final eh00 f193419b;

    /* JADX INFO: renamed from: c */
    public final String f193420c;

    public qwt(loi0 loi0Var, eh00 eh00Var, String str) {
        this.f193418a = loi0Var;
        this.f193419b = eh00Var;
        this.f193420c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwt)) {
            return false;
        }
        qwt qwtVar = (qwt) obj;
        return wj50.m88271j(this.f193418a, qwtVar.f193418a) && wj50.m88271j(this.f193419b, qwtVar.f193419b) && wj50.m88271j(this.f193420c, qwtVar.f193420c);
    }

    public final int hashCode() {
        return this.f193420c.hashCode() + p1v.m68853j(this.f193418a.hashCode() * 31, this.f193419b, 31);
    }
}
