package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f237737a;

    /* JADX INFO: renamed from: b */
    public final mif1 f237738b = new b6o0(vc41.EVENTS);

    public v66(h66 h66Var) {
        this.f237737a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f237737a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f237738b;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: c */
    public final boolean mo24910c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v66) && this.f237737a.equals(((v66) obj).f237737a);
    }

    public final int hashCode() {
        return s571.m77245d(this.f237737a.hashCode() * 31, 31, false);
    }
}
