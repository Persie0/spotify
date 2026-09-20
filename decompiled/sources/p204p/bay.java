package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bay implements gnx0 {

    /* JADX INFO: renamed from: a */
    public final fnx0 f25360a;

    public bay(Throwable th) {
        this.f25360a = new fnx0(this, th, 2);
    }

    @Override // p204p.gnx0
    /* JADX INFO: renamed from: a */
    public final avu0 mo28596a() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // p204p.gnx0
    /* JADX INFO: renamed from: c */
    public final fnx0 mo28597c() {
        return this.f25360a;
    }

    @Override // p204p.gnx0
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p204p.gnx0
    /* JADX INFO: renamed from: f */
    public final fnx0 mo28598f() {
        return this.f25360a;
    }

    @Override // p204p.gnx0
    public final boolean isReady() {
        return false;
    }

    @Override // p204p.gnx0
    /* JADX INFO: renamed from: m */
    public final gnx0 mo28599m() {
        throw new IllegalStateException("unexpected retry");
    }
}
