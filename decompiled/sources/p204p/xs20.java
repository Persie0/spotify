package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xs20 implements bt20 {

    /* JADX INFO: renamed from: a */
    public final String f265459a;

    /* JADX INFO: renamed from: b */
    public final String f265460b;

    /* JADX INFO: renamed from: c */
    public final lt20 f265461c;

    /* JADX INFO: renamed from: d */
    public final lt20 f265462d;

    public xs20(String str, String str2, lt20 lt20Var, lt20 lt20Var2) {
        this.f265459a = str;
        this.f265460b = str2;
        this.f265461c = lt20Var;
        this.f265462d = lt20Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs20)) {
            return false;
        }
        xs20 xs20Var = (xs20) obj;
        return wj50.m88271j(this.f265459a, xs20Var.f265459a) && wj50.m88271j(this.f265460b, xs20Var.f265460b) && wj50.m88271j(this.f265461c, xs20Var.f265461c) && wj50.m88271j(this.f265462d, xs20Var.f265462d);
    }

    public final int hashCode() {
        return this.f265462d.hashCode() + ((this.f265461c.hashCode() + s571.m77243b(this.f265459a.hashCode() * 31, 31, this.f265460b)) * 31);
    }
}
