package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lst0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136608a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pst0 f136609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f136610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lst0(pst0 pst0Var, eh00 eh00Var, int i) {
        super(0);
        this.f136608a = i;
        switch (i) {
            case 1:
                this.f136609b = pst0Var;
                this.f136610c = (qe70) eh00Var;
                super(0);
                break;
            default:
                this.f136609b = pst0Var;
                this.f136610c = (qe70) eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v5, types: [p.eh00, p.qe70] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f136608a) {
            case 0:
                this.f136609b.f180949a1 = null;
                this.f136610c.invoke();
                break;
            default:
                this.f136609b.f180951b1 = null;
                this.f136610c.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
