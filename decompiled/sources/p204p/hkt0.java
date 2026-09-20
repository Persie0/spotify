package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hkt0 implements jkt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f92522a;

    public hkt0(boolean z) {
        this.f92522a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkt0) && this.f92522a == ((hkt0) obj).f92522a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92522a);
    }
}
