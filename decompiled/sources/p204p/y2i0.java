package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class y2i0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z2i0 f268622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2i0(z2i0 z2i0Var, int i) {
        super(1);
        this.f268621a = i;
        this.f268622b = z2i0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f268621a) {
            case 0:
                sne1 sne1Var = (sne1) this.f268622b.m51990a((wne1) obj);
                return new t3i0(sne1Var.f210919a, sne1Var.f210920b);
            default:
                sne1 sne1Var2 = (sne1) this.f268622b.m51990a((wne1) obj);
                return new v2i0(sne1Var2.f210919a, sne1Var2.f210920b);
        }
    }
}
