package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class or0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa9 f168409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f168410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or0(pa9 pa9Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f168408a = i;
        this.f168409b = pa9Var;
        this.f168410c = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f168408a) {
            case 0:
                return new or0(this.f168409b, this.f168410c, fbkVar, 0);
            default:
                return new or0(this.f168409b, this.f168410c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f168408a) {
            case 0:
                or0 or0Var = (or0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                or0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                or0 or0Var2 = (or0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                or0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f168408a) {
            case 0:
                bga.m29073P(obj);
                this.f168409b.m69449o(((Boolean) this.f168410c.getValue()).booleanValue());
                break;
            default:
                bga.m29073P(obj);
                if (((Boolean) this.f168410c.getValue()).booleanValue()) {
                    pa9 pa9Var = this.f168409b;
                    pa9Var.m69441f();
                    pa9Var.m69450p(3);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
