package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yw51 implements ax51 {

    /* JADX INFO: renamed from: a */
    public final String f276868a;

    /* JADX INFO: renamed from: b */
    public final int f276869b;

    /* JADX INFO: renamed from: c */
    public final String f276870c;

    public yw51(String str, int i, String str2) {
        this.f276868a = str;
        this.f276869b = i;
        this.f276870c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw51)) {
            return false;
        }
        yw51 yw51Var = (yw51) obj;
        return wj50.m88271j(this.f276868a, yw51Var.f276868a) && this.f276869b == yw51Var.f276869b && wj50.m88271j(this.f276870c, yw51Var.f276870c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f276869b, this.f276868a.hashCode() * 31, 31);
        String str = this.f276870c;
        return iM40938f + (str == null ? 0 : str.hashCode());
    }
}
