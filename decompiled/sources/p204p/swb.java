package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class swb {

    /* JADX INFO: renamed from: a */
    public final String f214634a;

    /* JADX INFO: renamed from: b */
    public final String f214635b;

    /* JADX INFO: renamed from: c */
    public final long f214636c;

    /* JADX INFO: renamed from: d */
    public final boolean f214637d;

    public swb(String str, String str2, long j, boolean z) {
        this.f214634a = str;
        this.f214635b = str2;
        this.f214636c = j;
        this.f214637d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swb)) {
            return false;
        }
        swb swbVar = (swb) obj;
        return wj50.m88271j(this.f214634a, swbVar.f214634a) && wj50.m88271j(this.f214635b, swbVar.f214635b) && this.f214636c == swbVar.f214636c && this.f214637d == swbVar.f214637d;
    }

    public final int hashCode() {
        int iHashCode = this.f214634a.hashCode() * 31;
        String str = this.f214635b;
        return Boolean.hashCode(this.f214637d) + dq60.m36605e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f214636c, 31);
    }
}
