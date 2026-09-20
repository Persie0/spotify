package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class y1f1 {

    /* JADX INFO: renamed from: a */
    public final Integer f268260a;

    /* JADX INFO: renamed from: b */
    public final String f268261b;

    /* JADX INFO: renamed from: c */
    public final String f268262c;

    /* JADX INFO: renamed from: d */
    public final String f268263d;

    /* JADX INFO: renamed from: e */
    public final String f268264e;

    /* JADX INFO: renamed from: f */
    public final String f268265f;

    /* JADX INFO: renamed from: g */
    public final String f268266g;

    /* JADX INFO: renamed from: h */
    public final String f268267h;

    /* JADX INFO: renamed from: i */
    public final String f268268i;

    /* JADX INFO: renamed from: j */
    public final Long f268269j;

    public y1f1(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l) {
        this.f268260a = num;
        this.f268261b = str;
        this.f268262c = str2;
        this.f268263d = str3;
        this.f268264e = str4;
        this.f268265f = str5;
        this.f268266g = str6;
        this.f268267h = str7;
        this.f268268i = str8;
        this.f268269j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1f1)) {
            return false;
        }
        y1f1 y1f1Var = (y1f1) obj;
        return wj50.m88271j(this.f268260a, y1f1Var.f268260a) && wj50.m88271j(this.f268261b, y1f1Var.f268261b) && wj50.m88271j(this.f268262c, y1f1Var.f268262c) && wj50.m88271j(this.f268263d, y1f1Var.f268263d) && wj50.m88271j(this.f268264e, y1f1Var.f268264e) && wj50.m88271j(this.f268265f, y1f1Var.f268265f) && wj50.m88271j(this.f268266g, y1f1Var.f268266g) && wj50.m88271j(this.f268267h, y1f1Var.f268267h) && wj50.m88271j(this.f268268i, y1f1Var.f268268i) && wj50.m88271j(this.f268269j, y1f1Var.f268269j);
    }

    public final int hashCode() {
        Integer num = this.f268260a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f268261b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f268262c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f268263d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f268264e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f268265f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f268266g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f268267h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f268268i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.f268269j;
        return iHashCode9 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceIds(id=");
        sb.append(this.f268260a);
        sb.append(", deviceId=");
        sb.append(this.f268261b);
        sb.append(", imei=");
        klh.m56844p(sb, this.f268262c, ", imsi=", this.f268263d, ", bluetoothMAC=");
        klh.m56844p(sb, this.f268264e, ", wiFiMAC=", this.f268265f, ", androidId=");
        klh.m56844p(sb, this.f268266g, ", mediaDrmId=", this.f268267h, ", deviceIdProvider=");
        sb.append(this.f268268i);
        sb.append(", createdAt=");
        sb.append(this.f268269j);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ y1f1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, int i) {
        this((Integer) 0, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? null : l);
    }
}
