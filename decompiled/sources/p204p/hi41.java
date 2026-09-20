package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hi41 {

    /* JADX INFO: renamed from: a */
    public final qcz0 f91699a;

    /* JADX INFO: renamed from: b */
    public final qbc0 f91700b;

    public hi41(qcz0 qcz0Var, qbc0 qbc0Var) {
        this.f91699a = qcz0Var;
        this.f91700b = qbc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m47619a(String str, ibk ibkVar) throws Throwable {
        gi41 gi41Var;
        ldz0 ldz0Var;
        if (ibkVar instanceof gi41) {
            gi41Var = (gi41) ibkVar;
            int i = gi41Var.f80050c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi41Var.f80050c = i - Integer.MIN_VALUE;
            } else {
                gi41Var = new gi41(this, ibkVar);
            }
        } else {
            gi41Var = new gi41(this, ibkVar);
        }
        Object objM72491a = gi41Var.f80048a;
        int i2 = gi41Var.f80050c;
        if (i2 == 0) {
            bga.m29073P(objM72491a);
            gi41Var.f80050c = 1;
            objM72491a = this.f91700b.m72491a(str, gi41Var);
            yuk yukVar = yuk.f276404a;
            if (objM72491a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM72491a);
        }
        nd41 nd41Var = (nd41) objM72491a;
        if (nd41Var == null || (ldz0Var = nd41Var.f152655d) == null) {
            return null;
        }
        return this.f91699a.mo24518a(ldz0Var);
    }
}
