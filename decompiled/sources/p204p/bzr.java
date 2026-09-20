package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bzr implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dzr f32558a;

    public bzr(dzr dzrVar) {
        this.f32558a = dzrVar;
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        xv41 xv41VarMo52728c;
        m950 m950Var;
        dzr dzrVar = this.f32558a;
        if (!(((wb50) ((zv41) dzrVar.f54725o).getValue()) instanceof rb50) || dzrVar.f54719i.isChangingConfigurations()) {
            return;
        }
        w850 w850Var = (w850) dzrVar.f54726p.get();
        if (w850Var != null && (xv41VarMo52728c = w850Var.mo52728c()) != null && (m950Var = (m950) xv41VarMo52728c.getValue()) != null) {
            m950Var.cancel();
        }
        dzrVar.f54717g.f152190a.mo55548j();
    }
}
