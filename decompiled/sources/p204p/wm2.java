package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wm2 {

    /* JADX INFO: renamed from: a */
    public final String f252693a;

    /* JADX INFO: renamed from: b */
    public final String f252694b;

    /* JADX INFO: renamed from: c */
    public final String f252695c;

    /* JADX INFO: renamed from: d */
    public final Integer f252696d;

    /* JADX INFO: renamed from: e */
    public final Boolean f252697e;

    /* JADX INFO: renamed from: f */
    public final String f252698f;

    public /* synthetic */ wm2(String str, String str2, String str3, Integer num, Boolean bool, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm2)) {
            return false;
        }
        wm2 wm2Var = (wm2) obj;
        return wj50.m88271j(this.f252693a, wm2Var.f252693a) && wj50.m88271j(this.f252694b, wm2Var.f252694b) && wj50.m88271j(this.f252695c, wm2Var.f252695c) && wj50.m88271j(this.f252696d, wm2Var.f252696d) && wj50.m88271j(this.f252697e, wm2Var.f252697e) && wj50.m88271j(this.f252698f, wm2Var.f252698f);
    }

    public final int hashCode() {
        String str = this.f252693a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f252694b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f252695c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f252696d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f252697e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f252698f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public wm2(String str, String str2, String str3, Integer num, Boolean bool, String str4) {
        this.f252693a = str;
        this.f252694b = str2;
        this.f252695c = str3;
        this.f252696d = num;
        this.f252697e = bool;
        this.f252698f = str4;
    }
}
