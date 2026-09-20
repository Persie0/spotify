package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s040 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nlv0 f204300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f204301b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dqk0 f204302c;

    public s040(nlv0 nlv0Var, t040 t040Var, rlv0 rlv0Var, dqk0 dqk0Var) {
        this.f204300a = nlv0Var;
        this.f204301b = rlv0Var;
        this.f204302c = dqk0Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        q040 q040Var;
        q040 q040Var2 = (q040) obj;
        nlv0 nlv0Var = this.f204300a;
        boolean z = nlv0Var.f155174a;
        rlv0 rlv0Var = this.f204301b;
        if (z && (((q040Var = (q040) rlv0Var.f200373a) == null && q040Var2 == null) || (q040Var != null && q040Var2 != null && wj50.m88271j(q040Var.f183901a, q040Var2.f183901a) && wj50.m88271j(q040Var.f183902b, q040Var2.f183902b)))) {
            rlv0Var.f200373a = q040Var2;
            return;
        }
        nlv0Var.f155174a = true;
        rlv0Var.f200373a = q040Var2;
        this.f204302c.mo31453b(q040Var2);
    }
}
