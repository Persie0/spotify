package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jev0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lev0 f111681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jev0(lev0 lev0Var, int i) {
        super(1);
        this.f111680a = i;
        this.f111681b = lev0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f111680a) {
            case 0:
                return this.f111681b.f132727c;
            default:
                i4t0 i4t0Var = this.f111681b.f132728d.f163995a.f118755a;
                return new iev0(((qq4) i4t0Var.get()).m73486n(), ((qq4) i4t0Var.get()).m73485m(), 71);
        }
    }
}
