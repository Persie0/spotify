package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class z3c extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278864a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f278865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aqz f278866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3c(boolean z, aqz aqzVar, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f278864a = i;
        this.f278865b = z;
        this.f278866c = aqzVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f278864a) {
            case 0:
                return new z3c(this.f278865b, this.f278866c, fbkVar, 0);
            case 1:
                return new z3c(this.f278865b, this.f278866c, fbkVar, 1);
            default:
                return new z3c(this.f278865b, this.f278866c, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f278864a) {
            case 0:
                z3c z3cVar = (z3c) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                z3cVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                z3c z3cVar2 = (z3c) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                z3cVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            default:
                z3c z3cVar3 = (z3c) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                z3cVar3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f278864a) {
            case 0:
                bga.m29073P(obj);
                if (this.f278865b) {
                    try {
                        aqz.m26907b(this.f278866c);
                        break;
                    } catch (IllegalStateException unused) {
                    }
                }
                break;
            case 1:
                bga.m29073P(obj);
                if (this.f278865b) {
                    aqz.m26907b(this.f278866c);
                }
                break;
            default:
                bga.m29073P(obj);
                if (this.f278865b) {
                    aqz.m26907b(this.f278866c);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
