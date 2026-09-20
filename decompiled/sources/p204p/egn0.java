package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class egn0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59365a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fgn0 f59366b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f59367c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f59368d;

    public /* synthetic */ egn0(fgn0 fgn0Var, String str, String str2, int i) {
        this.f59365a = i;
        this.f59366b = fgn0Var;
        this.f59367c = str;
        this.f59368d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59365a) {
            case 0:
                this.f59366b.f69374a.mo74683a(this.f59367c, this.f59368d);
                break;
            default:
                this.f59366b.f69374a.mo74689g(this.f59367c, this.f59368d);
                break;
        }
    }
}
