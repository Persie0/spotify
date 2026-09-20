package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j18 extends tpa0 {

    /* JADX INFO: renamed from: a */
    public final long f107675a;

    /* JADX INFO: renamed from: b */
    public final Integer f107676b;

    /* JADX INFO: renamed from: c */
    public final zuf f107677c;

    /* JADX INFO: renamed from: d */
    public final long f107678d;

    /* JADX INFO: renamed from: e */
    public final byte[] f107679e;

    /* JADX INFO: renamed from: f */
    public final String f107680f;

    /* JADX INFO: renamed from: g */
    public final long f107681g;

    /* JADX INFO: renamed from: h */
    public final wgj0 f107682h;

    /* JADX INFO: renamed from: i */
    public final llx f107683i;

    public j18(long j, Integer num, ry7 ry7Var, long j2, byte[] bArr, String str, long j3, n18 n18Var, v08 v08Var) {
        this.f107675a = j;
        this.f107676b = num;
        this.f107677c = ry7Var;
        this.f107678d = j2;
        this.f107679e = bArr;
        this.f107680f = str;
        this.f107681g = j3;
        this.f107682h = n18Var;
        this.f107683i = v08Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        zuf zufVar;
        String str;
        wgj0 wgj0Var;
        llx llxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tpa0) {
            tpa0 tpa0Var = (tpa0) obj;
            j18 j18Var = (j18) tpa0Var;
            llx llxVar2 = j18Var.f107683i;
            wgj0 wgj0Var2 = j18Var.f107682h;
            String str2 = j18Var.f107680f;
            zuf zufVar2 = j18Var.f107677c;
            Integer num2 = j18Var.f107676b;
            if (this.f107675a == j18Var.f107675a && ((num = this.f107676b) != null ? num.equals(num2) : num2 == null) && ((zufVar = this.f107677c) != null ? zufVar.equals(zufVar2) : zufVar2 == null) && this.f107678d == j18Var.f107678d) {
                if (Arrays.equals(this.f107679e, tpa0Var instanceof j18 ? ((j18) tpa0Var).f107679e : j18Var.f107679e) && ((str = this.f107680f) != null ? str.equals(str2) : str2 == null) && this.f107681g == j18Var.f107681g && ((wgj0Var = this.f107682h) != null ? wgj0Var.equals(wgj0Var2) : wgj0Var2 == null) && ((llxVar = this.f107683i) != null ? llxVar.equals(llxVar2) : llxVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f107675a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f107676b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        zuf zufVar = this.f107677c;
        int iHashCode2 = (iHashCode ^ (zufVar == null ? 0 : zufVar.hashCode())) * 1000003;
        long j2 = this.f107678d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f107679e)) * 1000003;
        String str = this.f107680f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f107681g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        wgj0 wgj0Var = this.f107682h;
        int iHashCode5 = (i2 ^ (wgj0Var == null ? 0 : wgj0Var.hashCode())) * 1000003;
        llx llxVar = this.f107683i;
        return iHashCode5 ^ (llxVar != null ? llxVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f107675a + ", eventCode=" + this.f107676b + ", complianceData=" + this.f107677c + ", eventUptimeMs=" + this.f107678d + ", sourceExtension=" + Arrays.toString(this.f107679e) + ", sourceExtensionJsonProto3=" + this.f107680f + ", timezoneOffsetSeconds=" + this.f107681g + ", networkConnectionInfo=" + this.f107682h + ", experimentIds=" + this.f107683i + "}";
    }
}
