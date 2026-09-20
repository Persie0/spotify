package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ew4 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63427b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew4(Object obj, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f63426a = i;
        this.f63427b = obj;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f63426a) {
            case 0:
                return new ew4((gw4) this.f63427b, fbkVar, 0);
            default:
                return new ew4((String) this.f63427b, fbkVar, 1);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f63426a) {
            case 0:
                ew4 ew4Var = (ew4) create(fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                ew4Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                ew4 ew4Var2 = (ew4) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return (String) ew4Var2.f63427b;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f63426a) {
            case 0:
                bga.m29073P(obj);
                gw4.m45908a((gw4) this.f63427b);
                return w2a1.f247311a;
            default:
                bga.m29073P(obj);
                return (String) this.f63427b;
        }
    }
}
