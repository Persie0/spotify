package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i7o implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final int f99597a;

    public i7o(int i) {
        this.f99597a = i;
    }

    @Override // p204p.i4t0
    public final Object get() {
        int i = this.f99597a;
        if (i == 0) {
            return new f7o();
        }
        if (i == 1) {
            return new g7o();
        }
        if (i == 2) {
            return new h7o();
        }
        throw new AssertionError(i);
    }
}
