package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tva1 implements uva1 {

    /* JADX INFO: renamed from: a */
    public final String f224106a;

    /* JADX INFO: renamed from: b */
    public final wwu f224107b;

    /* JADX INFO: renamed from: c */
    public final eh00 f224108c;

    public tva1(String str, wwu wwuVar, eh00 eh00Var) {
        this.f224106a = str;
        this.f224107b = wwuVar;
        this.f224108c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tva1)) {
            return false;
        }
        tva1 tva1Var = (tva1) obj;
        return wj50.m88271j(this.f224106a, tva1Var.f224106a) && wj50.m88271j(this.f224107b, tva1Var.f224107b) && wj50.m88271j(this.f224108c, tva1Var.f224108c);
    }

    public final int hashCode() {
        int iHashCode = (this.f224107b.hashCode() + (this.f224106a.hashCode() * 31)) * 31;
        eh00 eh00Var = this.f224108c;
        return iHashCode + (eh00Var == null ? 0 : eh00Var.hashCode());
    }
}
