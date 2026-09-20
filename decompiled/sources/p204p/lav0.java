package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lav0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mav0 f131432b;

    public /* synthetic */ lav0(mav0 mav0Var, int i) {
        this.f131431a = i;
        this.f131432b = mav0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f131431a) {
            case 0:
                this.f131432b.f141698l.onNext(eav0.f57734a);
                break;
            default:
                this.f131432b.f141698l.onNext(eav0.f57734a);
                break;
        }
    }
}
