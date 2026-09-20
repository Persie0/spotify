package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fdu {

    /* JADX INFO: renamed from: a */
    public final String f68563a;

    /* JADX INFO: renamed from: b */
    public final eh00 f68564b;

    /* JADX INFO: renamed from: c */
    public final eh00 f68565c;

    public fdu(String str, eh00 eh00Var, eh00 eh00Var2) {
        this.f68563a = str;
        this.f68564b = eh00Var;
        this.f68565c = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdu)) {
            return false;
        }
        fdu fduVar = (fdu) obj;
        return wj50.m88271j(this.f68563a, fduVar.f68563a) && wj50.m88271j(this.f68564b, fduVar.f68564b) && wj50.m88271j(this.f68565c, fduVar.f68565c);
    }

    public final int hashCode() {
        return this.f68565c.hashCode() + p1v.m68853j(this.f68563a.hashCode() * 31, this.f68564b, 31);
    }
}
