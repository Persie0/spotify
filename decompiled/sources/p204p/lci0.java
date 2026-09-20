package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lci0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f131940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f131941c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f131942d;

    public /* synthetic */ lci0(Object obj, int i, int i2, int i3) {
        this.f131939a = i3;
        this.f131942d = obj;
        this.f131940b = i;
        this.f131941c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.f131939a) {
            case 0:
                ((pci0) ((wgb0) this.f131942d).f251018b).f176119e.mo40874d(this.f131940b, this.f131941c);
                break;
            case 1:
                ((ze21) ((tn20) this.f131942d).f221865b).f281859d.mo40874d(this.f131940b, this.f131941c);
                break;
            default:
                v761 v761Var = (v761) this.f131942d;
                int i = v761Var.f238076i;
                int i2 = this.f131940b;
                boolean z2 = true;
                if (i != i2) {
                    v761Var.f238076i = i2;
                    z = true;
                } else {
                    z = false;
                }
                int i3 = v761Var.f238075h;
                int i4 = this.f131941c;
                if (i3 != i4) {
                    v761Var.f238075h = i4;
                } else {
                    z2 = z;
                }
                if (z2) {
                    v761Var.m84845e();
                }
                break;
        }
    }
}
