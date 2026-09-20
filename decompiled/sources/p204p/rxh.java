package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rxh {

    /* JADX INFO: renamed from: a */
    public final String f203599a;

    /* JADX INFO: renamed from: b */
    public final long f203600b;

    public rxh(String str, long j) {
        this.f203599a = str;
        this.f203600b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxh)) {
            return false;
        }
        rxh rxhVar = (rxh) obj;
        return wj50.m88271j(this.f203599a, rxhVar.f203599a) && this.f203600b == rxhVar.f203600b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f203600b) + (this.f203599a.hashCode() * 31);
    }
}
