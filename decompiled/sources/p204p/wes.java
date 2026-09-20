package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wes implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250613a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f250614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f250615c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f250616d;

    public wes(jom0 jom0Var, vwf vwfVar, int i) {
        this.f250615c = jom0Var;
        this.f250616d = vwfVar;
        this.f250614b = i;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f250613a) {
            case 0:
                ib31 ib31Var = (ib31) this.f250615c;
                int i = this.f250614b;
                ib31Var.remove(Integer.valueOf(i));
                ((ib31) this.f250616d).remove(Integer.valueOf(i));
                break;
            default:
                ((jom0) this.f250615c).m53890a(this.f250614b, (vwf) this.f250616d).m54371a(jxf.f117122a);
                break;
        }
    }

    public wes(ib31 ib31Var, int i, ib31 ib31Var2) {
        this.f250615c = ib31Var;
        this.f250614b = i;
        this.f250616d = ib31Var2;
    }
}
