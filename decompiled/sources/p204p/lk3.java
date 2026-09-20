package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lk3 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f134231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gk3 f134232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk3(gk3 gk3Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f134231a = i;
        this.f134232b = gk3Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f134231a) {
            case 0:
                return new lk3(this.f134232b, fbkVar, 0);
            default:
                return new lk3(this.f134232b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f134231a) {
            case 0:
                lk3 lk3Var = (lk3) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                lk3Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                lk3 lk3Var2 = (lk3) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                lk3Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f134231a) {
            case 0:
                bga.m29073P(obj);
                this.f134232b.f80690b.invoke();
                break;
            default:
                bga.m29073P(obj);
                this.f134232b.f80691c.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
