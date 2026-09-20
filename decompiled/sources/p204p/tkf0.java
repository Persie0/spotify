package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tkf0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221130a;

    /* JADX INFO: renamed from: b */
    public int f221131b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f221132c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f221133d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ glf0 f221134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkf0(Object obj, fbk fbkVar, glf0 glf0Var, int i) {
        super(2, fbkVar);
        this.f221130a = i;
        this.f221133d = obj;
        this.f221134e = glf0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f221130a) {
            case 0:
                tkf0 tkf0Var = new tkf0(this.f221133d, fbkVar, this.f221134e, 0);
                tkf0Var.f221132c = obj;
                return tkf0Var;
            case 1:
                tkf0 tkf0Var2 = new tkf0(this.f221133d, fbkVar, this.f221134e, 1);
                tkf0Var2.f221132c = obj;
                return tkf0Var2;
            case 2:
                tkf0 tkf0Var3 = new tkf0(this.f221133d, fbkVar, this.f221134e, 2);
                tkf0Var3.f221132c = obj;
                return tkf0Var3;
            default:
                tkf0 tkf0Var4 = new tkf0(this.f221133d, fbkVar, this.f221134e, 3);
                tkf0Var4.f221132c = obj;
                return tkf0Var4;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f221130a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((tkf0) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f221130a) {
            case 0:
                int i = this.f221131b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                niz nizVar = (niz) this.f221132c;
                ulf0 ulf0Var = (ulf0) this.f221133d;
                jz90 jz90Var = this.f221134e.f81074h;
                this.f221132c = null;
                this.f221131b = 1;
                jz90Var.m54853a(nizVar, ulf0Var, this);
                return yuk.f276404a;
            case 1:
                int i2 = this.f221131b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    niz nizVar2 = (niz) this.f221132c;
                    fmf0 fmf0Var = (fmf0) this.f221133d;
                    vyr0 vyr0Var = this.f221134e.f81070d;
                    this.f221132c = null;
                    this.f221131b = 1;
                    Object objM86849h = vyr0Var.m86849h(nizVar2, fmf0Var, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM86849h == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 2:
                int i3 = this.f221131b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    niz nizVar3 = (niz) this.f221132c;
                    jmf0 jmf0Var = (jmf0) this.f221133d;
                    clq0 clq0Var = this.f221134e.f81071e;
                    this.f221132c = null;
                    this.f221131b = 1;
                    Object objM33324d = clq0Var.m33324d(nizVar3, jmf0Var, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM33324d == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i4 = this.f221131b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    niz nizVar4 = (niz) this.f221132c;
                    qmf0 qmf0Var = (qmf0) this.f221133d;
                    be41 be41Var = this.f221134e.f81085s;
                    this.f221132c = null;
                    this.f221131b = 1;
                    Object objM28899t = be41Var.m28899t(nizVar4, qmf0Var, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM28899t == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
