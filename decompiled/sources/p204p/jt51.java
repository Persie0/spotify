package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jt51 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kt51 f115725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt51(kt51 kt51Var, int i) {
        super(1);
        this.f115724a = i;
        this.f115725b = kt51Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f115724a) {
            case 0:
                return Boolean.valueOf(this.f115725b.f126149i == ((sdc1) obj));
            default:
                sdc1 sdc1Var = (sdc1) obj;
                kt51 kt51Var = this.f115725b;
                if (kt51Var.f126149i == sdc1Var) {
                    kt51Var.f126149i = null;
                }
                return w2a1.f247311a;
        }
    }
}
