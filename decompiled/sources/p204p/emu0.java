package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class emu0 implements ft51 {

    /* JADX INFO: renamed from: a */
    public final long f60997a;

    /* JADX INFO: renamed from: b */
    public ot51 f60998b;

    /* JADX INFO: renamed from: c */
    public final bqa f60999c;

    public emu0(int i, long j, int i2) {
        this.f60997a = j;
        this.f60999c = xtm0.m92080a(i == 0 ? 1 : i, i2, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m39463a(ibk ibkVar) throws Throwable {
        dmu0 dmu0Var;
        Object objM30205M;
        if (ibkVar instanceof dmu0) {
            dmu0Var = (dmu0) ibkVar;
            int i = dmu0Var.f50615c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmu0Var.f50615c = i - Integer.MIN_VALUE;
            } else {
                dmu0Var = new dmu0(this, ibkVar);
            }
        } else {
            dmu0Var = new dmu0(this, ibkVar);
        }
        Object obj = dmu0Var.f50613a;
        int i2 = dmu0Var.f50615c;
        if (i2 == 0) {
            bga.m29073P(obj);
            dmu0Var.f50615c = 1;
            bqa bqaVar = this.f60999c;
            bqaVar.getClass();
            objM30205M = bqa.m30205M(bqaVar, dmu0Var);
            yuk yukVar = yuk.f276404a;
            if (objM30205M == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM30205M = ((unc) obj).f232139a;
        }
        Throwable thM83544b = unc.m83544b(objM30205M);
        if (thM83544b != null) {
            throw thM83544b;
        }
        if (objM30205M instanceof tnc) {
            return null;
        }
        return objM30205M;
    }

    @Override // p204p.ft51
    public final void onComplete() {
        this.f60999c.mo30210A(null);
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        this.f60999c.m30233l(th, false);
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        bqa bqaVar = this.f60999c;
        if (bqaVar.mo30231j(obj) instanceof tnc) {
            throw new IllegalArgumentException(("Element " + obj + " was not added to channel because it was full, " + bqaVar).toString());
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        this.f60998b = ot51Var;
        if (ot51Var != null) {
            ot51Var.request(this.f60997a);
        } else {
            wj50.m88260d0("subscription");
            throw null;
        }
    }
}
