package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kg1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122270a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f122271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f122272c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pla1 f122273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg1(gh00 gh00Var, int i, pla1 pla1Var) {
        super(0);
        this.f122271b = gh00Var;
        this.f122272c = i;
        this.f122273d = pla1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f122270a) {
            case 0:
                this.f122271b.invoke(new dh1(this.f122272c, this.f122273d));
                break;
            default:
                this.f122271b.invoke(new v6l(this.f122272c, this.f122273d));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg1(gh00 gh00Var, pla1 pla1Var, int i) {
        super(0);
        this.f122271b = gh00Var;
        this.f122273d = pla1Var;
        this.f122272c = i;
    }
}
