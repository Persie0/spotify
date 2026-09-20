package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f950 implements k950 {

    /* JADX INFO: renamed from: a */
    public final la71 f67174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j950 f67175b;

    public f950(j950 j950Var, la71 la71Var) {
        this.f67175b = j950Var;
        this.f67174a = la71Var;
    }

    @Override // p204p.k950
    /* JADX INFO: renamed from: b */
    public final void mo41050b(String str, m921 m921Var) {
        j950 j950Var = this.f67175b;
        m950 m950Var = (m950) j950Var.f110106t.getValue();
        if (m950Var != null) {
            if (m950Var.equals(this)) {
                m950Var = null;
            }
            if (m950Var != null) {
                m950Var.cancel();
            }
        }
        zv41 zv41Var = j950Var.f110105i;
        zv41Var.getClass();
        zv41Var.m97091m(null, this);
        this.f67174a.mo41050b(str, m921Var);
    }

    @Override // p204p.m950
    public final void cancel() {
        this.f67174a.cancel();
        this.f67175b.f110105i.m97090l(null);
    }
}
