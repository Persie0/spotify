package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wgq0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251130a;

    /* JADX INFO: renamed from: b */
    public int f251131b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f251132c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mb61 f251133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wgq0(th00 th00Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f251130a = i;
        switch (i) {
            case 1:
                this.f251133d = (mb61) th00Var;
                super(2, fbkVar);
                break;
            default:
                this.f251133d = (mb61) th00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.mb61, p.th00] */
    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f251130a) {
            case 0:
                wgq0 wgq0Var = new wgq0(this.f251133d, fbkVar, 0);
                wgq0Var.f251132c = obj;
                return wgq0Var;
            default:
                wgq0 wgq0Var2 = new wgq0(this.f251133d, fbkVar, 1);
                wgq0Var2.f251132c = obj;
                return wgq0Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f251130a) {
            case 0:
                return ((wgq0) create((qpi0) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((wgq0) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r4v7, types: [p.mb61, p.th00] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f251130a) {
            case 0:
                int i = this.f251131b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qpi0 qpi0Var = (qpi0) this.f251132c;
                    bga.m29073P(obj);
                    return qpi0Var;
                }
                bga.m29073P(obj);
                qpi0 qpi0VarM73447b = ((qpi0) this.f251132c).m73447b();
                this.f251132c = qpi0VarM73447b;
                this.f251131b = 1;
                Object objInvoke = this.f251133d.invoke(qpi0VarM73447b, this);
                yuk yukVar = yuk.f276404a;
                return objInvoke == yukVar ? yukVar : qpi0VarM73447b;
            default:
                xuk xukVar = (xuk) this.f251132c;
                int i2 = this.f251131b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f251132c = null;
                    this.f251131b = 1;
                    Object objInvoke2 = this.f251133d.invoke(xukVar, this);
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
        }
    }
}
