package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hbi0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f89545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qt31 f89546b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rt31 f89547c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f89548d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gh00 f89549e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f89550f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbi0(boolean z, qt31 qt31Var, rt31 rt31Var, boolean z2, gh00 gh00Var, int i) {
        super(0);
        this.f89545a = z;
        this.f89546b = qt31Var;
        this.f89547c = rt31Var;
        this.f89548d = z2;
        this.f89549e = gh00Var;
        this.f89550f = i;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        if (this.f89545a) {
            tt31.m81495b(this.f89546b, this.f89547c, this.f89548d ? o850.f162712d : o850.f162713e);
            this.f89549e.invoke(Integer.valueOf(this.f89550f));
        }
        return w2a1.f247311a;
    }
}
