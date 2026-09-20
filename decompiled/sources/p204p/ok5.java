package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ok5 implements qk5 {

    /* JADX INFO: renamed from: a */
    public final s7j0 f166275a;

    /* JADX INFO: renamed from: b */
    public final String f166276b;

    public ok5(s7j0 s7j0Var, String str) {
        this.f166275a = s7j0Var;
        this.f166276b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok5)) {
            return false;
        }
        ok5 ok5Var = (ok5) obj;
        return wj50.m88271j(this.f166275a, ok5Var.f166275a) && wj50.m88271j(this.f166276b, ok5Var.f166276b);
    }

    public final int hashCode() {
        int iHashCode = this.f166275a.hashCode() * 31;
        String str = this.f166276b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
