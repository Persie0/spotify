package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ijc implements sxb1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102784a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ be10 f102785b;

    public /* synthetic */ ijc(be10 be10Var, int i) {
        this.f102784a = i;
        this.f102785b = be10Var;
    }

    @Override // p204p.sxb1
    public final void run() {
        switch (this.f102784a) {
            case 0:
                this.f102785b.flush();
                break;
            default:
                this.f102785b.mo28862a();
                break;
        }
    }
}
