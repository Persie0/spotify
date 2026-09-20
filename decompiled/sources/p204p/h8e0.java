package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h8e0 {

    /* JADX INFO: renamed from: a */
    public final String f88683a;

    /* JADX INFO: renamed from: b */
    public final String f88684b;

    /* JADX INFO: renamed from: c */
    public final String f88685c;

    /* JADX INFO: renamed from: d */
    public final boolean f88686d;

    /* JADX INFO: renamed from: e */
    public final Long f88687e;

    public h8e0(String str, String str2, String str3, boolean z, Long l) {
        this.f88683a = str;
        this.f88684b = str2;
        this.f88685c = str3;
        this.f88686d = z;
        this.f88687e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8e0)) {
            return false;
        }
        h8e0 h8e0Var = (h8e0) obj;
        return wj50.m88271j(this.f88683a, h8e0Var.f88683a) && wj50.m88271j(this.f88684b, h8e0Var.f88684b) && wj50.m88271j(this.f88685c, h8e0Var.f88685c) && this.f88686d == h8e0Var.f88686d && wj50.m88271j(this.f88687e, h8e0Var.f88687e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f88683a.hashCode() * 31, 31, this.f88684b);
        String str = this.f88685c;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f88686d);
        Long l = this.f88687e;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
