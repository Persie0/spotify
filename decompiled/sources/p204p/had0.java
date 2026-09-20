package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class had0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f89197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ead0 f89198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ had0(gh00 gh00Var, ead0 ead0Var, int i) {
        super(0);
        this.f89196a = i;
        this.f89197b = gh00Var;
        this.f89198c = ead0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f89196a) {
            case 0:
                this.f89197b.invoke(new aad0(this.f89198c.f57624a));
                break;
            default:
                this.f89197b.invoke(new bad0(this.f89198c.f57624a));
                break;
        }
        return w2a1.f247311a;
    }
}
