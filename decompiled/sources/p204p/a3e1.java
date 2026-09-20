package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class a3e1 implements ado {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11943a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jhc1 f11944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sir0 f11945c;

    public /* synthetic */ a3e1(jhc1 jhc1Var, sir0 sir0Var, int i) {
        this.f11943a = i;
        this.f11944b = jhc1Var;
        this.f11945c = sir0Var;
    }

    @Override // p204p.ado
    /* JADX INFO: renamed from: d */
    public final void mo24626d(jfo jfoVar) {
        xve xveVarM53377b;
        o3e1 o3e1VarM53378c;
        switch (this.f11943a) {
            case 0:
                bdo bdoVar = new bdo(jfoVar);
                while (bdoVar.hasNext()) {
                    gsf1 gsf1Var = (gsf1) bdoVar.next();
                    if (gsf1Var.m32455a() == 1) {
                        pfo pfoVarM45645b = gsf1Var.m45645b();
                        jhc1 jhc1Var = this.f11944b;
                        if (jhc1.m53376a(jhc1Var, pfoVarM45645b, "/workout_coaching_toggle") && (xveVarM53377b = jhc1.m53377b(jhc1Var, gsf1Var.m45645b())) != null) {
                            this.f11945c.mo30231j(xveVarM53377b);
                        }
                    }
                }
                break;
            default:
                bdo bdoVar2 = new bdo(jfoVar);
                while (bdoVar2.hasNext()) {
                    gsf1 gsf1Var2 = (gsf1) bdoVar2.next();
                    if (gsf1Var2.m32455a() == 1) {
                        pfo pfoVarM45645b2 = gsf1Var2.m45645b();
                        jhc1 jhc1Var2 = this.f11944b;
                        if (jhc1.m53376a(jhc1Var2, pfoVarM45645b2, "/workout_mode_toggle") && (o3e1VarM53378c = jhc1.m53378c(jhc1Var2, gsf1Var2.m45645b())) != null) {
                            this.f11945c.mo30231j(o3e1VarM53378c);
                        }
                    }
                }
                break;
        }
    }
}
