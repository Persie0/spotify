package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kci0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f121494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wxb1 f121495c;

    public /* synthetic */ kci0(wxb1 wxb1Var, float f, int i) {
        this.f121493a = i;
        this.f121495c = wxb1Var;
        this.f121494b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f121493a) {
            case 0:
                ((pci0) ((wgb0) this.f121495c).f251018b).f176119e.mo40875e(this.f121494b);
                break;
            default:
                ((ze21) ((tn20) this.f121495c).f221865b).f281859d.mo40875e(this.f121494b);
                break;
        }
    }
}
