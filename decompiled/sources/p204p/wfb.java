package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wfb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xfb f250783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f250784c;

    public /* synthetic */ wfb(xfb xfbVar, String str, int i) {
        this.f250782a = i;
        this.f250783b = xfbVar;
        this.f250784c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f250782a) {
            case 0:
                this.f250783b.f260890b.onCameraAvailable(this.f250784c);
                break;
            default:
                this.f250783b.f260890b.onCameraUnavailable(this.f250784c);
                break;
        }
    }
}
