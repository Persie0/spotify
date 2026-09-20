package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q091 {

    /* JADX INFO: renamed from: a */
    public final String f183931a;

    /* JADX INFO: renamed from: b */
    public final String f183932b;

    /* JADX INFO: renamed from: c */
    public final long f183933c;

    public q091(String str, String str2, long j) {
        this.f183931a = str;
        this.f183932b = str2;
        this.f183933c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q091)) {
            return false;
        }
        q091 q091Var = (q091) obj;
        return wj50.m88271j(this.f183931a, q091Var.f183931a) && wj50.m88271j(this.f183932b, q091Var.f183932b) && this.f183933c == q091Var.f183933c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f183933c) + s571.m77243b(this.f183931a.hashCode() * 31, 31, this.f183932b);
    }
}
