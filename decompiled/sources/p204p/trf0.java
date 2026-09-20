package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class trf0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f223057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qrf0 f223058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f223059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ trf0(qrf0 qrf0Var, gh00 gh00Var, int i) {
        super(0);
        this.f223057a = i;
        this.f223058b = qrf0Var;
        this.f223059c = gh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f223057a) {
            case 0:
                qrf0 qrf0Var = this.f223058b;
                prf0 prf0Var = qrf0Var.f191830a;
                boolean z = prf0Var.f180585b;
                gh00 gh00Var = this.f223059c;
                if (z) {
                    if (qrf0Var.f191831b) {
                        gh00Var.invoke(orf0.f168552c);
                    }
                } else if (prf0Var.f180584a) {
                    gh00Var.invoke(orf0.f168550a);
                }
                break;
            default:
                qrf0 qrf0Var2 = this.f223058b;
                prf0 prf0Var2 = qrf0Var2.f191830a;
                boolean z2 = prf0Var2.f180585b;
                gh00 gh00Var2 = this.f223059c;
                if (z2) {
                    if (qrf0Var2.f191831b) {
                        gh00Var2.invoke(orf0.f168552c);
                    }
                } else if (prf0Var2.f180584a) {
                    gh00Var2.invoke(orf0.f168550a);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
