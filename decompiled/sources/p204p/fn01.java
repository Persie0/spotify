package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fn01 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fm01 f71141b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f71142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn01(int i, gh00 gh00Var, fm01 fm01Var) {
        super(1);
        this.f71140a = i;
        this.f71141b = fm01Var;
        this.f71142c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f71140a) {
            case 0:
                this.f71141b.f70905d.invoke();
                this.f71142c.invoke(new nl01(((whu0) obj).f251445a));
                break;
            default:
                d850 d850Var = (d850) obj;
                this.f71141b.f70905d.invoke();
                this.f71142c.invoke(new kl01(d850Var != null ? d850Var.f46380a : null));
                break;
        }
        return w2a1.f247311a;
    }
}
