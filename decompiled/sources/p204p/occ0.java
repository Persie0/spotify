package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class occ0 extends hqg1 {

    /* JADX INFO: renamed from: c */
    public final boolean f163896c;

    public occ0(boolean z) {
        this.f163896c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof occ0) && this.f163896c == ((occ0) obj).f163896c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163896c);
    }
}
