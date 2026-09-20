package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vrc0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vum0 f244166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vrc0(vum0 vum0Var, int i) {
        super(0);
        this.f244165a = i;
        this.f244166b = vum0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f244165a) {
            case 0:
                return Integer.valueOf(this.f244166b.m86437v());
            case 1:
                return Integer.valueOf(this.f244166b.m86437v() * 2);
            case 2:
                this.f244166b.m86438w(-1);
                return w2a1.f247311a;
            default:
                return Integer.valueOf(this.f244166b.m86437v());
        }
    }
}
