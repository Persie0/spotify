package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hgf {

    /* JADX INFO: renamed from: a */
    public final int f91145a;

    /* JADX INFO: renamed from: b */
    public final boolean f91146b;

    public hgf(int i, boolean z) {
        this.f91145a = i;
        this.f91146b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgf)) {
            return false;
        }
        hgf hgfVar = (hgf) obj;
        return this.f91145a == hgfVar.f91145a && this.f91146b == hgfVar.f91146b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91146b) + (Integer.hashCode(this.f91145a) * 31);
    }
}
