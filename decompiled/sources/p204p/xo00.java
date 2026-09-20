package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xo00 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f263737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f263738b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f263739c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f263740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo00(boolean z, float f, boolean z2, float f2) {
        super(1);
        this.f263737a = z;
        this.f263738b = f;
        this.f263739c = z2;
        this.f263740d = f2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fdx0 fdx0Var = (fdx0) obj;
        fdx0Var.m41397w(this.f263737a ? 0.0f : this.f263738b);
        if (this.f263739c) {
            float f = this.f263740d;
            fdx0Var.m41390m(f);
            fdx0Var.m41391o(f);
        }
        return w2a1.f247311a;
    }
}
