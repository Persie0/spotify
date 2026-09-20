package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bsp0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zrp0 f30375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f30376c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bsp0(zrp0 zrp0Var, gh00 gh00Var, int i) {
        super(1);
        this.f30374a = i;
        this.f30375b = zrp0Var;
        this.f30376c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f30374a) {
            case 0:
                this.f30375b.f285723g.invoke();
                this.f30376c.invoke(new vrp0(((whu0) obj).f251445a));
                break;
            default:
                d850 d850Var = (d850) obj;
                this.f30375b.f285723g.invoke();
                this.f30376c.invoke(new srp0(d850Var != null ? d850Var.f46380a : null));
                break;
        }
        return w2a1.f247311a;
    }
}
