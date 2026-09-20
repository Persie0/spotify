package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dl5 {

    /* JADX INFO: renamed from: a */
    public final String f50120a;

    /* JADX INFO: renamed from: b */
    public final String f50121b;

    /* JADX INFO: renamed from: c */
    public final String f50122c;

    /* JADX INFO: renamed from: d */
    public final ykz0 f50123d;

    /* JADX INFO: renamed from: e */
    public final String f50124e;

    /* JADX INFO: renamed from: f */
    public final String f50125f;

    public dl5(String str, String str2, String str3, ykz0 ykz0Var, String str4, String str5) {
        this.f50120a = str;
        this.f50121b = str2;
        this.f50122c = str3;
        this.f50123d = ykz0Var;
        this.f50124e = str4;
        this.f50125f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl5)) {
            return false;
        }
        dl5 dl5Var = (dl5) obj;
        return wj50.m88271j(this.f50120a, dl5Var.f50120a) && wj50.m88271j(this.f50121b, dl5Var.f50121b) && wj50.m88271j(this.f50122c, dl5Var.f50122c) && wj50.m88271j(this.f50123d, dl5Var.f50123d) && wj50.m88271j(this.f50124e, dl5Var.f50124e) && wj50.m88271j(this.f50125f, dl5Var.f50125f);
    }

    public final int hashCode() {
        int iHashCode = this.f50120a.hashCode() * 31;
        String str = this.f50121b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.f50122c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ykz0 ykz0Var = this.f50123d;
        int iHashCode4 = (iHashCode3 + (ykz0Var == null ? 0 : ykz0Var.hashCode())) * 31;
        String str3 = this.f50124e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50125f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }
}
