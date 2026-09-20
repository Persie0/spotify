package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tzp0 implements uzp0 {

    /* JADX INFO: renamed from: a */
    public final long f225286a;

    public tzp0(long j) {
        this.f225286a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzp0) && this.f225286a == ((tzp0) obj).f225286a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f225286a);
    }
}
