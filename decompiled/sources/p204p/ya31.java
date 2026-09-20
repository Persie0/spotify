package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ya31 extends ax41 {

    /* JADX INFO: renamed from: c */
    public int f270768c;

    public ya31(int i, long j) {
        super(j);
        this.f270768c = i;
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: a */
    public final void mo27359a(ax41 ax41Var) {
        this.f270768c = ((ya31) ax41Var).f270768c;
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: b */
    public final ax41 mo27360b() {
        return mo27361c(ua31.m82674j().mo28818g());
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: c */
    public final ax41 mo27361c(long j) {
        return new ya31(this.f270768c, j);
    }
}
