package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wv00 implements xv00 {

    /* JADX INFO: renamed from: a */
    public final boolean f255309a;

    public wv00(boolean z) {
        this.f255309a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wv00) && this.f255309a == ((wv00) obj).f255309a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255309a);
    }
}
