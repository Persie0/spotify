package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gyd1 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85555a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ p2x0 f85556b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ p2x0 f85557c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ iyd1 f85558d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qkc1 f85559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyd1(iyd1 iyd1Var, qkc1 qkc1Var, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f85555a = i;
        this.f85558d = iyd1Var;
        this.f85559e = qkc1Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        p2x0 p2x0Var = (p2x0) obj;
        p2x0 p2x0Var2 = (p2x0) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f85555a) {
            case 0:
                gyd1 gyd1Var = new gyd1(this.f85558d, this.f85559e, fbkVar, 0);
                gyd1Var.f85556b = p2x0Var;
                gyd1Var.f85557c = p2x0Var2;
                return gyd1Var.invokeSuspend(w2a1.f247311a);
            default:
                gyd1 gyd1Var2 = new gyd1(this.f85558d, this.f85559e, fbkVar, 1);
                gyd1Var2.f85556b = p2x0Var;
                gyd1Var2.f85557c = p2x0Var2;
                return gyd1Var2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f85555a) {
            case 0:
                p2x0 p2x0Var = this.f85556b;
                p2x0 p2x0Var2 = this.f85557c;
                bga.m29073P(obj);
                return iyd1.m51905a(this.f85558d, this.f85559e, p2x0Var, p2x0Var2);
            default:
                p2x0 p2x0Var3 = this.f85556b;
                p2x0 p2x0Var4 = this.f85557c;
                bga.m29073P(obj);
                return iyd1.m51905a(this.f85558d, this.f85559e, p2x0Var3, p2x0Var4);
        }
    }
}
