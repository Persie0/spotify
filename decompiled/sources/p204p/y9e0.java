package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y9e0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f270580a;

    public y9e0(boolean z) {
        this.f270580a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9e0) && this.f270580a == ((y9e0) obj).f270580a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270580a);
    }
}
