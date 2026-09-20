package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d81 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tvy0 f46328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d81(tvy0 tvy0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f46327a = i;
        this.f46328b = tvy0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f46327a) {
            case 0:
                return new d81(this.f46328b, fbkVar, 0);
            default:
                return new d81(this.f46328b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f46327a) {
            case 0:
                d81 d81Var = (d81) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                d81Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                d81 d81Var2 = (d81) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                d81Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f46327a) {
            case 0:
                bga.m29073P(obj);
                aqz.m26907b(this.f46328b.f224271a);
                break;
            default:
                bga.m29073P(obj);
                aqz.m26907b(this.f46328b.f224271a);
                break;
        }
        return w2a1.f247311a;
    }
}
