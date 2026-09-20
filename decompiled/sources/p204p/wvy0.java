package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wvy0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f255639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l971 f255640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wvy0(gh00 gh00Var, l971 l971Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f255638a = i;
        this.f255639b = gh00Var;
        this.f255640c = l971Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f255638a) {
            case 0:
                return new wvy0(this.f255639b, this.f255640c, fbkVar, 0);
            case 1:
                return new wvy0(this.f255639b, this.f255640c, fbkVar, 1);
            default:
                return new wvy0(this.f255639b, this.f255640c, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f255638a) {
            case 0:
                wvy0 wvy0Var = (wvy0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                wvy0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                wvy0 wvy0Var2 = (wvy0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                wvy0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            default:
                wvy0 wvy0Var3 = (wvy0) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                wvy0Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f255638a) {
            case 0:
                bga.m29073P(obj);
                this.f255639b.invoke(this.f255640c.m58500d().f226935c.toString());
                break;
            case 1:
                bga.m29073P(obj);
                this.f255639b.invoke(this.f255640c.m58500d().f226935c.toString());
                break;
            default:
                bga.m29073P(obj);
                this.f255639b.invoke(new v081(this.f255640c.m58500d().f226935c.toString()));
                break;
        }
        return w2a1.f247311a;
    }
}
