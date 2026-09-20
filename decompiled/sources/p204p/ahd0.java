package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ahd0 implements qpd0, msd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f15672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ egd0 f15673c;

    public /* synthetic */ ahd0(int i, String str, egd0 egd0Var) {
        this.f15671a = i;
        this.f15672b = str;
        this.f15673c = egd0Var;
    }

    @Override // p204p.qpd0
    /* JADX INFO: renamed from: e */
    public void mo25926e(snd0 snd0Var, int i) {
        snd0Var.mo51517n(i, this.f15672b, this.f15673c);
    }

    @Override // p204p.msd0
    /* JADX INFO: renamed from: g */
    public Object mo25927g(rpd0 rpd0Var, tnd0 tnd0Var, int i) {
        switch (this.f15671a) {
            case 1:
                return ((dhd0) rpd0Var).m36020M(tnd0Var, this.f15672b, this.f15673c);
            default:
                return ((dhd0) rpd0Var).m36019L(tnd0Var, this.f15672b, this.f15673c);
        }
    }
}
