package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g730 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k730 f77167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g730(k730 k730Var, int i) {
        super(0);
        this.f77166a = i;
        this.f77167b = k730Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f77166a) {
            case 0:
                vw90 vw90Var = this.f77167b.f119930k1;
                if (vw90Var != null) {
                    vw90Var.m86546u();
                }
                break;
            default:
                k730 k730Var = this.f77167b;
                vw90 vw90Var2 = k730Var.f119930k1;
                if (vw90Var2 != null && k730Var.f119933n1.f6301V0 <= 1.0f) {
                    vw90Var2.m86536E();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
