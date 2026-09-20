package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qgx0 {

    /* JADX INFO: renamed from: a */
    public final long f188578a = n6f.f150871k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgx0)) {
            return false;
        }
        long j = ((qgx0) obj).f188578a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f188578a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f188578a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) n6f.m63771h(this.f188578a)) + ", rippleAlpha=null)";
    }
}
