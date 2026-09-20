package p204p;

/* JADX INFO: renamed from: p.m6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2116m6 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140319a;

    /* JADX INFO: renamed from: b */
    public int f140320b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC2203o6 f140321c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ m3r0 f140322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2116m6(AbstractC2203o6 abstractC2203o6, m3r0 m3r0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f140319a = i;
        this.f140321c = abstractC2203o6;
        this.f140322d = m3r0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f140319a) {
            case 0:
                return new C2116m6(this.f140321c, this.f140322d, fbkVar, 0);
            case 1:
                return new C2116m6(this.f140321c, this.f140322d, fbkVar, 1);
            case 2:
                return new C2116m6(this.f140321c, this.f140322d, fbkVar, 2);
            default:
                return new C2116m6(this.f140321c, this.f140322d, fbkVar, 3);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f140319a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C2116m6) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f140319a) {
            case 0:
                int i = this.f140320b;
                if (i == 0) {
                    bga.m29073P(obj);
                    voi0 voi0Var = this.f140321c.f162161O0;
                    if (voi0Var != null) {
                        l3r0 l3r0Var = new l3r0(this.f140322d);
                        this.f140320b = 1;
                        Object objMo86073b = voi0Var.mo86073b(l3r0Var, this);
                        yuk yukVar = yuk.f276404a;
                        if (objMo86073b == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 1:
                int i2 = this.f140320b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    voi0 voi0Var2 = this.f140321c.f162161O0;
                    if (voi0Var2 != null) {
                        l3r0 l3r0Var2 = new l3r0(this.f140322d);
                        this.f140320b = 1;
                        Object objMo86073b2 = voi0Var2.mo86073b(l3r0Var2, this);
                        yuk yukVar2 = yuk.f276404a;
                        if (objMo86073b2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 2:
                int i3 = this.f140320b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    voi0 voi0Var3 = this.f140321c.f162161O0;
                    if (voi0Var3 != null) {
                        this.f140320b = 1;
                        Object objMo86073b3 = voi0Var3.mo86073b(this.f140322d, this);
                        yuk yukVar3 = yuk.f276404a;
                        if (objMo86073b3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i4 = this.f140320b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    voi0 voi0Var4 = this.f140321c.f162161O0;
                    if (voi0Var4 != null) {
                        n3r0 n3r0Var = new n3r0(this.f140322d);
                        this.f140320b = 1;
                        Object objMo86073b4 = voi0Var4.mo86073b(n3r0Var, this);
                        yuk yukVar4 = yuk.f276404a;
                        if (objMo86073b4 == yukVar4) {
                            return yukVar4;
                        }
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
