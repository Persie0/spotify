package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p3y0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ azu0 f173769b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3y0(azu0 azu0Var, int i) {
        super(1);
        this.f173768a = i;
        this.f173769b = azu0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f173768a) {
            case 0:
                ((Number) obj).intValue();
                return (st91) this.f173769b.f21690b;
            default:
                return new oq91(new p3y0(this.f173769b, 0));
        }
    }
}
