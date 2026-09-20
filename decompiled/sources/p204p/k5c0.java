package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k5c0 extends n5c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f119473a;

    public k5c0(boolean z) {
        this.f119473a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5c0) && this.f119473a == ((k5c0) obj).f119473a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119473a);
    }
}
