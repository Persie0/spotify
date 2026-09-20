package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fi51 {

    /* JADX INFO: renamed from: a */
    public final String f69795a;

    /* JADX INFO: renamed from: b */
    public final int f69796b;

    /* JADX INFO: renamed from: c */
    public final ei51 f69797c;

    public fi51(String str, int i, ei51 ei51Var) {
        this.f69795a = str;
        this.f69796b = i;
        this.f69797c = ei51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi51)) {
            return false;
        }
        fi51 fi51Var = (fi51) obj;
        return wj50.m88271j(this.f69795a, fi51Var.f69795a) && this.f69796b == fi51Var.f69796b && this.f69797c == fi51Var.f69797c;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f69796b, this.f69795a.hashCode() * 31, 31);
        ei51 ei51Var = this.f69797c;
        return iM40938f + (ei51Var == null ? 0 : ei51Var.hashCode());
    }
}
