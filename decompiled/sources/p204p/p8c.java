package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class p8c extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kkj f174933b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8c(kkj kkjVar, int i) {
        super(1);
        this.f174932a = i;
        this.f174933b = kkjVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f174932a) {
            case 0:
                String str = ((ljj) this.f174933b).f134093a;
                lpz0 lpz0Var = r071.f194395a;
                qr60 qr60Var = q8c.f186284a[0];
                ((mpz0) obj).mo62511a(lpz0Var, str);
                break;
            case 1:
                String str2 = ((qjj) this.f174933b).f189253a;
                lpz0 lpz0Var2 = r071.f194395a;
                qr60 qr60Var2 = q8c.f186284a[0];
                ((mpz0) obj).mo62511a(lpz0Var2, str2);
                break;
            default:
                String str3 = ((ejj) this.f174933b).f60235a.f33892a;
                lpz0 lpz0Var3 = r071.f194395a;
                qr60 qr60Var3 = q8c.f186284a[0];
                ((mpz0) obj).mo62511a(lpz0Var3, str3);
                break;
        }
        return w2a1.f247311a;
    }
}
