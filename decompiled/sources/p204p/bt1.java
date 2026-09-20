package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bt1 implements f7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f30490b;

    public /* synthetic */ bt1(kqi0 kqi0Var, int i) {
        this.f30489a = i;
        this.f30490b = kqi0Var;
    }

    @Override // p204p.f7x0
    /* JADX INFO: renamed from: e */
    public final void mo29825e(c7x0 c7x0Var) {
        String str;
        switch (this.f30489a) {
            case 0:
                if (c7x0Var instanceof n6x0) {
                    ((gh00) this.f30490b.getValue()).invoke(new cq1(((sbl) ((n6x0) c7x0Var).f150980a).f207525a));
                }
                break;
            case 1:
                if (c7x0Var instanceof n6x0) {
                    Object obj = ((kcm) ((n6x0) c7x0Var).f150980a).f121509a.get(new c251("artifact-page-location"));
                    String str2 = null;
                    bma0 bma0Var = obj instanceof bma0 ? (bma0) obj : null;
                    if (bma0Var != null && (str = bma0Var.f28481a) != null && !wl51.m88460J0(str)) {
                        str2 = str;
                    }
                    if (str2 != null) {
                        ((gh00) this.f30490b.getValue()).invoke(new ula0(str2));
                    }
                }
                break;
            case 2:
                ((gh00) this.f30490b.getValue()).invoke(ssn0.f213684a);
                break;
            default:
                if (c7x0Var instanceof n6x0) {
                    this.f30490b.setValue(Boolean.valueOf(((uri0) ((n6x0) c7x0Var).f150980a).f233383a));
                }
                break;
        }
    }
}
