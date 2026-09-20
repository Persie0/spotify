package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class h25 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86893a;

    /* JADX INFO: renamed from: b */
    public final ib70 f86894b;

    public /* synthetic */ h25(ib70 ib70Var, int i) {
        this.f86893a = i;
        this.f86894b = ib70Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f86893a) {
            case 0:
                return ((mxh0) obj).mo53211g().m50157j(this.f86894b.m50167v());
            default:
                qti0 qti0Var = (qti0) obj;
                nxh0 nxh0VarM50160m = this.f86894b.m50160m();
                y400 y400Var = rm41.f200445l;
                tx70 tx70Var = ((ex70) nxh0VarM50160m.mo53208I(y400Var)).f63695h;
                if (tx70Var == null) {
                    ib70.m50144a(11);
                    throw null;
                }
                qge qgeVarMo27571g = tx70Var.mo27571g(qti0Var, pkj0.f178474a);
                if (qgeVarMo27571g == null) {
                    throw new AssertionError("Built-in class " + y400Var.m92785a(qti0Var) + " is not found");
                }
                if (qgeVarMo27571g instanceof nfe) {
                    return (nfe) qgeVarMo27571g;
                }
                throw new AssertionError("Must be a class descriptor " + qti0Var + ", but was " + qgeVarMo27571g);
        }
    }
}
