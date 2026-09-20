package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wam0 {

    /* JADX INFO: renamed from: a */
    public final String f249550a;

    /* JADX INFO: renamed from: b */
    public final String f249551b;

    public wam0(String str, String str2) {
        this.f249550a = str;
        this.f249551b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wam0)) {
            return false;
        }
        wam0 wam0Var = (wam0) obj;
        return wj50.m88271j(this.f249550a, wam0Var.f249550a) && wj50.m88271j(this.f249551b, wam0Var.f249551b);
    }

    public final int hashCode() {
        return s571.m77243b(this.f249550a.hashCode() * 31, 961, this.f249551b);
    }
}
