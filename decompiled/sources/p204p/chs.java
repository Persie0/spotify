package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class chs implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ehs f38073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fhs f38074c;

    public /* synthetic */ chs(ehs ehsVar, fhs fhsVar, int i) {
        this.f38072a = i;
        this.f38073b = ehsVar;
        this.f38074c = fhsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38072a) {
            case 0:
                ehs ehsVar = this.f38073b;
                this.f38074c.mo41680E(ehsVar.f59655a, ehsVar.f59656b);
                break;
            case 1:
                ehs ehsVar2 = this.f38073b;
                this.f38074c.mo40365S(ehsVar2.f59655a, ehsVar2.f59656b);
                break;
            default:
                ehs ehsVar3 = this.f38073b;
                this.f38074c.mo40372p(ehsVar3.f59655a, ehsVar3.f59656b);
                break;
        }
    }
}
