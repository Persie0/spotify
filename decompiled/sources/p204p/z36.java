package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z36 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278784a;

    /* JADX INFO: renamed from: b */
    public int f278785b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f278786c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f278787d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xgq0 f278788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z36(Object obj, fbk fbkVar, xgq0 xgq0Var, int i) {
        super(2, fbkVar);
        this.f278784a = i;
        this.f278787d = obj;
        this.f278788e = xgq0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f278784a) {
            case 0:
                z36 z36Var = new z36(this.f278787d, fbkVar, this.f278788e, 0);
                z36Var.f278786c = obj;
                return z36Var;
            case 1:
                z36 z36Var2 = new z36(this.f278787d, fbkVar, this.f278788e, 1);
                z36Var2.f278786c = obj;
                return z36Var2;
            case 2:
                z36 z36Var3 = new z36(this.f278787d, fbkVar, this.f278788e, 2);
                z36Var3.f278786c = obj;
                return z36Var3;
            default:
                z36 z36Var4 = new z36(this.f278787d, fbkVar, this.f278788e, 3);
                z36Var4.f278786c = obj;
                return z36Var4;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f278784a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((z36) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f278784a) {
            case 0:
                int i = this.f278785b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                zu5 zu5Var = (zu5) this.f278787d;
                this.f278786c = null;
                this.f278785b = 1;
                Object objM96565n = zn91.m96565n(this.f278788e.m90935d(new yrl0[]{new yrl0(i091.m49324F(zu5Var.f286342e), srl0.CONCERTS_EVENTS, true)}, 6, zu5Var.f286343f), this);
                yuk yukVar = yuk.f276404a;
                if (objM96565n != yukVar) {
                    objM96565n = w2a1Var;
                }
                return objM96565n == yukVar ? yukVar : w2a1Var;
            case 1:
                int i2 = this.f278785b;
                w2a1 w2a1Var2 = w2a1.f247311a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var2;
                }
                bga.m29073P(obj);
                bv5 bv5Var = (bv5) this.f278787d;
                this.f278786c = null;
                this.f278785b = 1;
                Object objM96565n2 = zn91.m96565n(this.f278788e.m90935d(new yrl0[]{new yrl0(i091.m49324F(bv5Var.f31278e), srl0.CONCERTS_EVENTS, false)}, 6, bv5Var.f31279f), this);
                yuk yukVar2 = yuk.f276404a;
                if (objM96565n2 != yukVar2) {
                    objM96565n2 = w2a1Var2;
                }
                return objM96565n2 == yukVar2 ? yukVar2 : w2a1Var2;
            case 2:
                int i3 = this.f278785b;
                w2a1 w2a1Var3 = w2a1.f247311a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var3;
                }
                bga.m29073P(obj);
                c4i c4iVar = (c4i) this.f278787d;
                this.f278786c = null;
                this.f278785b = 1;
                Object objM96565n3 = zn91.m96565n(this.f278788e.m90935d(new yrl0[]{new yrl0(i091.m49324F(c4iVar.f33952b), srl0.CONCERTS_EVENTS, true)}, 6, c4iVar.f33953c), this);
                yuk yukVar3 = yuk.f276404a;
                if (objM96565n3 != yukVar3) {
                    objM96565n3 = w2a1Var3;
                }
                return objM96565n3 == yukVar3 ? yukVar3 : w2a1Var3;
            default:
                int i4 = this.f278785b;
                w2a1 w2a1Var4 = w2a1.f247311a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var4;
                }
                bga.m29073P(obj);
                e4i e4iVar = (e4i) this.f278787d;
                this.f278786c = null;
                this.f278785b = 1;
                Object objM96565n4 = zn91.m96565n(this.f278788e.m90935d(new yrl0[]{new yrl0(i091.m49324F(e4iVar.f56099b), srl0.CONCERTS_EVENTS, false)}, 6, e4iVar.f56100c), this);
                yuk yukVar4 = yuk.f276404a;
                if (objM96565n4 != yukVar4) {
                    objM96565n4 = w2a1Var4;
                }
                return objM96565n4 == yukVar4 ? yukVar4 : w2a1Var4;
        }
    }
}
