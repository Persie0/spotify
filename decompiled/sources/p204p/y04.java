package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y04 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a14 f267891b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y04(a14 a14Var, int i) {
        super(0);
        this.f267890a = i;
        this.f267891b = a14Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        gjx gjxVar;
        switch (this.f267890a) {
            case 0:
                a14 a14Var = this.f267891b;
                a14.m24416a(a14Var);
                gjx gjxVar2 = a14Var.f11319c;
                if (gjxVar2 != null) {
                    gjxVar2.m45010t1();
                }
                a14Var.f11319c = null;
                break;
            default:
                x04 x04Var = this.f267891b.f11321e;
                if (x04Var != null && (gjxVar = this.f267891b.f11319c) != null) {
                    gjxVar.mo43850O(x04Var);
                }
                this.f267891b.f11321e = null;
                gjx gjxVar3 = this.f267891b.f11319c;
                if (gjxVar3 != null) {
                    gjxVar3.stop();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
