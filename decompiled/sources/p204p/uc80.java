package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uc80 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228967a;

    /* JADX INFO: renamed from: b */
    public int f228968b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f228969c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ th00 f228970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc80(Object obj, fbk fbkVar, th00 th00Var) {
        super(2, fbkVar);
        this.f228967a = 4;
        this.f228970d = th00Var;
        this.f228969c = obj;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f228967a) {
            case 0:
                uc80 uc80Var = new uc80(this.f228970d, fbkVar, 0);
                uc80Var.f228969c = obj;
                return uc80Var;
            case 1:
                uc80 uc80Var2 = new uc80(this.f228970d, fbkVar, 1);
                uc80Var2.f228969c = obj;
                return uc80Var2;
            case 2:
                uc80 uc80Var3 = new uc80(this.f228970d, fbkVar, 2);
                uc80Var3.f228969c = obj;
                return uc80Var3;
            case 3:
                uc80 uc80Var4 = new uc80(this.f228970d, fbkVar, 3);
                uc80Var4.f228969c = obj;
                return uc80Var4;
            default:
                return new uc80(this.f228969c, fbkVar, this.f228970d);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f228967a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((uc80) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f228967a) {
            case 0:
                xuk xukVar = (xuk) this.f228969c;
                int i = this.f228968b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f228969c = null;
                    this.f228968b = 1;
                    Object objInvoke = this.f228970d.invoke(xukVar, this);
                    yuk yukVar = yuk.f276404a;
                    if (objInvoke == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 1:
                xuk xukVar2 = (xuk) this.f228969c;
                int i2 = this.f228968b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f228969c = null;
                    this.f228968b = 1;
                    Object objInvoke2 = this.f228970d.invoke(xukVar2, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objInvoke2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 2:
                xuk xukVar3 = (xuk) this.f228969c;
                int i3 = this.f228968b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f228969c = null;
                    this.f228968b = 1;
                    Object objInvoke3 = this.f228970d.invoke(xukVar3, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objInvoke3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 3:
                int i4 = this.f228968b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    xuk xukVar4 = (xuk) this.f228969c;
                    this.f228968b = 1;
                    Object objInvoke4 = this.f228970d.invoke(xukVar4, this);
                    yuk yukVar4 = yuk.f276404a;
                    if (objInvoke4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i5 = this.f228968b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                Object obj2 = this.f228969c;
                this.f228968b = 1;
                Object objInvoke5 = this.f228970d.invoke(obj2, this);
                yuk yukVar5 = yuk.f276404a;
                return objInvoke5 == yukVar5 ? yukVar5 : objInvoke5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc80(th00 th00Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f228967a = i;
        this.f228970d = th00Var;
    }
}
