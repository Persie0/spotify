package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gnj0 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f82725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fnj0 f82726b;

    public /* synthetic */ gnj0(fnj0 fnj0Var, int i) {
        this.f82725a = i;
        this.f82726b = fnj0Var;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f82725a) {
            case 0:
                this.f82726b.dispose();
                break;
            default:
                this.f82726b.dispose();
                break;
        }
    }
}
