package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vhd1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f241493b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vum0 f241494c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f241495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vhd1(xre xreVar, eh00 eh00Var, vum0 vum0Var, kqi0 kqi0Var, int i) {
        super(1);
        this.f241492a = i;
        this.f241493b = eh00Var;
        this.f241494c = vum0Var;
        this.f241495d = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f241492a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                vum0 vum0Var = this.f241494c;
                vum0Var.m86438w(vum0Var.m86437v() + iIntValue);
                this.f241495d.setValue(Long.valueOf(System.currentTimeMillis()));
                this.f241493b.invoke();
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                vum0 vum0Var2 = this.f241494c;
                vum0Var2.m86438w(vum0Var2.m86437v() + iIntValue2);
                this.f241495d.setValue(Long.valueOf(System.currentTimeMillis()));
                this.f241493b.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
