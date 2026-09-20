package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qbb1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ubb1 f187053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbb1(ubb1 ubb1Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f187052a = i;
        this.f187053b = ubb1Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f187052a) {
            case 0:
                return new qbb1(this.f187053b, fbkVar, 0);
            default:
                return new qbb1(this.f187053b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f187052a) {
            case 0:
                qbb1 qbb1Var = (qbb1) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                qbb1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                qbb1 qbb1Var2 = (qbb1) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                qbb1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f187052a) {
            case 0:
                bga.m29073P(obj);
                this.f187053b.f228682c.mo47345e();
                break;
            default:
                bga.m29073P(obj);
                this.f187053b.f228682c.mo47346g(xoc1.f264071e0.f243453a);
                break;
        }
        return w2a1.f247311a;
    }
}
