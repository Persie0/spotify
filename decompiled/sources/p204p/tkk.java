package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tkk implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ogo f221161b;

    public /* synthetic */ tkk(ogo ogoVar, int i) {
        this.f221160a = i;
        this.f221161b = ogoVar;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f221160a) {
            case 0:
                this.f221161b.dispose();
                break;
            default:
                this.f221161b.dispose();
                break;
        }
    }
}
