package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h6u0 {

    /* JADX INFO: renamed from: a */
    public final String f88256a;

    /* JADX INFO: renamed from: b */
    public final int f88257b;

    /* JADX INFO: renamed from: c */
    public final long f88258c;

    public h6u0(long j, int i, String str) {
        this.f88256a = str;
        this.f88257b = i;
        this.f88258c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6u0)) {
            return false;
        }
        h6u0 h6u0Var = (h6u0) obj;
        return wj50.m88271j(this.f88256a, h6u0Var.f88256a) && this.f88257b == h6u0Var.f88257b && this.f88258c == h6u0Var.f88258c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88258c) + mt60.m62800g(this.f88257b, this.f88256a.hashCode() * 31, 31);
    }
}
