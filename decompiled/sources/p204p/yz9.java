package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yz9 implements ffz, c2b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f277731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i4t0 f277732b;

    public /* synthetic */ yz9(i4t0 i4t0Var, int i) {
        this.f277731a = i;
        this.f277732b = i4t0Var;
    }

    @Override // p204p.ffz
    /* JADX INFO: renamed from: e */
    public final Object mo24334e() {
        switch (this.f277731a) {
            case 0:
                return Integer.valueOf(((m0a) this.f277732b.get()).m60425a());
            default:
                return Long.valueOf(((hsi) this.f277732b.get()).m48502R());
        }
    }
}
