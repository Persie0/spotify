package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class aad implements lad {

    /* JADX INFO: renamed from: a */
    public final pdj f13820a;

    /* JADX INFO: renamed from: b */
    public final long f13821b;

    public aad(pdj pdjVar, long j) {
        this.f13820a = pdjVar;
        this.f13821b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aad)) {
            return false;
        }
        aad aadVar = (aad) obj;
        return wj50.m88271j(this.f13820a, aadVar.f13820a) && this.f13821b == aadVar.f13821b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13821b) + (this.f13820a.hashCode() * 31);
    }
}
