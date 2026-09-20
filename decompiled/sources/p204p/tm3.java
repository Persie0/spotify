package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tm3 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221581a;

    /* JADX INFO: renamed from: b */
    public int f221582b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f221583c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f221584d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ wm3 f221585e;

    /* JADX INFO: renamed from: f */
    public niz f221586f;

    /* JADX INFO: renamed from: g */
    public int f221587g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm3(Object obj, fbk fbkVar, wm3 wm3Var, int i) {
        super(2, fbkVar);
        this.f221581a = i;
        this.f221584d = obj;
        this.f221585e = wm3Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f221581a) {
            case 0:
                tm3 tm3Var = new tm3(this.f221584d, fbkVar, this.f221585e, 0);
                tm3Var.f221583c = obj;
                return tm3Var;
            default:
                tm3 tm3Var2 = new tm3(this.f221584d, fbkVar, this.f221585e, 1);
                tm3Var2.f221583c = obj;
                return tm3Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f221581a) {
            case 0:
                break;
        }
        return ((tm3) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        niz nizVar;
        int i;
        niz nizVar2;
        int i2;
        switch (this.f221581a) {
            case 0:
                int i3 = this.f221582b;
                yuk yukVar = yuk.f276404a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        i = this.f221587g;
                        nizVar = this.f221586f;
                        bga.m29073P(obj);
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                niz nizVar3 = (niz) this.f221583c;
                am3 am3Var = (am3) this.f221584d;
                twz0 twz0Var = this.f221585e.f252705b;
                pwb pwbVar = am3Var.f17031a;
                this.f221583c = null;
                this.f221586f = nizVar3;
                this.f221587g = 0;
                this.f221582b = 1;
                Object objM81829s = twz0Var.m81829s(pwbVar, this);
                if (objM81829s == yukVar) {
                    return yukVar;
                }
                nizVar = nizVar3;
                obj = objM81829s;
                i = 0;
                this.f221583c = null;
                this.f221586f = null;
                this.f221587g = i;
                this.f221582b = 2;
                if (nizVar.emit(obj, this) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
            default:
                int i4 = this.f221582b;
                yuk yukVar2 = yuk.f276404a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        i2 = this.f221587g;
                        nizVar2 = this.f221586f;
                        bga.m29073P(obj);
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                niz nizVar4 = (niz) this.f221583c;
                bm3 bm3Var = (bm3) this.f221584d;
                twz0 twz0Var2 = this.f221585e.f252705b;
                String str = bm3Var.f28362a;
                this.f221583c = null;
                this.f221586f = nizVar4;
                this.f221587g = 0;
                this.f221582b = 1;
                Object objM81830t = twz0Var2.m81830t(str, this);
                if (objM81830t == yukVar2) {
                    return yukVar2;
                }
                nizVar2 = nizVar4;
                obj = objM81830t;
                i2 = 0;
                this.f221583c = null;
                this.f221586f = null;
                this.f221587g = i2;
                this.f221582b = 2;
                if (nizVar2.emit(obj, this) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
        }
    }
}
