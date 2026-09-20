package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o111 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p111 f160568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ccl0 f160569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o111(p111 p111Var, ccl0 ccl0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f160567a = i;
        this.f160568b = p111Var;
        this.f160569c = ccl0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f160567a) {
            case 0:
                return new o111(this.f160568b, this.f160569c, fbkVar, 0);
            default:
                return new o111(this.f160568b, this.f160569c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f160567a) {
            case 0:
                o111 o111Var = (o111) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                o111Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                o111 o111Var2 = (o111) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                o111Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f160567a) {
            case 0:
                bga.m29073P(obj);
                k5m0 k5m0Var = this.f160568b.f172914X;
                ccl0 ccl0Var = this.f160569c;
                k5m0Var.mo55543b(ccl0Var.f36431a, ccl0Var.f36432b.f279709a, ccl0Var.f36433c);
                break;
            default:
                bga.m29073P(obj);
                z9j0 z9j0Var = this.f160568b.f172926t;
                ccl0 ccl0Var2 = this.f160569c;
                z9j0Var.mo47342b(ccl0Var2.f36431a, new d850(ccl0Var2.f36432b, null), ccl0Var2.f36433c);
                break;
        }
        return w2a1.f247311a;
    }
}
