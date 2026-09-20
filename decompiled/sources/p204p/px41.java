package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class px41 extends ax41 {

    /* JADX INFO: renamed from: c */
    public yrn0 f182204c;

    /* JADX INFO: renamed from: d */
    public int f182205d;

    public px41(long j, yrn0 yrn0Var) {
        super(j);
        this.f182204c = yrn0Var;
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: a */
    public final void mo27359a(ax41 ax41Var) {
        synchronized (u9g1.f228194a) {
            this.f182204c = ((px41) ax41Var).f182204c;
            this.f182205d = ((px41) ax41Var).f182205d;
        }
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: b */
    public final ax41 mo27360b() {
        return new px41(ua31.m82674j().mo28818g(), this.f182204c);
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: c */
    public final ax41 mo27361c(long j) {
        return new px41(j, this.f182204c);
    }
}
