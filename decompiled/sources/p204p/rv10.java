package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rv10 implements wv10 {

    /* JADX INFO: renamed from: a */
    public final boolean f202976a;

    public rv10(boolean z) {
        this.f202976a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv10) && this.f202976a == ((rv10) obj).f202976a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202976a);
    }
}
