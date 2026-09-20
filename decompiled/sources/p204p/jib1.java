package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jib1 implements nib1 {

    /* JADX INFO: renamed from: a */
    public final boolean f112716a;

    public jib1(boolean z) {
        this.f112716a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jib1) && this.f112716a == ((jib1) obj).f112716a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112716a);
    }
}
