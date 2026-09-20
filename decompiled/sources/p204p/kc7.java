package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kc7 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ voc1 f121396b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f121397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kc7(voc1 voc1Var, eh00 eh00Var, int i) {
        super(1);
        this.f121395a = i;
        switch (i) {
            case 1:
                this.f121396b = voc1Var;
                this.f121397c = (qe70) eh00Var;
                super(1);
                break;
            default:
                this.f121396b = voc1Var;
                this.f121397c = (qe70) eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.eh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f121395a) {
            case 0:
                v6w0 v6w0Var = (v6w0) obj;
                return new q0k(v6w0Var.f237979a, this.f121396b.f243453a, new jc7((eh00) this.f121397c, v6w0Var, 0), 12);
            default:
                v6w0 v6w0Var2 = (v6w0) obj;
                return new q0k(v6w0Var2.f237979a, this.f121396b.f243453a, new jc7((eh00) this.f121397c, v6w0Var2, 2), 12);
        }
    }
}
