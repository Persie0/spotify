package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pfc0 implements sfc0 {

    /* JADX INFO: renamed from: a */
    public final String f177029a;

    /* JADX INFO: renamed from: b */
    public final long f177030b;

    public pfc0(String str, long j) {
        this.f177029a = str;
        this.f177030b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfc0)) {
            return false;
        }
        pfc0 pfc0Var = (pfc0) obj;
        if (!wj50.m88271j(this.f177029a, pfc0Var.f177029a)) {
            return false;
        }
        long j = pfc0Var.f177030b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f177030b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f177029a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f177030b) + iHashCode;
    }
}
