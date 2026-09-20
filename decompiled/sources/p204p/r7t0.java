package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r7t0 implements bwr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nlv0 f196646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gqk0 f196647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s7t0 f196648c;

    public r7t0(nlv0 nlv0Var, gqk0 gqk0Var, s7t0 s7t0Var) {
        this.f196646a = nlv0Var;
        this.f196647b = gqk0Var;
        this.f196648c = s7t0Var;
    }

    @Override // p204p.bwr
    public final void dispose() {
        nlv0 nlv0Var = this.f196646a;
        if (nlv0Var.f155174a) {
            return;
        }
        nlv0Var.f155174a = true;
        this.f196647b.dispose();
        s7t0 s7t0Var = this.f196648c;
        int i = s7t0Var.f206474e - 1;
        s7t0Var.f206474e = i;
        if (i == 0) {
            di41 di41Var = s7t0Var.f206473d;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            s7t0Var.f206473d = null;
            s7t0Var.f206472c = new ppi0();
        }
    }
}
