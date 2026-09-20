package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cks0 implements iks0 {

    /* JADX INFO: renamed from: a */
    public final boolean f39084a;

    public cks0(boolean z) {
        this.f39084a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cks0) && this.f39084a == ((cks0) obj).f39084a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39084a);
    }
}
