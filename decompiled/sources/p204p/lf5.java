package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lf5 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eg5 f132800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f132801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf5(eg5 eg5Var, eh00 eh00Var, int i) {
        super(0);
        this.f132799a = i;
        this.f132800b = eg5Var;
        this.f132801c = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f132799a) {
            case 0:
                eg5 eg5Var = this.f132800b;
                if (!eg5Var.f59219b && eg5Var.m38773b()) {
                    this.f132801c.invoke();
                }
                break;
            default:
                if (this.f132800b.m38773b()) {
                    this.f132801c.invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
