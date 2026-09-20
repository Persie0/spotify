package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t8z0 {

    /* JADX INFO: renamed from: a */
    public final String f218158a;

    /* JADX INFO: renamed from: b */
    public final String f218159b;

    /* JADX INFO: renamed from: c */
    public final String f218160c;

    public t8z0(String str, String str2, String str3) {
        this.f218158a = str;
        this.f218159b = str2;
        this.f218160c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8z0)) {
            return false;
        }
        t8z0 t8z0Var = (t8z0) obj;
        return wj50.m88271j(this.f218158a, t8z0Var.f218158a) && wj50.m88271j(this.f218159b, t8z0Var.f218159b) && wj50.m88271j(this.f218160c, t8z0Var.f218160c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f218158a.hashCode() * 31, 31, this.f218159b);
        String str = this.f218160c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
