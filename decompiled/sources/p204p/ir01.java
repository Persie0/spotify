package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ir01 {

    /* JADX INFO: renamed from: a */
    public final boolean f104879a;

    public ir01(boolean z) {
        this.f104879a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir01) && this.f104879a == ((ir01) obj).f104879a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104879a);
    }
}
