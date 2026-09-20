package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yqd extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ crd f275193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqd(crd crdVar, int i) {
        super(1);
        this.f275192a = i;
        this.f275193b = crdVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f275192a) {
            case 0:
                jpz0.m54000n((mpz0) obj, this.f275193b.f41265a);
                break;
            default:
                jpz0.m54000n((mpz0) obj, this.f275193b.f41266b.f52300b);
                break;
        }
        return w2a1.f247311a;
    }
}
