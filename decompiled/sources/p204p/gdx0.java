package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gdx0 implements gnx0 {

    /* JADX INFO: renamed from: a */
    public final avu0 f78963a;

    public gdx0(avu0 avu0Var) {
        this.f78963a = avu0Var;
    }

    @Override // p204p.gnx0
    /* JADX INFO: renamed from: a */
    public final avu0 mo28596a() {
        return this.f78963a;
    }

    @Override // p204p.gnx0
    /* JADX INFO: renamed from: c */
    public final fnx0 mo28597c() {
        throw new IllegalStateException("already connected");
    }

    @Override // p204p.gnx0
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p204p.gnx0
    /* JADX INFO: renamed from: f */
    public final fnx0 mo28598f() {
        throw new IllegalStateException("already connected");
    }

    @Override // p204p.gnx0
    public final boolean isReady() {
        return true;
    }

    @Override // p204p.gnx0
    /* JADX INFO: renamed from: m */
    public final gnx0 mo28599m() {
        throw new IllegalStateException("unexpected retry");
    }
}
