package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yld extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f273982b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f273983c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f273984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yld(gh00 gh00Var, kqi0 kqi0Var, kqi0 kqi0Var2, int i) {
        super(0);
        this.f273981a = i;
        this.f273982b = gh00Var;
        this.f273983c = kqi0Var;
        this.f273984d = kqi0Var2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f273981a) {
            case 0:
                this.f273983c.setValue(Boolean.TRUE);
                ((nad) this.f273984d.getValue()).m63985b(ikd.f103089a, this.f273982b);
                break;
            case 1:
                this.f273983c.setValue(Boolean.TRUE);
                kqi0 kqi0Var = this.f273984d;
                nad nadVar = (nad) kqi0Var.getValue();
                hkd hkdVar = hkd.f92420a;
                gh00 gh00Var = this.f273982b;
                nadVar.m63985b(hkdVar, gh00Var);
                ((nad) kqi0Var.getValue()).m63985b(ikd.f103089a, gh00Var);
                break;
            case 2:
                this.f273982b.invoke(lzy.f138470b);
                this.f273983c.setValue(null);
                this.f273984d.setValue(null);
                break;
            default:
                this.f273982b.invoke(new kzy((jba0) this.f273983c.getValue(), (jba0) this.f273984d.getValue()));
                break;
        }
        return w2a1.f247311a;
    }
}
