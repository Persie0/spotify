package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wgo extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251111a;

    /* JADX INFO: renamed from: b */
    public ogo f251112b;

    /* JADX INFO: renamed from: c */
    public int f251113c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f251114d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ pgo f251115e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tjo f251116f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f251117g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wgo(pgo pgoVar, tjo tjoVar, Object obj, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f251111a = i;
        this.f251115e = pgoVar;
        this.f251116f = tjoVar;
        this.f251117g = obj;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f251111a) {
            case 0:
                wgo wgoVar = new wgo(this.f251115e, this.f251116f, this.f251117g, fbkVar, 0);
                wgoVar.f251114d = obj;
                return wgoVar;
            default:
                wgo wgoVar2 = new wgo(this.f251115e, this.f251116f, this.f251117g, fbkVar, 1);
                wgoVar2.f251114d = obj;
                return wgoVar2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f251111a) {
            case 0:
                return ((wgo) create((mk90) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((wgo) create((niz) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        ogo ogoVar;
        Throwable th;
        ogo ogoVar2;
        Throwable th2;
        switch (this.f251111a) {
            case 0:
                mk90 mk90Var = (mk90) this.f251114d;
                int i = this.f251113c;
                if (i == 0) {
                    bga.m29073P(obj);
                    ogo ogoVarMo25867c = this.f251115e.mo25867c(this.f251116f.mo28634a(this.f251117g));
                    try {
                        wpi0 wpi0VarMo41508b = ogoVarMo25867c.mo41508b();
                        r2m r2mVar = new r2m(mk90Var, (fbk) null, 6);
                        this.f251114d = null;
                        this.f251112b = ogoVarMo25867c;
                        this.f251113c = 1;
                        wpi0VarMo41508b.mo26212b(r2mVar, this);
                        return yuk.f276404a;
                    } catch (Throwable th3) {
                        ogoVar = ogoVarMo25867c;
                        th = th3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ogoVar = this.f251112b;
                    try {
                        bga.m29073P(obj);
                        ogoVar.dispose();
                        return w2a1.f247311a;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                ogoVar.dispose();
                throw th;
            default:
                niz nizVar = (niz) this.f251114d;
                int i2 = this.f251113c;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    ogo ogoVarMo25867c2 = this.f251115e.mo25867c(this.f251116f.mo28634a(this.f251117g));
                    try {
                        zv41 zv41Var = ogoVarMo25867c2.mo41508b().f253772a;
                        hql hqlVar = new hql(nizVar, 19);
                        this.f251114d = null;
                        this.f251112b = ogoVarMo25867c2;
                        this.f251113c = 1;
                        zv41Var.collect(hqlVar, this);
                        return yuk.f276404a;
                    } catch (Throwable th5) {
                        ogoVar2 = ogoVarMo25867c2;
                        th2 = th5;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ogoVar2 = this.f251112b;
                    try {
                        bga.m29073P(obj);
                        ogoVar2.dispose();
                        return w2a1.f247311a;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
                ogoVar2.dispose();
                throw th2;
        }
    }
}
