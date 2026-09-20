package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pp41 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f179886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sp41 f179887c;

    public /* synthetic */ pp41(niz nizVar, sp41 sp41Var, int i) {
        this.f179885a = i;
        this.f179886b = nizVar;
        this.f179887c = sp41Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        op41 op41Var;
        rp41 rp41Var;
        er40 er40Var;
        switch (this.f179885a) {
            case 0:
                if (fbkVar instanceof op41) {
                    op41Var = (op41) fbkVar;
                    int i = op41Var.f167755b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        op41Var.f167755b = i - Integer.MIN_VALUE;
                    } else {
                        op41Var = new op41(this, fbkVar);
                    }
                } else {
                    op41Var = new op41(this, fbkVar);
                }
                Object obj2 = op41Var.f167754a;
                int i2 = op41Var.f167755b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((by50) obj) != null || ((nx50) ((mb80) this.f179887c.f212731b.get()).f141820e.mo61350a().getValue()).f159369b);
                    op41Var.f167755b = 1;
                    Object objEmit = this.f179886b.emit(boolValueOf, op41Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof rp41) {
                    rp41Var = (rp41) fbkVar;
                    int i3 = rp41Var.f201423b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rp41Var.f201423b = i3 - Integer.MIN_VALUE;
                    } else {
                        rp41Var = new rp41(this, fbkVar);
                    }
                } else {
                    rp41Var = new rp41(this, fbkVar);
                }
                Object obj3 = rp41Var.f201422a;
                int i4 = rp41Var.f201423b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    if (((Boolean) obj).booleanValue()) {
                        er40Var = new er40(ab60.f14013a, (dut) this.f179887c.f212730a.get());
                    } else {
                        er40Var = null;
                    }
                    rp41Var.f201423b = 1;
                    Object objEmit2 = this.f179886b.emit(er40Var, rp41Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
