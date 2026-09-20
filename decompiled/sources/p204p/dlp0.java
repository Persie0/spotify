package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dlp0 {

    /* JADX INFO: renamed from: a */
    public final String f50303a;

    /* JADX INFO: renamed from: b */
    public final String f50304b;

    /* JADX INFO: renamed from: c */
    public final String f50305c;

    /* JADX INFO: renamed from: d */
    public final String f50306d;

    /* JADX INFO: renamed from: e */
    public final zkp0 f50307e;

    /* JADX INFO: renamed from: f */
    public final ykp0 f50308f;

    /* JADX INFO: renamed from: g */
    public final boolean f50309g;

    public dlp0(String str, String str2, String str3, String str4, zkp0 zkp0Var, ykp0 ykp0Var, boolean z) {
        this.f50303a = str;
        this.f50304b = str2;
        this.f50305c = str3;
        this.f50306d = str4;
        this.f50307e = zkp0Var;
        this.f50308f = ykp0Var;
        this.f50309g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlp0)) {
            return false;
        }
        dlp0 dlp0Var = (dlp0) obj;
        return wj50.m88271j(this.f50303a, dlp0Var.f50303a) && wj50.m88271j(this.f50304b, dlp0Var.f50304b) && wj50.m88271j(this.f50305c, dlp0Var.f50305c) && wj50.m88271j(this.f50306d, dlp0Var.f50306d) && wj50.m88271j(this.f50307e, dlp0Var.f50307e) && wj50.m88271j(this.f50308f, dlp0Var.f50308f) && this.f50309g == dlp0Var.f50309g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f50303a.hashCode() * 31, 31, this.f50304b);
        String str = this.f50305c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50306d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        zkp0 zkp0Var = this.f50307e;
        int iHashCode3 = (iHashCode2 + (zkp0Var == null ? 0 : zkp0Var.hashCode())) * 31;
        ykp0 ykp0Var = this.f50308f;
        return Boolean.hashCode(this.f50309g) + ((iHashCode3 + (ykp0Var != null ? ykp0Var.hashCode() : 0)) * 31);
    }
}
