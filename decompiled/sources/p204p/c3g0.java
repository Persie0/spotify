package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c3g0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33675a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x0h0 f33676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3g0(x0h0 x0h0Var, int i) {
        super(1);
        this.f33675a = i;
        this.f33676b = x0h0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f33675a) {
            case 0:
                ((Number) obj).intValue();
                return this.f33676b.mo24361d();
            default:
                return new oq91(new c3g0(this.f33676b, 0));
        }
    }
}
