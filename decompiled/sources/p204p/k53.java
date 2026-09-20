package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k53 extends jh3 {

    /* JADX INFO: renamed from: b */
    public final boolean f119391b;

    public k53(boolean z) {
        this.f119391b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k53) && this.f119391b == ((k53) obj).f119391b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119391b);
    }
}
