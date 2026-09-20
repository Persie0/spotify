package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jr20 implements lr20 {

    /* JADX INFO: renamed from: a */
    public final boolean f115057a;

    public jr20(boolean z) {
        this.f115057a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jr20) && this.f115057a == ((jr20) obj).f115057a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115057a);
    }
}
