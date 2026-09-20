package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zsd0 implements v8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zk1 f285922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o0a0 f285923c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lhd0 f285924d;

    public /* synthetic */ zsd0(zk1 zk1Var, o0a0 o0a0Var, lhd0 lhd0Var, int i) {
        this.f285921a = i;
        this.f285922b = zk1Var;
        this.f285923c = o0a0Var;
        this.f285924d = lhd0Var;
    }

    @Override // p204p.v8j
    public final void accept(Object obj) {
        ctd0 ctd0Var = (ctd0) obj;
        switch (this.f285921a) {
            case 0:
                zk1 zk1Var = this.f285922b;
                ctd0Var.mo33837d(zk1Var.f283580c, (vsd0) zk1Var.f283581d, this.f285923c, this.f285924d);
                break;
            default:
                zk1 zk1Var2 = this.f285922b;
                ctd0Var.mo33838m(zk1Var2.f283580c, (vsd0) zk1Var2.f283581d, this.f285923c, this.f285924d);
                break;
        }
    }
}
