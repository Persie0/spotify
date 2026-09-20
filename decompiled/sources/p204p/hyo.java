package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hyo {

    /* JADX INFO: renamed from: a */
    public final String f96622a;

    /* JADX INFO: renamed from: b */
    public final long f96623b;

    public hyo(String str, long j) {
        this.f96622a = str;
        this.f96623b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyo)) {
            return false;
        }
        hyo hyoVar = (hyo) obj;
        return wj50.m88271j(this.f96622a, hyoVar.f96622a) && this.f96623b == hyoVar.f96623b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f96623b) + (this.f96622a.hashCode() * 31);
    }
}
