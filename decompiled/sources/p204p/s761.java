package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s761 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f206287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u761 f206288b;

    public /* synthetic */ s761(u761 u761Var, int i) {
        this.f206287a = i;
        this.f206288b = u761Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f206287a) {
            case 0:
                this.f206288b.mo61983a();
                break;
            case 1:
                this.f206288b.m61984b();
                break;
            default:
                u761 u761Var = this.f206288b;
                l861 l861Var = u761Var.f227524r;
                if (l861Var != null) {
                    l861Var.m58461e();
                }
                if (u761Var.f227523q == null) {
                    gbb gbbVar = u761Var.f227522p;
                    gbbVar.f78256d = true;
                    jbb jbbVar = gbbVar.f78254b;
                    if (jbbVar != null && jbbVar.f110727b.cancel(true)) {
                        gbbVar.f78253a = null;
                        gbbVar.f78254b = null;
                        gbbVar.f78255c = null;
                        break;
                    }
                }
                break;
        }
    }
}
