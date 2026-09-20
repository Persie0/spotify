package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ut81 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233843a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wt81 f233844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f233845c;

    public /* synthetic */ ut81(wt81 wt81Var, int i, int i2) {
        this.f233843a = i2;
        this.f233844b = wt81Var;
        this.f233845c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f233843a) {
            case 0:
                this.f233844b.m47713i(this.f233845c);
                break;
            case 1:
                this.f233844b.f92278a.m50841e(this.f233845c, 1);
                break;
            default:
                this.f233844b.f92278a.m50842f(this.f233845c, 1);
                break;
        }
    }
}
