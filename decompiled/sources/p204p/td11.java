package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class td11 {

    /* JADX INFO: renamed from: a */
    public final String f219208a;

    /* JADX INFO: renamed from: b */
    public final String f219209b;

    /* JADX INFO: renamed from: c */
    public final gvd f219210c;

    /* JADX INFO: renamed from: d */
    public final long f219211d;

    public td11(String str, String str2, gvd gvdVar, long j) {
        this.f219208a = str;
        this.f219209b = str2;
        this.f219210c = gvdVar;
        this.f219211d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td11)) {
            return false;
        }
        td11 td11Var = (td11) obj;
        return wj50.m88271j(this.f219208a, td11Var.f219208a) && wj50.m88271j(this.f219209b, td11Var.f219209b) && this.f219210c == td11Var.f219210c && this.f219211d == td11Var.f219211d;
    }

    public final int hashCode() {
        int iHashCode = this.f219208a.hashCode() * 31;
        String str = this.f219209b;
        return Long.hashCode(this.f219211d) + ((this.f219210c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
