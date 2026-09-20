package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jdt0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f111394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czd1 f111395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jdt0(gh00 gh00Var, czd1 czd1Var, int i) {
        super(0);
        this.f111393a = i;
        this.f111394b = gh00Var;
        this.f111395c = czd1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f111393a) {
            case 0:
                this.f111394b.invoke(new vct0(this.f111395c));
                break;
            default:
                this.f111394b.invoke(new vct0(this.f111395c));
                break;
        }
        return w2a1.f247311a;
    }
}
