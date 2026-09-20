package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class l4m0 implements tvd1 {

    /* JADX INFO: renamed from: a */
    public final f4m0 f129730a;

    public l4m0(f4m0 f4m0Var) {
        this.f129730a = f4m0Var;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: a */
    public final int mo41499a(yqq yqqVar, ko70 ko70Var) {
        return yqqVar.mo35990l0(this.f129730a.mo29187c(ko70Var));
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: b */
    public final int mo41500b(yqq yqqVar, ko70 ko70Var) {
        return yqqVar.mo35990l0(this.f129730a.mo29186b(ko70Var));
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: c */
    public final int mo41501c(yqq yqqVar) {
        return yqqVar.mo35990l0(this.f129730a.mo29188d());
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: d */
    public final int mo41502d(yqq yqqVar) {
        return yqqVar.mo35990l0(this.f129730a.mo29185a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l4m0) {
            return wj50.m88271j(((l4m0) obj).f129730a, this.f129730a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f129730a.hashCode();
    }

    public final String toString() {
        f4m0 f4m0Var = this.f129730a;
        ko70 ko70Var = ko70.f124556a;
        return "PaddingValues(" + ((Object) ybs.m93302c(f4m0Var.mo29186b(ko70Var))) + ", " + ((Object) ybs.m93302c(f4m0Var.mo29188d())) + ", " + ((Object) ybs.m93302c(f4m0Var.mo29187c(ko70Var))) + ", " + ((Object) ybs.m93302c(f4m0Var.mo29185a())) + ')';
    }
}
