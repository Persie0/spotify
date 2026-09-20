package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e38 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qoc1 f55675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g38 f55676c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sag0 f55677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e38(qoc1 qoc1Var, g38 g38Var, sag0 sag0Var, int i) {
        super(0);
        this.f55674a = i;
        this.f55675b = qoc1Var;
        this.f55676c = g38Var;
        this.f55677d = sag0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f55674a) {
            case 0:
                sag0 sag0Var = this.f55677d;
                g38 g38Var = this.f55676c;
                return this.f55675b.m73390a(g38Var, new d38(sag0Var, g38Var, 0));
            default:
                sag0 sag0Var2 = this.f55677d;
                g38 g38Var2 = this.f55676c;
                return this.f55675b.m73390a(g38Var2, new d38(sag0Var2, g38Var2, 1));
        }
    }
}
