package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ped1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qed1 f176738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ped1(qed1 qed1Var, int i) {
        super(0);
        this.f176737a = i;
        this.f176738b = qed1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f176737a) {
            case 0:
                qed1 qed1Var = this.f176738b;
                qed1Var.f187908b.m66676g(ta80.ON_CREATE);
                oc80 oc80Var = qed1Var.f187908b;
                oc80Var.m66676g(ta80.ON_START);
                oc80Var.m66676g(ta80.ON_RESUME);
                break;
            default:
                qed1 qed1Var2 = this.f176738b;
                qed1Var2.f187908b.m66676g(ta80.ON_PAUSE);
                oc80 oc80Var2 = qed1Var2.f187908b;
                oc80Var2.m66676g(ta80.ON_STOP);
                oc80Var2.m66676g(ta80.ON_DESTROY);
                break;
        }
        return w2a1.f247311a;
    }
}
