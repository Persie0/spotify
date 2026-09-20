package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r761 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196454a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v761 f196455b;

    public /* synthetic */ r761(v761 v761Var, int i) {
        this.f196454a = i;
        this.f196455b = v761Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f196454a) {
            case 0:
                e95.m38211p().execute(new r761(this.f196455b, 1));
                break;
            default:
                v761 v761Var = this.f196455b;
                if (!v761Var.f238081n) {
                    v761Var.m84844d();
                }
                break;
        }
    }
}
