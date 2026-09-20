package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wt90 extends yt90 implements fz90 {

    /* JADX INFO: renamed from: b */
    public final fs90 f254889b;

    public wt90(fs90 fs90Var) {
        super(is90.f105194b);
        this.f254889b = fs90Var;
    }

    @Override // p204p.fz90
    /* JADX INFO: renamed from: a */
    public final ut90 mo43182a() {
        fs90 fs90Var = this.f254889b;
        return new ut90(new ds90(fs90Var.f72808a, fs90Var.f72811d, fs90Var.f72812e));
    }

    @Override // p204p.fz90
    /* JADX INFO: renamed from: b */
    public final wt90 mo43183b(long j, boolean z, boolean z2) {
        fs90 fs90Var = this.f254889b;
        return new wt90(new fs90(fs90Var.f72808a, j, true, fs90Var.f72811d, fs90Var.f72812e, z, z2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt90) && this.f254889b.equals(((wt90) obj).f254889b);
    }

    public final int hashCode() {
        return this.f254889b.hashCode() + (is90.f105194b.hashCode() * 31);
    }
}
