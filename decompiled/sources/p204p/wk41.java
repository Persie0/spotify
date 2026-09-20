package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wk41 {

    /* JADX INFO: renamed from: a */
    public final qas f252118a;

    /* JADX INFO: renamed from: b */
    public final daj f252119b;

    /* JADX INFO: renamed from: c */
    public final hz80 f252120c;

    /* JADX INFO: renamed from: d */
    public final cvb1 f252121d;

    public wk41(qas qasVar, daj dajVar, hz80 hz80Var, cvb1 cvb1Var) {
        this.f252118a = qasVar;
        this.f252119b = dajVar;
        this.f252120c = hz80Var;
        this.f252121d = cvb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk41)) {
            return false;
        }
        wk41 wk41Var = (wk41) obj;
        return wj50.m88271j(this.f252118a, wk41Var.f252118a) && wj50.m88271j(this.f252119b, wk41Var.f252119b) && wj50.m88271j(this.f252120c, wk41Var.f252120c) && this.f252121d == wk41Var.f252121d;
    }

    public final int hashCode() {
        qas qasVar = this.f252118a;
        int iHashCode = (qasVar == null ? 0 : qasVar.hashCode()) * 31;
        daj dajVar = this.f252119b;
        int iHashCode2 = (iHashCode + (dajVar == null ? 0 : dajVar.hashCode())) * 31;
        hz80 hz80Var = this.f252120c;
        return this.f252121d.hashCode() + ((iHashCode2 + (hz80Var != null ? hz80Var.hashCode() : 0)) * 31);
    }
}
