package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b6k extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23977a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f6k f23978b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6k(f6k f6kVar, int i) {
        super(0);
        this.f23977a = i;
        this.f23978b = f6kVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f23977a) {
            case 0:
                this.f23978b.f66429d.m63782a(bda.f26061a);
                return w2a1.f247311a;
            case 1:
                this.f23978b.f66429d.m63782a(bda.f26063c);
                return w2a1.f247311a;
            default:
                rxd1.f203578a.getClass();
                int iHeight = sxd1.f214876b.m79592a(this.f23978b.f66426a).m74115a().height();
                if (iHeight < 0) {
                    iHeight = 0;
                }
                return Integer.valueOf(iHeight);
        }
    }
}
