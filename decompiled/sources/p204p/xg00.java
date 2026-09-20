package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xg00 {

    /* JADX INFO: renamed from: a */
    public final String f261168a;

    /* JADX INFO: renamed from: b */
    public final boolean f261169b;

    public xg00(String str, boolean z) {
        this.f261168a = str;
        this.f261169b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg00)) {
            return false;
        }
        xg00 xg00Var = (xg00) obj;
        return wj50.m88271j(this.f261168a, xg00Var.f261168a) && this.f261169b == xg00Var.f261169b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261169b) + (this.f261168a.hashCode() * 31);
    }
}
