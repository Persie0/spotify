package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q1m0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ th00 f184375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o1m0 f184376c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f184377d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ eh00 f184378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1m0(th00 th00Var, o1m0 o1m0Var, gh00 gh00Var, eh00 eh00Var, int i) {
        super(1);
        this.f184374a = i;
        this.f184375b = th00Var;
        this.f184376c = o1m0Var;
        this.f184377d = gh00Var;
        this.f184378e = eh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f184374a) {
            case 0:
                th00 th00Var = this.f184375b;
                o1m0 o1m0Var = this.f184376c;
                th00Var.invoke((i500) obj, o1m0Var);
                this.f184377d.invoke(o1m0Var);
                this.f184378e.invoke();
                break;
            default:
                th00 th00Var2 = this.f184375b;
                o1m0 o1m0Var2 = this.f184376c;
                th00Var2.invoke((i500) obj, o1m0Var2);
                this.f184377d.invoke(o1m0Var2);
                this.f184378e.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
