package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u3z0 extends w3z0 {

    /* JADX INFO: renamed from: d */
    public final boolean f226491d;

    public u3z0(boolean z) {
        this.f226491d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3z0) && this.f226491d == ((u3z0) obj).f226491d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f226491d);
    }
}
