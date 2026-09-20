package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b98 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f24797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f24798c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vum0 f24799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b98(gh00 gh00Var, boolean z, vum0 vum0Var, int i) {
        super(0);
        this.f24796a = i;
        this.f24797b = gh00Var;
        this.f24798c = z;
        this.f24799d = vum0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f24796a) {
            case 0:
                this.f24799d.m86438w(0);
                this.f24797b.invoke(new m88(0, this.f24798c));
                break;
            default:
                this.f24799d.m86438w(1);
                this.f24797b.invoke(new m88(1, this.f24798c));
                break;
        }
        return w2a1.f247311a;
    }
}
