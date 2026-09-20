package p204p;

/* JADX INFO: loaded from: classes14.dex */
public final class vlm implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final int f242555a;

    public vlm(int i) {
        this.f242555a = i;
    }

    @Override // p204p.i4t0
    public final Object get() {
        int i = this.f242555a;
        if (i == 0) {
            return new tlm();
        }
        if (i == 1) {
            return new ulm();
        }
        throw new AssertionError(i);
    }
}
