package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wk1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252098a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yk1 f252099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk1(yk1 yk1Var, int i) {
        super(1);
        this.f252098a = i;
        this.f252099b = yk1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f252098a) {
            case 0:
                return new iz80(this.f252099b.f273530b);
            case 1:
                return this.f252099b.f273530b;
            default:
                return this.f252099b.f273530b;
        }
    }
}
