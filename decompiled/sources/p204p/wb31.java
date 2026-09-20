package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wb31 {

    /* JADX INFO: renamed from: a */
    public final String f249684a;

    /* JADX INFO: renamed from: b */
    public final String f249685b;

    /* JADX INFO: renamed from: c */
    public final boolean f249686c;

    public wb31(String str, String str2, boolean z) {
        this.f249684a = str;
        this.f249685b = str2;
        this.f249686c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb31)) {
            return false;
        }
        wb31 wb31Var = (wb31) obj;
        return wj50.m88271j(this.f249684a, wb31Var.f249684a) && wj50.m88271j(this.f249685b, wb31Var.f249685b) && this.f249686c == wb31Var.f249686c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249686c) + s571.m77243b(this.f249684a.hashCode() * 31, 31, this.f249685b);
    }
}
