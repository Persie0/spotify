package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gxs0 {

    /* JADX INFO: renamed from: a */
    public final String f85327a;

    /* JADX INFO: renamed from: b */
    public final String f85328b;

    public gxs0(String str, String str2) {
        this.f85327a = str;
        this.f85328b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxs0)) {
            return false;
        }
        gxs0 gxs0Var = (gxs0) obj;
        return wj50.m88271j(this.f85327a, gxs0Var.f85327a) && wj50.m88271j(this.f85328b, gxs0Var.f85328b);
    }

    public final int hashCode() {
        int iHashCode = this.f85327a.hashCode() * 31;
        String str = this.f85328b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
