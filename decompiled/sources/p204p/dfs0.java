package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dfs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f48644a;

    /* JADX INFO: renamed from: b */
    public final String f48645b;

    /* JADX INFO: renamed from: c */
    public final long f48646c;

    /* JADX INFO: renamed from: d */
    public final long f48647d;

    public dfs0(String str, long j, long j2, String str2) {
        this.f48644a = str;
        this.f48645b = str2;
        this.f48646c = j;
        this.f48647d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfs0)) {
            return false;
        }
        dfs0 dfs0Var = (dfs0) obj;
        return wj50.m88271j(this.f48644a, dfs0Var.f48644a) && wj50.m88271j(this.f48645b, dfs0Var.f48645b) && this.f48646c == dfs0Var.f48646c && this.f48647d == dfs0Var.f48647d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f48647d) + dq60.m36605e(s571.m77243b(this.f48644a.hashCode() * 31, 31, this.f48645b), this.f48646c, 31);
    }
}
