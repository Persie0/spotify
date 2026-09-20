package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dno0 {

    /* JADX INFO: renamed from: a */
    public final rno0 f50862a;

    /* JADX INFO: renamed from: b */
    public final s8k f50863b;

    /* JADX INFO: renamed from: c */
    public final zbr f50864c;

    public /* synthetic */ dno0() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dno0)) {
            return false;
        }
        dno0 dno0Var = (dno0) obj;
        return wj50.m88271j(this.f50862a, dno0Var.f50862a) && wj50.m88271j(this.f50863b, dno0Var.f50863b) && wj50.m88271j(this.f50864c, dno0Var.f50864c);
    }

    public final int hashCode() {
        rno0 rno0Var = this.f50862a;
        int iHashCode = (rno0Var == null ? 0 : rno0Var.hashCode()) * 31;
        s8k s8kVar = this.f50863b;
        int iHashCode2 = (iHashCode + (s8kVar == null ? 0 : s8kVar.hashCode())) * 31;
        zbr zbrVar = this.f50864c;
        return iHashCode2 + (zbrVar != null ? zbrVar.hashCode() : 0);
    }

    public dno0(rno0 rno0Var, s8k s8kVar, zbr zbrVar) {
        this.f50862a = rno0Var;
        this.f50863b = s8kVar;
        this.f50864c = zbrVar;
    }
}
