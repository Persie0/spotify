package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k4m0 implements tvd1 {

    /* JADX INFO: renamed from: a */
    public final f4m0 f119249a;

    public k4m0(f4m0 f4m0Var) {
        this.f119249a = f4m0Var;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: a */
    public final int mo41499a(yqq yqqVar, ko70 ko70Var) {
        return yqqVar.mo35990l0(this.f119249a.mo29187c(ko70Var));
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: b */
    public final int mo41500b(yqq yqqVar, ko70 ko70Var) {
        return yqqVar.mo35990l0(this.f119249a.mo29186b(ko70Var));
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: c */
    public final int mo41501c(yqq yqqVar) {
        return yqqVar.mo35990l0(this.f119249a.mo29188d());
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: d */
    public final int mo41502d(yqq yqqVar) {
        return yqqVar.mo35990l0(this.f119249a.mo29185a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4m0) && wj50.m88271j(this.f119249a, ((k4m0) obj).f119249a);
    }

    public final int hashCode() {
        return this.f119249a.hashCode();
    }
}
