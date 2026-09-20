package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b7u implements w6u {

    /* JADX INFO: renamed from: b */
    public ta40 f24388b;

    /* JADX INFO: renamed from: c */
    public iw71 f24389c;

    /* JADX INFO: renamed from: a */
    public qe10 f24387a = oe10.f164317a;

    /* JADX INFO: renamed from: d */
    public int f24390d = 1;

    @Override // p204p.w6u
    /* JADX INFO: renamed from: a */
    public final w6u mo24995a() {
        b7u b7uVar = new b7u();
        b7uVar.f24387a = this.f24387a;
        b7uVar.f24388b = this.f24388b;
        b7uVar.f24389c = this.f24389c;
        b7uVar.f24390d = this.f24390d;
        return b7uVar;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: b */
    public final qe10 mo24996b() {
        return this.f24387a;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: c */
    public final void mo24997c(qe10 qe10Var) {
        this.f24387a = qe10Var;
    }

    /* JADX INFO: renamed from: d */
    public final iw71 m28401d() {
        return this.f24389c;
    }

    /* JADX INFO: renamed from: e */
    public final int m28402e() {
        return this.f24390d;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f24387a + ", provider=" + this.f24388b + ", colorFilterParams=" + this.f24389c + ", contentScale=" + ((Object) luj.m60019c(this.f24390d)) + ')';
    }
}
