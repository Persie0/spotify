package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sec extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f208269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rec f208270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sec(gh00 gh00Var, rec recVar, int i) {
        super(0);
        this.f208268a = i;
        this.f208269b = gh00Var;
        this.f208270c = recVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f208268a) {
            case 0:
                this.f208269b.invoke(new pec(this.f208270c.f198338b));
                break;
            default:
                this.f208269b.invoke(new pec(this.f208270c.f198338b));
                break;
        }
        return w2a1.f247311a;
    }
}
