package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ifk0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101776a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mhk0 f101777b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f101778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ifk0(mhk0 mhk0Var, gh00 gh00Var, int i) {
        super(0);
        this.f101776a = i;
        this.f101777b = mhk0Var;
        this.f101778c = gh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f101776a) {
            case 0:
                boolean z = this.f101777b.f143817e;
                gh00 gh00Var = this.f101778c;
                if (z) {
                    gh00Var.invoke(mhe1.f143778a);
                } else {
                    gh00Var.invoke(ohe1.f165420a);
                }
                break;
            default:
                boolean z2 = this.f101777b.f143817e;
                gh00 gh00Var2 = this.f101778c;
                if (z2) {
                    gh00Var2.invoke(nhe1.f153996a);
                } else {
                    gh00Var2.invoke(phe1.f177644a);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
