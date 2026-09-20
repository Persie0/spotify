package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z5w0 implements ae61 {

    /* JADX INFO: renamed from: a */
    public final g5w0 f279646a;

    /* JADX INFO: renamed from: b */
    public final it41 f279647b;

    /* JADX INFO: renamed from: c */
    public final gh00 f279648c;

    public z5w0(g5w0 g5w0Var, it41 it41Var, gh00 gh00Var) {
        this.f279646a = g5w0Var;
        this.f279647b = it41Var;
        this.f279648c = gh00Var;
    }

    @Override // p204p.ae61
    /* JADX INFO: renamed from: a */
    public final vc61 mo25688a() {
        x5w0 x5w0VarM93333b;
        g5w0 g5w0Var = this.f279646a;
        ad61 ad61VarMo26041r = g5w0Var != null ? g5w0Var.mo26041r() : null;
        yc61 yc61Var = ad61VarMo26041r instanceof yc61 ? (yc61) ad61VarMo26041r : null;
        if (yc61Var == null || (x5w0VarM93333b = yc61Var.m93333b()) == null) {
            return null;
        }
        if (!this.f279647b.f105430j) {
            x5w0VarM93333b = null;
        }
        if (x5w0VarM93333b != null) {
            return new vc61(x5w0VarM93333b.m90049a(), x5w0VarM93333b.m90051c(), new y5w0(this, 0));
        }
        return null;
    }

    @Override // p204p.ae61
    /* JADX INFO: renamed from: b */
    public final vc61 mo25689b() {
        x5w0 x5w0VarM93332a;
        g5w0 g5w0Var = this.f279646a;
        ad61 ad61VarMo26041r = g5w0Var != null ? g5w0Var.mo26041r() : null;
        yc61 yc61Var = ad61VarMo26041r instanceof yc61 ? (yc61) ad61VarMo26041r : null;
        if (yc61Var == null || (x5w0VarM93332a = yc61Var.m93332a()) == null) {
            return null;
        }
        if (!this.f279647b.f105430j) {
            x5w0VarM93332a = null;
        }
        if (x5w0VarM93332a != null) {
            return new vc61(x5w0VarM93332a.m90049a(), x5w0VarM93332a.m90051c(), new y5w0(this, 1));
        }
        return null;
    }
}
