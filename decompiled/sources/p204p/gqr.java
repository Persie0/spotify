package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gqr extends mo91 {

    /* JADX INFO: renamed from: b */
    public final mo91 f83517b;

    /* JADX INFO: renamed from: c */
    public final mo91 f83518c;

    public gqr(mo91 mo91Var, mo91 mo91Var2) {
        this.f83517b = mo91Var;
        this.f83518c = mo91Var2;
    }

    @Override // p204p.mo91
    /* JADX INFO: renamed from: a */
    public final boolean mo45445a() {
        return this.f83517b.mo45445a() || this.f83518c.mo45445a();
    }

    @Override // p204p.mo91
    /* JADX INFO: renamed from: b */
    public final boolean mo26560b() {
        return this.f83517b.mo26560b() || this.f83518c.mo26560b();
    }

    @Override // p204p.mo91
    /* JADX INFO: renamed from: c */
    public final l25 mo45446c(l25 l25Var) {
        return this.f83518c.mo45446c(this.f83517b.mo45446c(l25Var));
    }

    @Override // p204p.mo91
    /* JADX INFO: renamed from: d */
    public final ho91 mo26561d(gd70 gd70Var) {
        ho91 ho91VarMo26561d = this.f83517b.mo26561d(gd70Var);
        return ho91VarMo26561d == null ? this.f83518c.mo26561d(gd70Var) : ho91VarMo26561d;
    }

    @Override // p204p.mo91
    /* JADX INFO: renamed from: f */
    public final gd70 mo45447f(int i, gd70 gd70Var) {
        return this.f83518c.mo45447f(i, this.f83517b.mo45447f(i, gd70Var));
    }
}
