package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class caa1 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ caa1(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f35790a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        fbk fbkVar = (fbk) obj3;
        switch (this.f35790a) {
            case 0:
                caa1 caa1Var = new caa1(3, 0, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                caa1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                caa1 caa1Var2 = new caa1(3, 1, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                caa1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f35790a) {
            case 0:
                bga.m29073P(obj);
                break;
            default:
                bga.m29073P(obj);
                break;
        }
        return w2a1.f247311a;
    }
}
