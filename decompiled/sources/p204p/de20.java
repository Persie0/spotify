package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class de20 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ be20 f47935b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de20(be20 be20Var, int i) {
        super(1);
        this.f47934a = i;
        this.f47935b = be20Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f47934a) {
            case 0:
                return ((fjh0) obj).m41842a(this.f47935b.f26260d);
            case 1:
                return ((fjh0) obj).m41842a(this.f47935b.f26260d);
            default:
                jpz0.m54000n((mpz0) obj, this.f47935b.f26258b);
                return w2a1.f247311a;
        }
    }
}
