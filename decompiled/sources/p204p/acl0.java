package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class acl0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ybl0 f14388b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f14389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acl0(ybl0 ybl0Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f14387a = i;
        this.f14388b = ybl0Var;
        this.f14389c = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f14387a) {
            case 0:
                return new acl0(this.f14388b, this.f14389c, fbkVar, 0);
            default:
                return new acl0(this.f14388b, this.f14389c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f14387a) {
            case 0:
                acl0 acl0Var = (acl0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                acl0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                acl0 acl0Var2 = (acl0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                acl0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f14387a) {
            case 0:
                bga.m29073P(obj);
                this.f14389c.setValue(this.f14388b.m93288a());
                break;
            default:
                bga.m29073P(obj);
                kqi0 kqi0Var = this.f14389c;
                zbl0 zbl0Var = (zbl0) kqi0Var.getValue();
                kqi0Var.setValue(new zbl0(zbl0Var.f281345a, this.f14388b.f271215g));
                break;
        }
        return w2a1.f247311a;
    }
}
