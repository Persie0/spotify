package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kvl0 {

    /* JADX INFO: renamed from: a */
    public final xi3 f126905a;

    /* JADX INFO: renamed from: b */
    public final wr31 f126906b;

    /* JADX INFO: renamed from: c */
    public final w6z f126907c;

    /* JADX INFO: renamed from: d */
    public final ibj f126908d;

    /* JADX INFO: renamed from: e */
    public final Boolean f126909e;

    /* JADX INFO: renamed from: f */
    public final oe70 f126910f;

    public kvl0(xi3 xi3Var, wr31 wr31Var, w6z w6zVar, ibj ibjVar, Boolean bool, oe70 oe70Var, int i) {
        xi3Var = (i & 1) != 0 ? null : xi3Var;
        wr31Var = (i & 2) != 0 ? null : wr31Var;
        w6zVar = (i & 4) != 0 ? null : w6zVar;
        ibjVar = (i & 8) != 0 ? null : ibjVar;
        bool = (i & 16) != 0 ? null : bool;
        oe70Var = (i & 32) != 0 ? null : oe70Var;
        this.f126905a = xi3Var;
        this.f126906b = wr31Var;
        this.f126907c = w6zVar;
        this.f126908d = ibjVar;
        this.f126909e = bool;
        this.f126910f = oe70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvl0)) {
            return false;
        }
        kvl0 kvl0Var = (kvl0) obj;
        return this.f126905a == kvl0Var.f126905a && this.f126906b == kvl0Var.f126906b && wj50.m88271j(this.f126907c, kvl0Var.f126907c) && wj50.m88271j(this.f126908d, kvl0Var.f126908d) && wj50.m88271j(this.f126909e, kvl0Var.f126909e) && wj50.m88271j(this.f126910f, kvl0Var.f126910f);
    }

    public final int hashCode() {
        xi3 xi3Var = this.f126905a;
        int iHashCode = (xi3Var == null ? 0 : xi3Var.hashCode()) * 31;
        wr31 wr31Var = this.f126906b;
        int iHashCode2 = (iHashCode + (wr31Var == null ? 0 : wr31Var.hashCode())) * 31;
        w6z w6zVar = this.f126907c;
        int iHashCode3 = (iHashCode2 + (w6zVar == null ? 0 : w6zVar.hashCode())) * 31;
        ibj ibjVar = this.f126908d;
        int iHashCode4 = (iHashCode3 + (ibjVar == null ? 0 : ibjVar.hashCode())) * 31;
        Boolean bool = this.f126909e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        oe70 oe70Var = this.f126910f;
        return iHashCode5 + (oe70Var != null ? oe70Var.hashCode() : 0);
    }
}
