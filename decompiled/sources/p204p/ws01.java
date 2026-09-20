package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ws01 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m88872a(wb40 wb40Var, ibk ibkVar) throws Throwable {
        vs01 vs01Var;
        if (ibkVar instanceof vs01) {
            vs01Var = (vs01) ibkVar;
            int i = vs01Var.f244307c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs01Var.f244307c = i - Integer.MIN_VALUE;
            } else {
                vs01Var = new vs01(this, ibkVar);
            }
        } else {
            vs01Var = new vs01(this, ibkVar);
        }
        Object obj = vs01Var.f244305a;
        int i2 = vs01Var.f244307c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        tlp tlpVar = tlp.f221498c;
        q2y0 q2y0Var = new q2y0(wb40Var, null, 17);
        vs01Var.f244307c = 1;
        Object objM89557A = x0h1.m89557A(tlpVar, q2y0Var, vs01Var);
        yuk yukVar = yuk.f276404a;
        return objM89557A == yukVar ? yukVar : objM89557A;
    }
}
