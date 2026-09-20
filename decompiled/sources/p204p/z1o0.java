package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z1o0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278376a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b2o0 f278377b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1o0(b2o0 b2o0Var, int i) {
        super(0);
        this.f278376a = i;
        this.f278377b = b2o0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f278376a) {
            case 0:
                b2o0 b2o0Var = this.f278377b;
                b2o0Var.f22658W1 = true;
                b2o0Var.m83052i1(false, false);
                break;
            default:
                b2o0 b2o0Var2 = this.f278377b;
                b2o0Var2.f22658W1 = false;
                b2o0Var2.m83052i1(false, false);
                break;
        }
        return w2a1.f247311a;
    }
}
