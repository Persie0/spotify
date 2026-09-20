package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y8k0 extends e9k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f270310a;

    public y8k0(boolean z) {
        this.f270310a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8k0) && this.f270310a == ((y8k0) obj).f270310a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270310a);
    }
}
