package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n2g0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149763a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ur91 f149764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2g0(ur91 ur91Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f149763a = i;
        this.f149764b = ur91Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f149763a) {
            case 0:
                return new n2g0(this.f149764b, fbkVar, 0);
            default:
                return new n2g0(this.f149764b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f149763a) {
            case 0:
                n2g0 n2g0Var = (n2g0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                n2g0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                n2g0 n2g0Var2 = (n2g0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                n2g0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f149763a) {
            case 0:
                bga.m29073P(obj);
                ur91 ur91Var = this.f149764b;
                lb81 lb81Var = lb81.f131600a;
                ur91Var.m83847c(lb81Var, null);
                ur91Var.m83846b(lb81Var, null);
                break;
            default:
                bga.m29073P(obj);
                ur91 ur91Var2 = this.f149764b;
                lb81 lb81Var2 = lb81.f131601b;
                ur91Var2.m83847c(lb81Var2, null);
                ur91Var2.m83846b(lb81Var2, null);
                break;
        }
        return w2a1.f247311a;
    }
}
