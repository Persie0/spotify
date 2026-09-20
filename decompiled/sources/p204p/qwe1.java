package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qwe1 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f193336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f193337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qwe1(Object obj, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f193336a = i;
        this.f193337b = obj;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f193336a) {
            case 0:
                qwe1 qwe1Var = new qwe1((gve1) this.f193337b, (fbk) obj3, 0);
                w2a1 w2a1Var = w2a1.f247311a;
                qwe1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                qwe1 qwe1Var2 = new qwe1((ikd1) this.f193337b, (fbk) obj3, 1);
                w2a1 w2a1Var2 = w2a1.f247311a;
                qwe1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f193336a) {
            case 0:
                bga.m29073P(obj);
                ((gve1) this.f193337b).f84741c.m60129c();
                break;
            default:
                bga.m29073P(obj);
                ((ikd1) this.f193337b).f103094b.m63782a(bda.f26063c);
                break;
        }
        return w2a1.f247311a;
    }
}
