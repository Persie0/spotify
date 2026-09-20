package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tec0 implements wec0 {

    /* JADX INFO: renamed from: a */
    public final String f219671a;

    /* JADX INFO: renamed from: b */
    public final long f219672b;

    public tec0(String str, long j) {
        this.f219671a = str;
        this.f219672b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tec0)) {
            return false;
        }
        tec0 tec0Var = (tec0) obj;
        if (!wj50.m88271j(this.f219671a, tec0Var.f219671a)) {
            return false;
        }
        long j = tec0Var.f219672b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f219672b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f219671a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f219672b) + iHashCode;
    }
}
