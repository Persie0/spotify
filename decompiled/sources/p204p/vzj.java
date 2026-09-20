package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vzj implements xzj {

    /* JADX INFO: renamed from: a */
    public final boolean f246473a;

    public vzj(boolean z) {
        this.f246473a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzj) && this.f246473a == ((vzj) obj).f246473a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246473a);
    }
}
