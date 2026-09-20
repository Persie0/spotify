package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yac extends wmx0 {

    /* JADX INFO: renamed from: b */
    public final xip f270869b;

    /* JADX INFO: renamed from: c */
    public final wg61 f270870c;

    public yac(String str, xac xacVar) {
        super(str);
        this.f270869b = xacVar.f259655c;
        this.f270870c = new wg61(new q3c(this, str, xacVar));
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: g */
    public final void mo26394g(int i) {
        rmx0 rmx0Var = (rmx0) this.f270870c.getValue();
        if (rmx0Var != null) {
            wmd0 wmd0Var = rmx0Var.f200646l;
            if (wmd0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            wmd0Var.m88562i(i);
            this.f270869b.m91154e(i, this.f253001a);
        }
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: j */
    public final void mo26397j(int i) {
        rmx0 rmx0Var = (rmx0) this.f270870c.getValue();
        if (rmx0Var != null) {
            wmd0 wmd0Var = rmx0Var.f200646l;
            if (wmd0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            wmd0Var.m88563j(i);
            String str = this.f253001a;
            xip xipVar = this.f270869b;
            if (i > 0) {
                xipVar.m91153d(str);
            } else if (i < 0) {
                xipVar.m91152c(str);
            }
        }
    }
}
