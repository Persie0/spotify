package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q220 {

    /* JADX INFO: renamed from: a */
    public final String f184464a;

    /* JADX INFO: renamed from: b */
    public final String f184465b;

    /* JADX INFO: renamed from: c */
    public final nmn0 f184466c;

    /* JADX INFO: renamed from: d */
    public final pbd f184467d;

    /* JADX INFO: renamed from: e */
    public final qf40 f184468e;

    public q220(String str, String str2, nmn0 nmn0Var, pbd pbdVar, qf40 qf40Var) {
        this.f184464a = str;
        this.f184465b = str2;
        this.f184466c = nmn0Var;
        this.f184467d = pbdVar;
        this.f184468e = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q220)) {
            return false;
        }
        q220 q220Var = (q220) obj;
        return wj50.m88271j(this.f184464a, q220Var.f184464a) && wj50.m88271j(this.f184465b, q220Var.f184465b) && wj50.m88271j(this.f184466c, q220Var.f184466c) && wj50.m88271j(this.f184467d, q220Var.f184467d) && wj50.m88271j(this.f184468e, q220Var.f184468e);
    }

    public final int hashCode() {
        int iHashCode = this.f184464a.hashCode() * 31;
        String str = this.f184465b;
        return this.f184468e.hashCode() + ((this.f184467d.hashCode() + ((this.f184466c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 961)) * 31)) * 31);
    }
}
