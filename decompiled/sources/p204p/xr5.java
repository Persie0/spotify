package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xr5 {

    /* JADX INFO: renamed from: a */
    public final String f265265a;

    /* JADX INFO: renamed from: b */
    public final String f265266b;

    public xr5(String str, String str2) {
        this.f265265a = str;
        this.f265266b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr5)) {
            return false;
        }
        xr5 xr5Var = (xr5) obj;
        return wj50.m88271j(this.f265265a, xr5Var.f265265a) && wj50.m88271j(this.f265266b, xr5Var.f265266b);
    }

    public final int hashCode() {
        return this.f265266b.hashCode() + (this.f265265a.hashCode() * 31);
    }
}
