package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n8e0 implements p8e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f151510a;

    public n8e0(boolean z) {
        this.f151510a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8e0) && this.f151510a == ((n8e0) obj).f151510a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151510a);
    }
}
