package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aq2 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f18058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vp2 f18059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq2(gh00 gh00Var, vp2 vp2Var, int i) {
        super(0);
        this.f18057a = i;
        this.f18058b = gh00Var;
        this.f18059c = vp2Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f18057a) {
            case 0:
                this.f18058b.invoke(new op2(((up2) this.f18059c).f232557b));
                break;
            default:
                this.f18058b.invoke(new np2(((up2) this.f18059c).f232558c));
                break;
        }
        return w2a1.f247311a;
    }
}
