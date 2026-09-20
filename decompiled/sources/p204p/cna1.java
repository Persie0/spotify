package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cna1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dna1 f39934b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cna1(dna1 dna1Var, int i) {
        super(1);
        this.f39933a = i;
        this.f39934b = dna1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f39933a) {
            case 0:
                String strM36462h = dna1.m36462h(this.f39934b, (tma1) obj);
                if (strM36462h == null || !hf41.m47326b(strM36462h) || hf41.m47327c(strM36462h)) {
                    return null;
                }
                return strM36462h;
            default:
                String strM36462h2 = dna1.m36462h(this.f39934b, (tma1) obj);
                if (strM36462h2 != null && hf41.m47326b(strM36462h2) && hf41.m47327c(strM36462h2)) {
                    return strM36462h2;
                }
                return null;
        }
    }
}
