package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gl50 {

    /* JADX INFO: renamed from: a */
    public final String f80997a;

    /* JADX INFO: renamed from: b */
    public final String f80998b;

    /* JADX INFO: renamed from: c */
    public final String f80999c;

    /* JADX INFO: renamed from: d */
    public final String f81000d;

    public gl50(String str, String str2, String str3, String str4) {
        this.f80997a = str;
        this.f80998b = str2;
        this.f80999c = str3;
        this.f81000d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl50)) {
            return false;
        }
        gl50 gl50Var = (gl50) obj;
        return wj50.m88271j(this.f80997a, gl50Var.f80997a) && wj50.m88271j(this.f80998b, gl50Var.f80998b) && wj50.m88271j(this.f80999c, gl50Var.f80999c) && wj50.m88271j(this.f81000d, gl50Var.f81000d);
    }

    public final int hashCode() {
        return this.f81000d.hashCode() + s571.m77243b(s571.m77243b(this.f80997a.hashCode() * 31, 31, this.f80998b), 31, this.f80999c);
    }
}
