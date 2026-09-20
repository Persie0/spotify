package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mci0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f142166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f142167c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wxb1 f142168d;

    public /* synthetic */ mci0(wxb1 wxb1Var, long j, boolean z, int i) {
        this.f142165a = i;
        this.f142168d = wxb1Var;
        this.f142166b = j;
        this.f142167c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142165a) {
            case 0:
                ((pci0) ((wgb0) this.f142168d).f251018b).f176119e.mo40872b(this.f142166b, this.f142167c);
                break;
            default:
                ((ze21) ((tn20) this.f142168d).f221865b).f281859d.mo40872b(this.f142166b, this.f142167c);
                break;
        }
    }
}
