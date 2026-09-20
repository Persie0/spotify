package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nj01 {

    /* JADX INFO: renamed from: a */
    public final boolean f154409a;

    public nj01(boolean z) {
        this.f154409a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj01) && this.f154409a == ((nj01) obj).f154409a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154409a);
    }
}
