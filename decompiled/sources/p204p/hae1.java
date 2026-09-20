package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hae1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f89210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hae1(String str, int i) {
        super(1);
        this.f89209a = i;
        this.f89210b = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f89209a) {
            case 0:
                jpz0.m54000n((mpz0) obj, this.f89210b);
                break;
            case 1:
                jpz0.m54000n((mpz0) obj, this.f89210b);
                break;
            default:
                ((cqx) obj).m33646a(this.f89210b, n4m.class, false);
                break;
        }
        return w2a1.f247311a;
    }
}
