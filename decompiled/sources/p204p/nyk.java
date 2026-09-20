package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nyk implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x5m f159824b;

    public /* synthetic */ nyk(x5m x5mVar, int i) {
        this.f159823a = i;
        this.f159824b = x5mVar;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f159823a) {
            case 0:
                this.f159824b.stop();
                break;
            default:
                this.f159824b.stop();
                break;
        }
    }
}
