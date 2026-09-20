package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bf01 implements if01 {

    /* JADX INFO: renamed from: a */
    public final boolean f26511a;

    public bf01(boolean z) {
        this.f26511a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf01) && this.f26511a == ((bf01) obj).f26511a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26511a);
    }
}
