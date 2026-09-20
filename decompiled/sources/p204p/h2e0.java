package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h2e0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f86958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fv41 f86959c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cg21 f86960d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xre f86961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2e0(gh00 gh00Var, fv41 fv41Var, cg21 cg21Var, xre xreVar, int i) {
        super(0);
        this.f86957a = i;
        this.f86958b = gh00Var;
        this.f86959c = fv41Var;
        this.f86960d = cg21Var;
        this.f86961e = xreVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f86957a) {
            case 0:
                this.f86958b.invoke(new fvw(qyg1.m74185O(this.f86959c, this.f86960d, this.f86961e)));
                break;
            case 1:
                this.f86958b.invoke(new s1x(qyg1.m74185O(this.f86959c, this.f86960d, this.f86961e)));
                break;
            default:
                this.f86958b.invoke(new s1x(qyg1.m74185O(this.f86959c, this.f86960d, this.f86961e)));
                break;
        }
        return w2a1.f247311a;
    }
}
