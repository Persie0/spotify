package p204p;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class ql11 {
    public static final nl11 Companion = new nl11();

    /* JADX INFO: renamed from: a */
    public final a2w f189697a;

    /* JADX INFO: renamed from: b */
    public final pl11 f189698b;

    /* JADX INFO: renamed from: c */
    public final av60 f189699c;

    public /* synthetic */ ql11(int i, a2w a2wVar, pl11 pl11Var, av60 av60Var) {
        if ((i & 1) == 0) {
            this.f189697a = null;
        } else {
            this.f189697a = a2wVar;
        }
        if ((i & 2) == 0) {
            this.f189698b = null;
        } else {
            this.f189698b = pl11Var;
        }
        if ((i & 4) == 0) {
            this.f189699c = null;
        } else {
            this.f189699c = av60Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql11)) {
            return false;
        }
        ql11 ql11Var = (ql11) obj;
        return wj50.m88271j(this.f189697a, ql11Var.f189697a) && wj50.m88271j(this.f189698b, ql11Var.f189698b) && wj50.m88271j(this.f189699c, ql11Var.f189699c);
    }

    public final int hashCode() {
        a2w a2wVar = this.f189697a;
        int iHashCode = (a2wVar == null ? 0 : a2wVar.hashCode()) * 31;
        pl11 pl11Var = this.f189698b;
        int iHashCode2 = (iHashCode + (pl11Var == null ? 0 : pl11Var.hashCode())) * 31;
        av60 av60Var = this.f189699c;
        return iHashCode2 + (av60Var != null ? av60Var.f20109a.hashCode() : 0);
    }

    public ql11(a2w a2wVar, pl11 pl11Var, av60 av60Var) {
        this.f189697a = a2wVar;
        this.f189698b = pl11Var;
        this.f189699c = av60Var;
    }

    public /* synthetic */ ql11(a2w a2wVar, pl11 pl11Var, int i) {
        this((i & 1) != 0 ? null : a2wVar, pl11Var, (av60) null);
    }
}
