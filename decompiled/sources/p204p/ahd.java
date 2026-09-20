package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ahd extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f15669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh60 f15670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ahd(gh00 gh00Var, gh60 gh60Var, int i) {
        super(0);
        this.f15668a = i;
        this.f15669b = gh00Var;
        this.f15670c = gh60Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f15668a) {
            case 0:
                this.f15669b.invoke(new svw(((eh60) this.f15670c).f59507b));
                break;
            case 1:
                this.f15669b.invoke(new tvw(((fh60) this.f15670c).f69590a));
                break;
            case 2:
                this.f15669b.invoke(new msw(((bh60) this.f15670c).f27091a));
                break;
            default:
                this.f15669b.invoke(new juw(((dh60) this.f15670c).f48991a));
                break;
        }
        return w2a1.f247311a;
    }
}
