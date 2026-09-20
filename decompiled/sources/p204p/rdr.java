package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rdr implements wdr {

    /* JADX INFO: renamed from: a */
    public final boolean f198195a;

    public rdr(boolean z) {
        this.f198195a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdr) && this.f198195a == ((rdr) obj).f198195a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198195a);
    }
}
