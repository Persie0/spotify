package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uqd1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vqd1 f232984b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uqd1(vqd1 vqd1Var, int i) {
        super(0);
        this.f232983a = i;
        this.f232984b = vqd1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f232983a) {
            case 0:
                this.f232984b.m86208k(0);
                return w2a1.f247311a;
            case 1:
                vqd1 vqd1Var = this.f232984b;
                vqd1Var.m86208k(vqd1Var.m86207j().mo1617e() - 1);
                return w2a1.f247311a;
            default:
                return (yqd1) this.f232984b.f243934e.getAdapter();
        }
    }
}
