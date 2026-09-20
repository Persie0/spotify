package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class za31 extends ax41 {

    /* JADX INFO: renamed from: c */
    public long f280978c;

    public za31(long j, long j2) {
        super(j);
        this.f280978c = j2;
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: a */
    public final void mo27359a(ax41 ax41Var) {
        this.f280978c = ((za31) ax41Var).f280978c;
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: b */
    public final ax41 mo27360b() {
        return mo27361c(ua31.m82674j().mo28818g());
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: c */
    public final ax41 mo27361c(long j) {
        return new za31(j, this.f280978c);
    }
}
