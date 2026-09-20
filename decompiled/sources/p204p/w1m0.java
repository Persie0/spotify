package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w1m0 implements f4m0 {

    /* JADX INFO: renamed from: b */
    public final ybs f247137b;

    /* JADX INFO: renamed from: c */
    public final ybs f247138c;

    /* JADX INFO: renamed from: d */
    public final ybs f247139d;

    /* JADX INFO: renamed from: e */
    public final ybs f247140e;

    /* JADX INFO: renamed from: f */
    public final f4m0 f247141f;

    public w1m0(ybs ybsVar, ybs ybsVar2, ybs ybsVar3, ybs ybsVar4, f4m0 f4m0Var) {
        this.f247137b = ybsVar;
        this.f247138c = ybsVar2;
        this.f247139d = ybsVar3;
        this.f247140e = ybsVar4;
        this.f247141f = f4m0Var;
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: a */
    public final float mo29185a() {
        ybs ybsVar = this.f247140e;
        return ybsVar != null ? ybsVar.f271238a : this.f247141f.mo29185a();
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: b */
    public final float mo29186b(ko70 ko70Var) {
        ybs ybsVar = ko70Var == ko70.f124556a ? this.f247137b : this.f247139d;
        return ybsVar != null ? ybsVar.f271238a : this.f247141f.mo29186b(ko70Var);
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: c */
    public final float mo29187c(ko70 ko70Var) {
        ybs ybsVar = ko70Var == ko70.f124556a ? this.f247139d : this.f247137b;
        return ybsVar != null ? ybsVar.f271238a : this.f247141f.mo29187c(ko70Var);
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: d */
    public final float mo29188d() {
        ybs ybsVar = this.f247138c;
        return ybsVar != null ? ybsVar.f271238a : this.f247141f.mo29188d();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w1m0)) {
            return false;
        }
        w1m0 w1m0Var = (w1m0) obj;
        return wj50.m88271j(this.f247137b, w1m0Var.f247137b) && wj50.m88271j(this.f247138c, w1m0Var.f247138c) && wj50.m88271j(this.f247139d, w1m0Var.f247139d) && wj50.m88271j(this.f247140e, w1m0Var.f247140e) && wj50.m88271j(this.f247141f, w1m0Var.f247141f);
    }

    public final int hashCode() {
        ybs ybsVar = this.f247137b;
        int iHashCode = ybsVar != null ? Float.hashCode(ybsVar.f271238a) : 0;
        ybs ybsVar2 = this.f247138c;
        int iHashCode2 = iHashCode + (ybsVar2 != null ? Float.hashCode(ybsVar2.f271238a) : 0);
        ybs ybsVar3 = this.f247139d;
        int iHashCode3 = iHashCode2 + (ybsVar3 != null ? Float.hashCode(ybsVar3.f271238a) : 0);
        ybs ybsVar4 = this.f247140e;
        return this.f247141f.hashCode() + iHashCode3 + (ybsVar4 != null ? Float.hashCode(ybsVar4.f271238a) : 0);
    }
}
