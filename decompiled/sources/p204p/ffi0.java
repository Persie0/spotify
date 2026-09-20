package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ffi0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gfi0 f69012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffi0(gfi0 gfi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f69011a = i;
        this.f69012b = gfi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f69011a) {
            case 0:
                return new ffi0(this.f69012b, fbkVar, 0);
            default:
                return new ffi0(this.f69012b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f69011a) {
            case 0:
                ffi0 ffi0Var = (ffi0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                ffi0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                ffi0 ffi0Var2 = (ffi0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                ffi0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f69011a) {
            case 0:
                bga.m29073P(obj);
                this.f69012b.f79362a.mo47345e();
                break;
            default:
                bga.m29073P(obj);
                this.f69012b.f79362a.mo47343c();
                break;
        }
        return w2a1.f247311a;
    }
}
