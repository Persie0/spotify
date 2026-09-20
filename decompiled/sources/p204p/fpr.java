package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class fpr implements Parcelable {
    public static final dpr CREATOR = new dpr();

    /* JADX INFO: renamed from: S0 */
    public static final fpr f71944S0 = new fpr(null, null, null, false, false, null, null, null, true, false, false, false, false, null, true, false, null, "", false, false);

    /* JADX INFO: renamed from: L0 */
    public final ppr f71945L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f71946M0;

    /* JADX INFO: renamed from: N0 */
    public final boolean f71947N0;

    /* JADX INFO: renamed from: O0 */
    public final epr f71948O0;

    /* JADX INFO: renamed from: P0 */
    public final String f71949P0;

    /* JADX INFO: renamed from: Q0 */
    public final boolean f71950Q0;

    /* JADX INFO: renamed from: R0 */
    public final boolean f71951R0;

    /* JADX INFO: renamed from: X */
    public final boolean f71952X;

    /* JADX INFO: renamed from: Y */
    public final boolean f71953Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f71954Z;

    /* JADX INFO: renamed from: a */
    public final Integer f71955a;

    /* JADX INFO: renamed from: b */
    public final Integer f71956b;

    /* JADX INFO: renamed from: c */
    public final String f71957c;

    /* JADX INFO: renamed from: d */
    public final boolean f71958d;

    /* JADX INFO: renamed from: e */
    public final boolean f71959e;

    /* JADX INFO: renamed from: f */
    public final Boolean f71960f;

    /* JADX INFO: renamed from: g */
    public final kdd1 f71961g;

    /* JADX INFO: renamed from: h */
    public final ynr f71962h;

    /* JADX INFO: renamed from: i */
    public final boolean f71963i;

    /* JADX INFO: renamed from: t */
    public final boolean f71964t;

    public fpr(Integer num, Integer num2, String str, boolean z, boolean z2, Boolean bool, kdd1 kdd1Var, ynr ynrVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ppr pprVar, boolean z8, boolean z9, epr eprVar, String str2, boolean z10, boolean z11) {
        this.f71955a = num;
        this.f71956b = num2;
        this.f71957c = str;
        this.f71958d = z;
        this.f71959e = z2;
        this.f71960f = bool;
        this.f71961g = kdd1Var;
        this.f71962h = ynrVar;
        this.f71963i = z3;
        this.f71964t = z4;
        this.f71952X = z5;
        this.f71953Y = z6;
        this.f71954Z = z7;
        this.f71945L0 = pprVar;
        this.f71946M0 = z8;
        this.f71947N0 = z9;
        this.f71948O0 = eprVar;
        this.f71949P0 = str2;
        this.f71950Q0 = z10;
        this.f71951R0 = z11;
    }

    /* JADX INFO: renamed from: c */
    public static fpr m42381c(fpr fprVar, Integer num, Integer num2, String str, boolean z, boolean z2, Boolean bool, kdd1 kdd1Var, ynr ynrVar, boolean z3, boolean z4, boolean z5, boolean z6, ppr pprVar, boolean z7, boolean z8, epr eprVar, String str2, boolean z9, int i) {
        Integer num3 = (i & 1) != 0 ? fprVar.f71955a : num;
        Integer num4 = (i & 2) != 0 ? fprVar.f71956b : num2;
        String str3 = (i & 4) != 0 ? fprVar.f71957c : str;
        boolean z10 = (i & 8) != 0 ? fprVar.f71958d : z;
        boolean z11 = (i & 16) != 0 ? fprVar.f71959e : z2;
        Boolean bool2 = (i & 32) != 0 ? fprVar.f71960f : bool;
        kdd1 kdd1Var2 = (i & 64) != 0 ? fprVar.f71961g : kdd1Var;
        ynr ynrVar2 = (i & 128) != 0 ? fprVar.f71962h : ynrVar;
        boolean z12 = (i & 256) != 0 ? fprVar.f71963i : z3;
        boolean z13 = (i & 512) != 0 ? fprVar.f71964t : z4;
        boolean z14 = (i & 1024) != 0 ? fprVar.f71952X : z5;
        boolean z15 = (i & 2048) != 0 ? fprVar.f71953Y : z6;
        boolean z16 = (i & 4096) != 0 ? fprVar.f71954Z : true;
        ppr pprVar2 = (i & 8192) != 0 ? fprVar.f71945L0 : pprVar;
        boolean z17 = (i & 16384) != 0 ? fprVar.f71946M0 : z7;
        boolean z18 = (32768 & i) != 0 ? fprVar.f71947N0 : z8;
        epr eprVar2 = (65536 & i) != 0 ? fprVar.f71948O0 : eprVar;
        String str4 = (131072 & i) != 0 ? fprVar.f71949P0 : str2;
        boolean z19 = (262144 & i) != 0 ? fprVar.f71950Q0 : true;
        boolean z20 = (i & 524288) != 0 ? fprVar.f71951R0 : z9;
        fprVar.getClass();
        return new fpr(num3, num4, str3, z10, z11, bool2, kdd1Var2, ynrVar2, z12, z13, z14, z15, z16, pprVar2, z17, z18, eprVar2, str4, z19, z20);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpr)) {
            return false;
        }
        fpr fprVar = (fpr) obj;
        return wj50.m88271j(this.f71955a, fprVar.f71955a) && wj50.m88271j(this.f71956b, fprVar.f71956b) && wj50.m88271j(this.f71957c, fprVar.f71957c) && this.f71958d == fprVar.f71958d && this.f71959e == fprVar.f71959e && wj50.m88271j(this.f71960f, fprVar.f71960f) && wj50.m88271j(this.f71961g, fprVar.f71961g) && wj50.m88271j(this.f71962h, fprVar.f71962h) && this.f71963i == fprVar.f71963i && this.f71964t == fprVar.f71964t && this.f71952X == fprVar.f71952X && this.f71953Y == fprVar.f71953Y && this.f71954Z == fprVar.f71954Z && wj50.m88271j(this.f71945L0, fprVar.f71945L0) && this.f71946M0 == fprVar.f71946M0 && this.f71947N0 == fprVar.f71947N0 && wj50.m88271j(this.f71948O0, fprVar.f71948O0) && wj50.m88271j(this.f71949P0, fprVar.f71949P0) && this.f71950Q0 == fprVar.f71950Q0 && this.f71951R0 == fprVar.f71951R0;
    }

    public final int hashCode() {
        Integer num = this.f71955a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f71956b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f71957c;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f71958d), 31, this.f71959e);
        Boolean bool = this.f71960f;
        int iHashCode3 = (iM77245d + (bool == null ? 0 : bool.hashCode())) * 31;
        kdd1 kdd1Var = this.f71961g;
        int iHashCode4 = (iHashCode3 + (kdd1Var == null ? 0 : kdd1Var.hashCode())) * 31;
        ynr ynrVar = this.f71962h;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode4 + (ynrVar == null ? 0 : ynrVar.hashCode())) * 31, 31, this.f71963i), 31, this.f71964t), 31, this.f71952X), 31, this.f71953Y), 31, this.f71954Z);
        ppr pprVar = this.f71945L0;
        int iM77245d3 = s571.m77245d(s571.m77245d((iM77245d2 + (pprVar == null ? 0 : pprVar.hashCode())) * 31, 31, this.f71946M0), 31, this.f71947N0);
        epr eprVar = this.f71948O0;
        return Boolean.hashCode(this.f71951R0) + s571.m77245d(s571.m77243b((iM77245d3 + (eprVar != null ? eprVar.hashCode() : 0)) * 31, 31, this.f71949P0), 31, this.f71950Q0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        mqg1.m62560t(parcel, this.f71955a);
        mqg1.m62560t(parcel, this.f71956b);
        parcel.writeString(this.f71957c);
        parcel.writeByte(this.f71958d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71959e ? (byte) 1 : (byte) 0);
        Boolean bool = this.f71960f;
        mqg1.m62560t(parcel, bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null);
        parcel.writeParcelable(this.f71962h, i);
        parcel.writeByte(this.f71963i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71964t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71952X ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71953Y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71954Z ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f71945L0, i);
        parcel.writeByte(this.f71946M0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71947N0 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f71948O0, i);
        parcel.writeString(this.f71949P0);
        parcel.writeByte(this.f71950Q0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71951R0 ? (byte) 1 : (byte) 0);
    }
}
