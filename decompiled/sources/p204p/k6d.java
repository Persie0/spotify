package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k6d extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119724a;

    /* JADX INFO: renamed from: b */
    public int f119725b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f119726c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f119727d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ h7d f119728e;

    /* JADX INFO: renamed from: f */
    public niz f119729f;

    /* JADX INFO: renamed from: g */
    public int f119730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6d(Object obj, fbk fbkVar, h7d h7dVar, int i) {
        super(2, fbkVar);
        this.f119724a = i;
        this.f119727d = obj;
        this.f119728e = h7dVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f119724a) {
            case 0:
                k6d k6dVar = new k6d(this.f119727d, fbkVar, this.f119728e, 0);
                k6dVar.f119726c = obj;
                return k6dVar;
            default:
                k6d k6dVar2 = new k6d(this.f119727d, fbkVar, this.f119728e, 1);
                k6dVar2.f119726c = obj;
                return k6dVar2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f119724a) {
            case 0:
                break;
        }
        return ((k6d) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        niz nizVar;
        Object obj2;
        int i;
        niz nizVar2;
        int i2;
        switch (this.f119724a) {
            case 0:
                int i3 = this.f119725b;
                yuk yukVar = yuk.f276404a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        i = this.f119730g;
                        nizVar = this.f119729f;
                        bga.m29073P(obj);
                        obj2 = ((s6x0) obj).f206218a;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                niz nizVar3 = (niz) this.f119726c;
                j4d j4dVar = (j4d) this.f119727d;
                hrv0 hrv0Var = this.f119728e.f88417f;
                String str = j4dVar.f108670a;
                this.f119726c = null;
                this.f119729f = nizVar3;
                this.f119730g = 0;
                this.f119725b = 1;
                Object objM48409a = hrv0Var.m48409a(str, this);
                if (objM48409a == yukVar) {
                    return yukVar;
                }
                nizVar = nizVar3;
                obj2 = objM48409a;
                i = 0;
                if (obj2 instanceof c6x0) {
                    this.f119726c = null;
                    this.f119729f = null;
                    this.f119730g = i;
                    this.f119725b = 2;
                    if (nizVar.emit(y7d.f270030a, this) == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1.f247311a;
            default:
                int i4 = this.f119725b;
                yuk yukVar2 = yuk.f276404a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        i2 = this.f119730g;
                        nizVar2 = this.f119729f;
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
                niz nizVar4 = (niz) this.f119726c;
                g4d g4dVar = (g4d) this.f119727d;
                k791 k791Var = this.f119728e.f88436y;
                String str2 = g4dVar.f76389a;
                this.f119726c = null;
                this.f119729f = nizVar4;
                this.f119730g = 0;
                this.f119725b = 1;
                Object objM55639f = k791Var.m55639f(str2, this);
                if (objM55639f == yukVar2) {
                    return yukVar2;
                }
                nizVar2 = nizVar4;
                obj = objM55639f;
                i2 = 0;
                this.f119726c = null;
                this.f119729f = null;
                this.f119730g = i2;
                this.f119725b = 2;
                if (nizVar2.emit(obj, this) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
        }
    }
}
