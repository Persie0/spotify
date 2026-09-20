package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p9u implements in40 {

    /* JADX INFO: renamed from: a */
    public final boolean f175303a;

    public p9u(boolean z) {
        this.f175303a = z;
    }

    @Override // p204p.in40
    /* JADX INFO: renamed from: b */
    public final dnj0 mo36480b() {
        return null;
    }

    @Override // p204p.in40
    public final boolean isActive() {
        return this.f175303a;
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("Empty{"), this.f175303a ? "Active" : "New", '}');
    }
}
