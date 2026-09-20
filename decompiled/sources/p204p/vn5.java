package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final String f242998a;

    /* JADX INFO: renamed from: b */
    public final String f242999b;

    public vn5(String str, String str2) {
        this.f242998a = str;
        this.f242999b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn5)) {
            return false;
        }
        vn5 vn5Var = (vn5) obj;
        return wj50.m88271j(this.f242998a, vn5Var.f242998a) && wj50.m88271j(this.f242999b, vn5Var.f242999b);
    }

    public final int hashCode() {
        return this.f242999b.hashCode() + (this.f242998a.hashCode() * 31);
    }
}
