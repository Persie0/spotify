package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ujf1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ykf1 f231026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ujf1(ykf1 ykf1Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f231025a = i;
        this.f231026b = ykf1Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f231025a) {
            case 0:
                return new ujf1(this.f231026b, fbkVar, 0);
            default:
                return new ujf1(this.f231026b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f231025a) {
            case 0:
                ujf1 ujf1Var = (ujf1) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                ujf1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                ujf1 ujf1Var2 = (ujf1) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                ujf1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f231025a) {
            case 0:
                bga.m29073P(obj);
                this.f231026b.m93987a();
                break;
            default:
                bga.m29073P(obj);
                this.f231026b.m93987a();
                break;
        }
        return w2a1.f247311a;
    }
}
