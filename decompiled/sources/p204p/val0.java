package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class val0 {

    /* JADX INFO: renamed from: a */
    public final boolean f239298a;

    public val0(boolean z) {
        this.f239298a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof val0) && this.f239298a == ((val0) obj).f239298a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239298a);
    }
}
