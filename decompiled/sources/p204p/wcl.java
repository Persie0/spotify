package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wcl {

    /* JADX INFO: renamed from: a */
    public final String f250067a;

    /* JADX INFO: renamed from: b */
    public final long f250068b;

    /* JADX INFO: renamed from: c */
    public final long f250069c;

    public wcl(long j, String str, long j2) {
        this.f250067a = str;
        this.f250068b = j;
        this.f250069c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcl)) {
            return false;
        }
        wcl wclVar = (wcl) obj;
        return wj50.m88271j(this.f250067a, wclVar.f250067a) && this.f250068b == wclVar.f250068b && this.f250069c == wclVar.f250069c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f250069c) + dq60.m36605e(this.f250067a.hashCode() * 31, this.f250068b, 31);
    }
}
