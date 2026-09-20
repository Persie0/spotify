package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vkq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wkq f242275b;

    public /* synthetic */ vkq(wkq wkqVar, int i) {
        this.f242274a = i;
        this.f242275b = wkqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f242274a) {
            case 0:
                wkq.m88366a(this.f242275b);
                break;
            default:
                wkq.m88367b(this.f242275b);
                break;
        }
    }
}
