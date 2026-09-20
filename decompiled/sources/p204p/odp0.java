package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class odp0 extends qp71 {

    /* JADX INFO: renamed from: j */
    public static final Object f164230j = new Object();

    /* JADX INFO: renamed from: e */
    public final ufd0 f164231e;

    /* JADX INFO: renamed from: f */
    public final boolean f164232f;

    /* JADX INFO: renamed from: g */
    public final boolean f164233g;

    /* JADX INFO: renamed from: h */
    public final nfd0 f164234h;

    /* JADX INFO: renamed from: i */
    public final long f164235i;

    public odp0(pdp0 pdp0Var) {
        this.f164231e = pdp0Var.mo43911v();
        this.f164232f = pdp0Var.mo43844K0();
        this.f164233g = pdp0Var.mo43870Z();
        this.f164234h = pdp0Var.mo43874a1() ? nfd0.f153322f : null;
        this.f164235i = h0b1.m46295W(pdp0Var.mo43906s0());
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: b */
    public final int mo26650b(Object obj) {
        return f164230j.equals(obj) ? 0 : -1;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: f */
    public final bp71 mo26651f(int i, bp71 bp71Var, boolean z) {
        kt0 kt0Var = kt0.f126088f;
        Object obj = f164230j;
        bp71Var.m30112i(obj, obj, 0, this.f164235i, 0L, kt0Var, false);
        return bp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: h */
    public final int mo26652h() {
        return 1;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: l */
    public final Object mo26653l(int i) {
        return f164230j;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: n */
    public final mp71 mo26654n(int i, mp71 mp71Var, long j) {
        mp71Var.m62447d(f164230j, this.f164231e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f164232f, this.f164233g, this.f164234h, 0L, this.f164235i, 0, 0, 0L);
        mp71Var.f145936k = false;
        return mp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: o */
    public final int mo26655o() {
        return 1;
    }
}
