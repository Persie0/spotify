package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class rne {
    public static final qne Companion = new qne();

    /* JADX INFO: renamed from: a */
    public final boolean f200903a;

    public /* synthetic */ rne(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f200903a = z;
        } else {
            edo.m38617p(i, 1, pne.f179372a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rne) && this.f200903a == ((rne) obj).f200903a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200903a);
    }
}
