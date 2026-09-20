package p204p;

/* JADX INFO: loaded from: classes6.dex */
@rtz0
public final class h0u {
    public static final g0u Companion = new g0u();

    /* JADX INFO: renamed from: a */
    public final String f86354a;

    /* JADX INFO: renamed from: b */
    public final String f86355b;

    public /* synthetic */ h0u(int i, String str, String str2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, f0u.f64714a.getDescriptor());
            throw null;
        }
        this.f86354a = str;
        this.f86355b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0u)) {
            return false;
        }
        h0u h0uVar = (h0u) obj;
        return wj50.m88271j(this.f86354a, h0uVar.f86354a) && wj50.m88271j(this.f86355b, h0uVar.f86355b);
    }

    public final int hashCode() {
        return this.f86355b.hashCode() + (this.f86354a.hashCode() * 31);
    }
}
