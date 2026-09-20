package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o4b0 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa9 f161611b;

    public /* synthetic */ o4b0(pa9 pa9Var, int i) {
        this.f161610a = i;
        this.f161611b = pa9Var;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f161610a) {
            case 0:
                this.f161611b.m69455u();
                break;
            default:
                pa9 pa9Var = this.f161611b;
                pa9Var.m69455u();
                pa9Var.m69444i();
                break;
        }
    }
}
