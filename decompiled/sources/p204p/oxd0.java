package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oxd0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f170964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f170965b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f170966c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f170967d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uum0 f170968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxd0(long j, float f, long j2, float f2, uum0 uum0Var) {
        super(1);
        this.f170964a = j;
        this.f170965b = f;
        this.f170966c = j2;
        this.f170967d = f2;
        this.f170968e = uum0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        this.f170968e.m84032w(n0e1.m63436m(this.f170967d + ((((((Number) obj).longValue() - this.f170964a) / 1000000.0f) * this.f170965b) / this.f170966c), 0.0f, 1.0f));
        return w2a1.f247311a;
    }
}
