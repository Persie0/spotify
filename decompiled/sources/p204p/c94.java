package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c94 {

    /* JADX INFO: renamed from: a */
    public final boolean f35395a;

    public c94(boolean z) {
        this.f35395a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c94) && this.f35395a == ((c94) obj).f35395a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35395a);
    }
}
