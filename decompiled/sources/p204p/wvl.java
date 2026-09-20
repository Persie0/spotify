package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wvl {

    /* JADX INFO: renamed from: a */
    public final boolean f255522a;

    /* JADX INFO: renamed from: b */
    public final int f255523b;

    public wvl(boolean z, int i) {
        this.f255522a = z;
        this.f255523b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvl)) {
            return false;
        }
        wvl wvlVar = (wvl) obj;
        return this.f255522a == wvlVar.f255522a && this.f255523b == wvlVar.f255523b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f255523b) + (Boolean.hashCode(this.f255522a) * 31);
    }
}
