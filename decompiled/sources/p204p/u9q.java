package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u9q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jx31 f228250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w9q f228251c;

    public /* synthetic */ u9q(jx31 jx31Var, w9q w9qVar, int i) {
        this.f228249a = i;
        this.f228250b = jx31Var;
        this.f228251c = w9qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f228249a) {
            case 0:
                boolean zM31595O = c700.m31595O(2);
                jx31 jx31Var = this.f228250b;
                if (zM31595O) {
                    jx31Var.toString();
                }
                jx31Var.m54494c(this.f228251c);
                break;
            default:
                boolean zM31595O2 = c700.m31595O(2);
                jx31 jx31Var2 = this.f228250b;
                if (zM31595O2) {
                    jx31Var2.toString();
                }
                jx31Var2.m54494c(this.f228251c);
                break;
        }
    }
}
