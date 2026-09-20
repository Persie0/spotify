package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rgx0 {

    /* JADX INFO: renamed from: a */
    public final long f199042a = n6f.f150871k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgx0)) {
            return false;
        }
        long j = ((rgx0) obj).f199042a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f199042a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f199042a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) n6f.m63771h(this.f199042a)) + ", rippleAlpha=null)";
    }
}
