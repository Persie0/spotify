package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wsc0 {

    /* JADX INFO: renamed from: a */
    public final String f254585a;

    /* JADX INFO: renamed from: b */
    public final String f254586b;

    /* JADX INFO: renamed from: c */
    public final boolean f254587c;

    /* JADX INFO: renamed from: d */
    public final boolean f254588d;

    /* JADX INFO: renamed from: e */
    public final gtc0 f254589e;

    public wsc0(String str, String str2, boolean z, boolean z2, gtc0 gtc0Var) {
        this.f254585a = str;
        this.f254586b = str2;
        this.f254587c = z;
        this.f254588d = z2;
        this.f254589e = gtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsc0)) {
            return false;
        }
        wsc0 wsc0Var = (wsc0) obj;
        return wj50.m88271j(this.f254585a, wsc0Var.f254585a) && wj50.m88271j(this.f254586b, wsc0Var.f254586b) && this.f254587c == wsc0Var.f254587c && this.f254588d == wsc0Var.f254588d && wj50.m88271j(this.f254589e, wsc0Var.f254589e);
    }

    public final int hashCode() {
        int iHashCode = this.f254585a.hashCode() * 31;
        String str = this.f254586b;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f254587c), 31, this.f254588d);
        gtc0 gtc0Var = this.f254589e;
        return iM77245d + (gtc0Var != null ? gtc0Var.hashCode() : 0);
    }
}
