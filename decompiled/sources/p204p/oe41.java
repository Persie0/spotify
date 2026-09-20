package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oe41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iyu0 f164342a;

    public oe41(iyu0 iyu0Var) {
        this.f164342a = iyu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m66790a(ibk ibkVar) {
        ne41 ne41Var;
        if (ibkVar instanceof ne41) {
            ne41Var = (ne41) ibkVar;
            int i = ne41Var.f152923c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ne41Var.f152923c = i - Integer.MIN_VALUE;
            } else {
                ne41Var = new ne41(this, ibkVar);
            }
        } else {
            ne41Var = new ne41(this, ibkVar);
        }
        Object obj = ne41Var.f152921a;
        int i2 = ne41Var.f152923c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return ((s6x0) obj).f206218a;
        }
        bga.m29073P(obj);
        hyu0 hyu0Var = new hyu0();
        ne41Var.f152923c = 1;
        Object objM38870a = ((egg1) this.f164342a).m38870a(hyu0Var, 60000L, ne41Var);
        yuk yukVar = yuk.f276404a;
        return objM38870a == yukVar ? yukVar : objM38870a;
    }
}
