package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q871 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qlv0 f186257b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d971 f186258c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qlv0 f186259d;

    public /* synthetic */ q871(qlv0 qlv0Var, qlv0 qlv0Var2, d971 d971Var, int i) {
        this.f186256a = i;
        this.f186257b = qlv0Var;
        this.f186259d = qlv0Var2;
        this.f186258c = d971Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f186256a) {
            case 0:
                d971 d971Var = this.f186258c;
                d971.m35324h(this.f186257b, this.f186259d, d971Var);
                break;
            case 1:
                d971 d971Var2 = this.f186258c;
                d971.m35324h(this.f186257b, this.f186259d, d971Var2);
                break;
            case 2:
                d971.m35323g(this.f186257b, this.f186259d, this.f186258c);
                break;
            default:
                d971.m35323g(this.f186257b, this.f186259d, this.f186258c);
                break;
        }
        return w2a1.f247311a;
    }

    public /* synthetic */ q871(qlv0 qlv0Var, d971 d971Var, qlv0 qlv0Var2, int i) {
        this.f186256a = i;
        this.f186257b = qlv0Var;
        this.f186258c = d971Var;
        this.f186259d = qlv0Var2;
    }
}
