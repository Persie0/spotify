package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t0x implements y2x {

    /* JADX INFO: renamed from: a */
    public final l580 f216018a;

    /* JADX INFO: renamed from: b */
    public final boolean f216019b;

    public t0x(l580 l580Var, boolean z) {
        this.f216018a = l580Var;
        this.f216019b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0x)) {
            return false;
        }
        t0x t0xVar = (t0x) obj;
        return wj50.m88271j(this.f216018a, t0xVar.f216018a) && this.f216019b == t0xVar.f216019b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216019b) + (this.f216018a.hashCode() * 31);
    }
}
