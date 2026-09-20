package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s7p0 {

    /* JADX INFO: renamed from: a */
    public final String f206454a;

    /* JADX INFO: renamed from: b */
    public final String f206455b;

    public s7p0(String str, String str2) {
        this.f206454a = str;
        this.f206455b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7p0)) {
            return false;
        }
        s7p0 s7p0Var = (s7p0) obj;
        return wj50.m88271j(this.f206454a, s7p0Var.f206454a) && wj50.m88271j(this.f206455b, s7p0Var.f206455b);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(314191745, 31, this.f206454a);
        String str = this.f206455b;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
