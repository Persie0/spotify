package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xs50 implements q7l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265502a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ai00 f265503b;

    /* JADX WARN: Multi-variable type inference failed */
    public xs50(int i, eh00 eh00Var) {
        this.f265502a = i;
        switch (i) {
            case 1:
                this.f265503b = (qe70) eh00Var;
                break;
            default:
                this.f265503b = eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [p.eh00, p.qe70] */
    @Override // p204p.q7l0
    public final /* synthetic */ void onClick() {
        switch (this.f265502a) {
            case 0:
                ((eh00) this.f265503b).invoke();
                break;
            default:
                ((qe70) this.f265503b).invoke();
                break;
        }
    }
}
