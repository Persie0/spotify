package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ncc0 extends hqg1 {

    /* JADX INFO: renamed from: c */
    public final boolean f152491c;

    public ncc0(boolean z) {
        this.f152491c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncc0) && this.f152491c == ((ncc0) obj).f152491c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152491c);
    }
}
