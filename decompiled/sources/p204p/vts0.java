package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vts0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244770a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wts0 f244771b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vts0(wts0 wts0Var, int i) {
        super(1);
        this.f244770a = i;
        this.f244771b = wts0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f244770a) {
            case 0:
                wts0 wts0Var = this.f244771b;
                return new loo0(wts0Var.f255007e.f115962f.m54310e(wts0Var.f255005c), 1);
            default:
                return new iz80(this.f244771b.f255005c);
        }
    }
}
