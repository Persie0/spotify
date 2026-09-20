package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c8d1 {

    /* JADX INFO: renamed from: a */
    public final boolean f35191a;

    public c8d1(boolean z) {
        this.f35191a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8d1) && this.f35191a == ((c8d1) obj).f35191a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35191a);
    }
}
