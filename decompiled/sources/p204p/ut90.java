package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ut90 extends yt90 implements fz90 {

    /* JADX INFO: renamed from: b */
    public final ds90 f233853b;

    public ut90(ds90 ds90Var) {
        super(is90.f105195c);
        this.f233853b = ds90Var;
    }

    @Override // p204p.fz90
    /* JADX INFO: renamed from: b */
    public final wt90 mo43183b(long j, boolean z, boolean z2) {
        ds90 ds90Var = this.f233853b;
        return new wt90(new fs90(ds90Var.f52521a, j, true, ds90Var.f52522b, ds90Var.f52523c, z, z2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ut90) && this.f233853b.equals(((ut90) obj).f233853b);
    }

    public final int hashCode() {
        return this.f233853b.hashCode() + (is90.f105195c.hashCode() * 31);
    }

    @Override // p204p.fz90
    /* JADX INFO: renamed from: a */
    public final ut90 mo43182a() {
        return this;
    }
}
