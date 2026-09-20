package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class ng90 {
    public static final mg90 Companion = new mg90();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f153599b = {q3d0.m72078I(2, is80.f105165S0)};

    /* JADX INFO: renamed from: a */
    public final pg90 f153600a;

    public /* synthetic */ ng90(int i, pg90 pg90Var) {
        if (1 == (i & 1)) {
            this.f153600a = pg90Var;
        } else {
            edo.m38617p(i, 1, lg90.f133177a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng90) && this.f153600a == ((ng90) obj).f153600a;
    }

    public final int hashCode() {
        return this.f153600a.hashCode();
    }
}
