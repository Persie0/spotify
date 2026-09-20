package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jwp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f116669a;

    public jwp0(boolean z) {
        this.f116669a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwp0) && this.f116669a == ((jwp0) obj).f116669a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116669a);
    }
}
