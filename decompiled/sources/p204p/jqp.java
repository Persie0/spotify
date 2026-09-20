package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jqp implements j561 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f114941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f114942c;

    public /* synthetic */ jqp(int i, Object obj, Object obj2) {
        this.f114940a = i;
        this.f114941b = obj;
        this.f114942c = obj2;
    }

    @Override // p204p.j561
    public final Object get() {
        switch (this.f114940a) {
            case 0:
                kqp kqpVar = (kqp) this.f114941b;
                u8s0 u8s0Var = new u8s0((qio) this.f114942c, (ihp) kqpVar.f125371d);
                u8s0Var.f228012f = kqpVar.f125369b;
                return u8s0Var;
            default:
                ke41 ke41Var = (ke41) this.f114941b;
                lb21 lb21Var = (lb21) this.f114942c;
                kb21 kb21VarM58593a = lb21Var.m58593a();
                kb21VarM58593a.f121050d = 1;
                kb21VarM58593a.f121045I = jb21.f110632m0;
                kb21VarM58593a.f121043G = new f77(ke41.m56189i1(lb21Var.f131495C.get(), lb21Var, (mp71) ke41Var.f170906a));
                kb21VarM58593a.f121044H = lb21Var.f131496D;
                return new lb21(kb21VarM58593a);
        }
    }
}
