package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sjy implements yjy {

    /* JADX INFO: renamed from: a */
    public final String f209945a;

    /* JADX INFO: renamed from: b */
    public final pqy f209946b;

    /* JADX INFO: renamed from: c */
    public final boolean f209947c;

    public sjy(String str, pqy pqyVar, boolean z) {
        this.f209945a = str;
        this.f209946b = pqyVar;
        this.f209947c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjy)) {
            return false;
        }
        sjy sjyVar = (sjy) obj;
        return wj50.m88271j(this.f209945a, sjyVar.f209945a) && this.f209946b == sjyVar.f209946b && this.f209947c == sjyVar.f209947c;
    }

    public final int hashCode() {
        int iHashCode = this.f209945a.hashCode() * 31;
        pqy pqyVar = this.f209946b;
        return Boolean.hashCode(this.f209947c) + ((iHashCode + (pqyVar == null ? 0 : pqyVar.hashCode())) * 31);
    }
}
