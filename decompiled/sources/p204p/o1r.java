package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o1r extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n1r f160835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1r(n1r n1rVar, int i) {
        super(1);
        this.f160834a = i;
        this.f160835b = n1rVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f160834a) {
            case 0:
                long j = ((g450) obj).f76347a;
                zv41 zv41Var = this.f160835b.f149490f.f204781a;
                zv41Var.m97091m(null, r1r.m74489a((r1r) zv41Var.getValue(), false, false, Integer.valueOf((int) (j & 4294967295L)), null, 11));
                break;
            default:
                zv41 zv41Var2 = this.f160835b.f149490f.f204781a;
                zv41Var2.m97091m(null, r1r.m74489a((r1r) zv41Var2.getValue(), false, true, null, null, 13));
                break;
        }
        return w2a1.f247311a;
    }
}
