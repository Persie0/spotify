package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f99487a;

    public i7c0(boolean z) {
        this.f99487a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7c0) && this.f99487a == ((i7c0) obj).f99487a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99487a);
    }
}
