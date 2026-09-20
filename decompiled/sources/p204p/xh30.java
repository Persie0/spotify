package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xh30 {

    /* JADX INFO: renamed from: a */
    public final String f261427a;

    /* JADX INFO: renamed from: b */
    public final String f261428b;

    public xh30(String str, String str2) {
        this.f261427a = str;
        this.f261428b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh30)) {
            return false;
        }
        xh30 xh30Var = (xh30) obj;
        return wj50.m88271j(this.f261427a, xh30Var.f261427a) && wj50.m88271j(this.f261428b, xh30Var.f261428b);
    }

    public final int hashCode() {
        return s571.m77243b(this.f261427a.hashCode() * 31, 31, this.f261428b);
    }
}
