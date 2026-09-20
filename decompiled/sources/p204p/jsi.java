package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jsi {

    /* JADX INFO: renamed from: a */
    public final boolean f115502a;

    public jsi(boolean z) {
        this.f115502a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsi) && this.f115502a == ((jsi) obj).f115502a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115502a);
    }
}
