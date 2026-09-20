package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rp2 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp2(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f201401a = i2;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f201401a) {
            case 0:
                return new rp2(2, 0, fbkVar);
            case 1:
                return new rp2(2, 1, fbkVar);
            default:
                return new rp2(2, 2, fbkVar);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f201401a) {
            case 0:
                rp2 rp2Var = (rp2) create((pp2) obj, (fbk) obj2);
                w2a1 w2a1Var = w2a1.f247311a;
                rp2Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                rp2 rp2Var2 = (rp2) create((log1) obj, (fbk) obj2);
                w2a1 w2a1Var2 = w2a1.f247311a;
                rp2Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            default:
                rp2 rp2Var3 = (rp2) create((log1) obj, (fbk) obj2);
                w2a1 w2a1Var3 = w2a1.f247311a;
                rp2Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f201401a) {
            case 0:
                bga.m29073P(obj);
                break;
            case 1:
                bga.m29073P(obj);
                break;
            default:
                bga.m29073P(obj);
                break;
        }
        return w2a1.f247311a;
    }
}
