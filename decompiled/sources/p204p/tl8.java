package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tl8 {

    /* JADX INFO: renamed from: a */
    public final String f221385a;

    /* JADX INFO: renamed from: b */
    public final long f221386b;

    public tl8(String str, long j) {
        this.f221385a = str;
        this.f221386b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl8)) {
            return false;
        }
        tl8 tl8Var = (tl8) obj;
        if (!this.f221385a.equals(tl8Var.f221385a)) {
            return false;
        }
        long j = tl8Var.f221386b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f221386b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f221385a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f221386b) + iHashCode;
    }
}
