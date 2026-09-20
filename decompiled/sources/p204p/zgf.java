package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zgf {

    /* JADX INFO: renamed from: a */
    public final long f282624a;

    /* JADX INFO: renamed from: b */
    public final boolean f282625b;

    public zgf(long j, boolean z) {
        this.f282624a = j;
        this.f282625b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgf)) {
            return false;
        }
        zgf zgfVar = (zgf) obj;
        return this.f282624a == zgfVar.f282624a && this.f282625b == zgfVar.f282625b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f282625b) + (Long.hashCode(this.f282624a) * 31);
    }
}
