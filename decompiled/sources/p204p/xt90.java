package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xt90 extends yt90 implements fz90 {

    /* JADX INFO: renamed from: b */
    public final hs90 f265803b;

    public xt90(hs90 hs90Var) {
        super(is90.f105193a);
        this.f265803b = hs90Var;
    }

    @Override // p204p.fz90
    /* JADX INFO: renamed from: a */
    public final ut90 mo43182a() {
        hs90 hs90Var = this.f265803b;
        return new ut90(new ds90(hs90Var.f94635a, hs90Var.f94637c, hs90Var.f94638d));
    }

    @Override // p204p.fz90
    /* JADX INFO: renamed from: b */
    public final wt90 mo43183b(long j, boolean z, boolean z2) {
        hs90 hs90Var = this.f265803b;
        return new wt90(new fs90(hs90Var.f94635a, j, true, hs90Var.f94637c, hs90Var.f94638d, z, z2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt90) && this.f265803b.equals(((xt90) obj).f265803b);
    }

    public final int hashCode() {
        return this.f265803b.hashCode() + (is90.f105193a.hashCode() * 31);
    }
}
