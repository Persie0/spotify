package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vzc1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f246438b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qnj0 f246439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vzc1(gh00 gh00Var, qnj0 qnj0Var, int i) {
        super(0);
        this.f246437a = i;
        this.f246438b = gh00Var;
        this.f246439c = qnj0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f246437a) {
            case 0:
                this.f246438b.invoke(new zzc1(this.f246439c.f190621a));
                break;
            default:
                this.f246438b.invoke(new yzc1(this.f246439c.f190621a));
                break;
        }
        return w2a1.f247311a;
    }
}
