package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xa31 extends ax41 {

    /* JADX INFO: renamed from: c */
    public float f259547c;

    public xa31(long j, float f) {
        super(j);
        this.f259547c = f;
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: a */
    public final void mo27359a(ax41 ax41Var) {
        this.f259547c = ((xa31) ax41Var).f259547c;
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: b */
    public final ax41 mo27360b() {
        return mo27361c(ua31.m82674j().mo28818g());
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: c */
    public final ax41 mo27361c(long j) {
        return new xa31(j, this.f259547c);
    }
}
