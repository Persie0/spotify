package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class t3s0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f216832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f216833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f216834c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f216835d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uum0 f216836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3s0(long j, float f, float f2, float f3, uum0 uum0Var) {
        super(1);
        this.f216832a = j;
        this.f216833b = f;
        this.f216834c = f2;
        this.f216835d = f3;
        this.f216836e = uum0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        float fLongValue = (((((Number) obj).longValue() - this.f216832a) / 1000000.0f) * this.f216833b) + this.f216834c;
        float f = this.f216835d;
        if (fLongValue > f) {
            fLongValue = f;
        }
        this.f216836e.m84032w(fLongValue);
        return w2a1.f247311a;
    }
}
