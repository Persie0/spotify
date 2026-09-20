package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class yuf0 implements Parcelable {
    public static final Parcelable.Creator<yuf0> CREATOR = new xuf0(0);

    /* JADX INFO: renamed from: L0 */
    public final boolean f276339L0;

    /* JADX INFO: renamed from: M0 */
    public final Float f276340M0;

    /* JADX INFO: renamed from: N0 */
    public final b791 f276341N0;

    /* JADX INFO: renamed from: O0 */
    public final b791 f276342O0;

    /* JADX INFO: renamed from: P0 */
    public final b791 f276343P0;

    /* JADX INFO: renamed from: Q0 */
    public final String f276344Q0;

    /* JADX INFO: renamed from: R0 */
    public final String f276345R0;

    /* JADX INFO: renamed from: S0 */
    public final b791 f276346S0;

    /* JADX INFO: renamed from: T0 */
    public final h2r0 f276347T0;

    /* JADX INFO: renamed from: U0 */
    public final boolean f276348U0;

    /* JADX INFO: renamed from: V0 */
    public final int f276349V0;

    /* JADX INFO: renamed from: W0 */
    public final int f276350W0;

    /* JADX INFO: renamed from: X */
    public final List f276351X;

    /* JADX INFO: renamed from: X0 */
    public final List f276352X0;

    /* JADX INFO: renamed from: Y */
    public final List f276353Y;

    /* JADX INFO: renamed from: Y0 */
    public final List f276354Y0;

    /* JADX INFO: renamed from: Z */
    public final boolean f276355Z;

    /* JADX INFO: renamed from: Z0 */
    public final int f276356Z0;

    /* JADX INFO: renamed from: a */
    public final boolean f276357a;

    /* JADX INFO: renamed from: a1 */
    public final int f276358a1;

    /* JADX INFO: renamed from: b */
    public final boolean f276359b;

    /* JADX INFO: renamed from: b1 */
    public final int f276360b1;

    /* JADX INFO: renamed from: c */
    public final boolean f276361c;

    /* JADX INFO: renamed from: c1 */
    public final onl0 f276362c1;

    /* JADX INFO: renamed from: d */
    public final csh0 f276363d;

    /* JADX INFO: renamed from: d1 */
    public final k69 f276364d1;

    /* JADX INFO: renamed from: e */
    public final Boolean f276365e;

    /* JADX INFO: renamed from: e1 */
    public final k69 f276366e1;

    /* JADX INFO: renamed from: f */
    public final jbp0 f276367f;

    /* JADX INFO: renamed from: f1 */
    public final Float f276368f1;

    /* JADX INFO: renamed from: g */
    public final b791 f276369g;

    /* JADX INFO: renamed from: g1 */
    public final Float f276370g1;

    /* JADX INFO: renamed from: h */
    public final b791 f276371h;

    /* JADX INFO: renamed from: h1 */
    public final Float f276372h1;

    /* JADX INFO: renamed from: i */
    public final b791 f276373i;

    /* JADX INFO: renamed from: i1 */
    public final Float f276374i1;

    /* JADX INFO: renamed from: j1 */
    public final int f276375j1;

    /* JADX INFO: renamed from: k1 */
    public final boolean f276376k1;

    /* JADX INFO: renamed from: l1 */
    public final boolean f276377l1;

    /* JADX INFO: renamed from: m1 */
    public final String f276378m1;

    /* JADX INFO: renamed from: n1 */
    public final boolean f276379n1;

    /* JADX INFO: renamed from: o1 */
    public final b791 f276380o1;

    /* JADX INFO: renamed from: p1 */
    public final Integer f276381p1;

    /* JADX INFO: renamed from: q1 */
    public final xjf0 f276382q1;

    /* JADX INFO: renamed from: r1 */
    public final boolean f276383r1;

    /* JADX INFO: renamed from: s1 */
    public final Integer f276384s1;

    /* JADX INFO: renamed from: t */
    public final xx7 f276385t;

    /* JADX INFO: renamed from: t1 */
    public final Integer f276386t1;

    public yuf0(boolean z, boolean z2, boolean z3, csh0 csh0Var, Boolean bool, jbp0 jbp0Var, b791 b791Var, b791 b791Var2, b791 b791Var3, xx7 xx7Var, List list, List list2, boolean z4, boolean z5, Float f, b791 b791Var4, b791 b791Var5, b791 b791Var6, String str, String str2, b791 b791Var7, h2r0 h2r0Var, boolean z6, int i, int i2, List list3, List list4, int i3, int i4, int i5, onl0 onl0Var, k69 k69Var, k69 k69Var2, Float f2, Float f3, Float f4, Float f5, int i6, boolean z7, boolean z8, String str3, boolean z9, b791 b791Var8, Integer num, xjf0 xjf0Var, boolean z10, Integer num2, Integer num3) {
        this.f276357a = z;
        this.f276359b = z2;
        this.f276361c = z3;
        this.f276363d = csh0Var;
        this.f276365e = bool;
        this.f276367f = jbp0Var;
        this.f276369g = b791Var;
        this.f276371h = b791Var2;
        this.f276373i = b791Var3;
        this.f276385t = xx7Var;
        this.f276351X = list;
        this.f276353Y = list2;
        this.f276355Z = z4;
        this.f276339L0 = z5;
        this.f276340M0 = f;
        this.f276341N0 = b791Var4;
        this.f276342O0 = b791Var5;
        this.f276343P0 = b791Var6;
        this.f276344Q0 = str;
        this.f276345R0 = str2;
        this.f276346S0 = b791Var7;
        this.f276347T0 = h2r0Var;
        this.f276348U0 = z6;
        this.f276349V0 = i;
        this.f276350W0 = i2;
        this.f276352X0 = list3;
        this.f276354Y0 = list4;
        this.f276356Z0 = i3;
        this.f276358a1 = i4;
        this.f276360b1 = i5;
        this.f276362c1 = onl0Var;
        this.f276364d1 = k69Var;
        this.f276366e1 = k69Var2;
        this.f276368f1 = f2;
        this.f276370g1 = f3;
        this.f276372h1 = f4;
        this.f276374i1 = f5;
        this.f276375j1 = i6;
        this.f276376k1 = z7;
        this.f276377l1 = z8;
        this.f276378m1 = str3;
        this.f276379n1 = z9;
        this.f276380o1 = b791Var8;
        this.f276381p1 = num;
        this.f276382q1 = xjf0Var;
        this.f276383r1 = z10;
        this.f276384s1 = num2;
        this.f276386t1 = num3;
    }

    /* JADX INFO: renamed from: c */
    public static yuf0 m94655c(yuf0 yuf0Var, csh0 csh0Var, Boolean bool, jbp0 jbp0Var, b791 b791Var, b791 b791Var2, b791 b791Var3, xx7 xx7Var, Float f, b791 b791Var4, b791 b791Var5, b791 b791Var6, String str, String str2, b791 b791Var7, h2r0 h2r0Var, boolean z, int i, List list, ArrayList arrayList, int i2, int i3, onl0 onl0Var, k69 k69Var, k69 k69Var2, Float f2, Float f3, Float f4, boolean z2, b791 b791Var8, Integer num, xjf0 xjf0Var, Integer num2, Integer num3, int i4, int i5) {
        boolean z3 = yuf0Var.f276357a;
        boolean z4 = yuf0Var.f276359b;
        boolean z5 = yuf0Var.f276361c;
        csh0 csh0Var2 = (i4 & 8) != 0 ? yuf0Var.f276363d : csh0Var;
        Boolean bool2 = (i4 & 16) != 0 ? yuf0Var.f276365e : bool;
        jbp0 jbp0Var2 = (i4 & 32) != 0 ? yuf0Var.f276367f : jbp0Var;
        b791 b791Var9 = (i4 & 64) != 0 ? yuf0Var.f276369g : b791Var;
        b791 b791Var10 = (i4 & 128) != 0 ? yuf0Var.f276371h : b791Var2;
        b791 b791Var11 = (i4 & 256) != 0 ? yuf0Var.f276373i : b791Var3;
        xx7 xx7Var2 = (i4 & 512) != 0 ? yuf0Var.f276385t : xx7Var;
        Boolean bool3 = bool2;
        b791 b791Var12 = b791Var9;
        b791 b791Var13 = b791Var11;
        List list2 = yuf0Var.f276351X;
        csh0 csh0Var3 = csh0Var2;
        jbp0 jbp0Var3 = jbp0Var2;
        b791 b791Var14 = b791Var10;
        xx7 xx7Var3 = xx7Var2;
        List list3 = yuf0Var.f276353Y;
        boolean z6 = yuf0Var.f276355Z;
        boolean z7 = yuf0Var.f276339L0;
        Float f5 = (i4 & 16384) != 0 ? yuf0Var.f276340M0 : f;
        b791 b791Var15 = (i4 & 32768) != 0 ? yuf0Var.f276341N0 : b791Var4;
        b791 b791Var16 = (i4 & 65536) != 0 ? yuf0Var.f276342O0 : b791Var5;
        b791 b791Var17 = (i4 & 131072) != 0 ? yuf0Var.f276343P0 : b791Var6;
        String str3 = (i4 & 262144) != 0 ? yuf0Var.f276344Q0 : str;
        String str4 = (i4 & 524288) != 0 ? yuf0Var.f276345R0 : str2;
        b791 b791Var18 = (i4 & 1048576) != 0 ? yuf0Var.f276346S0 : b791Var7;
        h2r0 h2r0Var2 = (i4 & 2097152) != 0 ? yuf0Var.f276347T0 : h2r0Var;
        boolean z8 = (i4 & 4194304) != 0 ? yuf0Var.f276348U0 : z;
        int i6 = (i4 & 8388608) != 0 ? yuf0Var.f276349V0 : i;
        int i7 = yuf0Var.f276350W0;
        List list4 = (i4 & 33554432) != 0 ? yuf0Var.f276352X0 : list;
        List list5 = (i4 & 67108864) != 0 ? yuf0Var.f276354Y0 : arrayList;
        int i8 = (i4 & 134217728) != 0 ? yuf0Var.f276356Z0 : i2;
        int i9 = (i4 & 268435456) != 0 ? yuf0Var.f276358a1 : i3;
        int i10 = yuf0Var.f276360b1;
        onl0 onl0Var2 = (i4 & 1073741824) != 0 ? yuf0Var.f276362c1 : onl0Var;
        k69 k69Var3 = (i4 & Integer.MIN_VALUE) != 0 ? yuf0Var.f276364d1 : k69Var;
        k69 k69Var4 = (i5 & 1) != 0 ? yuf0Var.f276366e1 : k69Var2;
        Float f6 = (i5 & 2) != 0 ? yuf0Var.f276368f1 : f2;
        Float f7 = (i5 & 4) != 0 ? yuf0Var.f276370g1 : f3;
        Float f8 = yuf0Var.f276372h1;
        Float f9 = (i5 & 16) != 0 ? yuf0Var.f276374i1 : f4;
        int i11 = yuf0Var.f276375j1;
        boolean z9 = (i5 & 64) != 0 ? yuf0Var.f276376k1 : false;
        boolean z10 = (i5 & 128) != 0 ? yuf0Var.f276377l1 : false;
        String str5 = (i5 & 256) != 0 ? yuf0Var.f276378m1 : null;
        boolean z11 = (i5 & 512) != 0 ? yuf0Var.f276379n1 : z2;
        b791 b791Var19 = (i5 & 1024) != 0 ? yuf0Var.f276380o1 : b791Var8;
        Integer num4 = (i5 & 2048) != 0 ? yuf0Var.f276381p1 : num;
        xjf0 xjf0Var2 = (i5 & 4096) != 0 ? yuf0Var.f276382q1 : xjf0Var;
        boolean z12 = yuf0Var.f276383r1;
        Integer num5 = (i5 & 16384) != 0 ? yuf0Var.f276384s1 : num2;
        Integer num6 = (i5 & 32768) != 0 ? yuf0Var.f276386t1 : num3;
        yuf0Var.getClass();
        return new yuf0(z3, z4, z5, csh0Var3, bool3, jbp0Var3, b791Var12, b791Var14, b791Var13, xx7Var3, list2, list3, z6, z7, f5, b791Var15, b791Var16, b791Var17, str3, str4, b791Var18, h2r0Var2, z8, i6, i7, list4, list5, i8, i9, i10, onl0Var2, k69Var3, k69Var4, f6, f7, f8, f9, i11, z9, z10, str5, z11, b791Var19, num4, xjf0Var2, z12, num5, num6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuf0)) {
            return false;
        }
        yuf0 yuf0Var = (yuf0) obj;
        return this.f276357a == yuf0Var.f276357a && this.f276359b == yuf0Var.f276359b && this.f276361c == yuf0Var.f276361c && wj50.m88271j(this.f276363d, yuf0Var.f276363d) && wj50.m88271j(this.f276365e, yuf0Var.f276365e) && wj50.m88271j(this.f276367f, yuf0Var.f276367f) && wj50.m88271j(this.f276369g, yuf0Var.f276369g) && wj50.m88271j(this.f276371h, yuf0Var.f276371h) && wj50.m88271j(this.f276373i, yuf0Var.f276373i) && this.f276385t == yuf0Var.f276385t && wj50.m88271j(this.f276351X, yuf0Var.f276351X) && wj50.m88271j(this.f276353Y, yuf0Var.f276353Y) && this.f276355Z == yuf0Var.f276355Z && this.f276339L0 == yuf0Var.f276339L0 && wj50.m88271j(this.f276340M0, yuf0Var.f276340M0) && wj50.m88271j(this.f276341N0, yuf0Var.f276341N0) && wj50.m88271j(this.f276342O0, yuf0Var.f276342O0) && wj50.m88271j(this.f276343P0, yuf0Var.f276343P0) && wj50.m88271j(this.f276344Q0, yuf0Var.f276344Q0) && wj50.m88271j(this.f276345R0, yuf0Var.f276345R0) && wj50.m88271j(this.f276346S0, yuf0Var.f276346S0) && wj50.m88271j(this.f276347T0, yuf0Var.f276347T0) && this.f276348U0 == yuf0Var.f276348U0 && this.f276349V0 == yuf0Var.f276349V0 && this.f276350W0 == yuf0Var.f276350W0 && wj50.m88271j(this.f276352X0, yuf0Var.f276352X0) && wj50.m88271j(this.f276354Y0, yuf0Var.f276354Y0) && this.f276356Z0 == yuf0Var.f276356Z0 && this.f276358a1 == yuf0Var.f276358a1 && this.f276360b1 == yuf0Var.f276360b1 && this.f276362c1 == yuf0Var.f276362c1 && wj50.m88271j(this.f276364d1, yuf0Var.f276364d1) && wj50.m88271j(this.f276366e1, yuf0Var.f276366e1) && wj50.m88271j(this.f276368f1, yuf0Var.f276368f1) && wj50.m88271j(this.f276370g1, yuf0Var.f276370g1) && wj50.m88271j(this.f276372h1, yuf0Var.f276372h1) && wj50.m88271j(this.f276374i1, yuf0Var.f276374i1) && this.f276375j1 == yuf0Var.f276375j1 && this.f276376k1 == yuf0Var.f276376k1 && this.f276377l1 == yuf0Var.f276377l1 && wj50.m88271j(this.f276378m1, yuf0Var.f276378m1) && this.f276379n1 == yuf0Var.f276379n1 && wj50.m88271j(this.f276380o1, yuf0Var.f276380o1) && wj50.m88271j(this.f276381p1, yuf0Var.f276381p1) && wj50.m88271j(this.f276382q1, yuf0Var.f276382q1) && this.f276383r1 == yuf0Var.f276383r1 && wj50.m88271j(this.f276384s1, yuf0Var.f276384s1) && wj50.m88271j(this.f276386t1, yuf0Var.f276386t1);
    }

    /* JADX INFO: renamed from: g */
    public final String m94656g() {
        if (wj50.m88271j(this.f276347T0, e2r0.f55505a)) {
            return this.f276378m1;
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = (this.f276363d.hashCode() + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f276357a) * 31, 31, this.f276359b), 31, this.f276361c)) * 31;
        Boolean bool = this.f276365e;
        int iHashCode2 = (this.f276369g.hashCode() + ((this.f276367f.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        b791 b791Var = this.f276371h;
        int iHashCode3 = (iHashCode2 + (b791Var == null ? 0 : b791Var.hashCode())) * 31;
        b791 b791Var2 = this.f276373i;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77244c(s571.m77244c((this.f276385t.hashCode() + ((iHashCode3 + (b791Var2 == null ? 0 : b791Var2.hashCode())) * 31)) * 31, 31, this.f276351X), 31, this.f276353Y), 31, this.f276355Z), 31, this.f276339L0);
        Float f = this.f276340M0;
        int iHashCode4 = (iM77245d + (f == null ? 0 : f.hashCode())) * 31;
        b791 b791Var3 = this.f276341N0;
        int iHashCode5 = (iHashCode4 + (b791Var3 == null ? 0 : b791Var3.hashCode())) * 31;
        b791 b791Var4 = this.f276342O0;
        int iM77243b = s571.m77243b(s571.m77243b((this.f276343P0.hashCode() + ((iHashCode5 + (b791Var4 == null ? 0 : b791Var4.hashCode())) * 31)) * 31, 31, this.f276344Q0), 31, this.f276345R0);
        b791 b791Var5 = this.f276346S0;
        int iHashCode6 = (this.f276362c1.hashCode() + mt60.m62800g(this.f276360b1, mt60.m62800g(this.f276358a1, mt60.m62800g(this.f276356Z0, s571.m77244c(s571.m77244c(mt60.m62800g(this.f276350W0, mt60.m62800g(this.f276349V0, s571.m77245d((this.f276347T0.hashCode() + ((iM77243b + (b791Var5 == null ? 0 : b791Var5.hashCode())) * 31)) * 31, 31, this.f276348U0), 31), 31), 31, this.f276352X0), 31, this.f276354Y0), 31), 31), 31)) * 31;
        k69 k69Var = this.f276364d1;
        int iHashCode7 = (iHashCode6 + (k69Var == null ? 0 : k69Var.hashCode())) * 31;
        k69 k69Var2 = this.f276366e1;
        int iHashCode8 = (iHashCode7 + (k69Var2 == null ? 0 : k69Var2.hashCode())) * 31;
        Float f2 = this.f276368f1;
        int iHashCode9 = (iHashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.f276370g1;
        int iHashCode10 = (iHashCode9 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.f276372h1;
        int iHashCode11 = (iHashCode10 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.f276374i1;
        int iM77245d2 = s571.m77245d(s571.m77245d(mt60.m62800g(this.f276375j1, (iHashCode11 + (f5 == null ? 0 : f5.hashCode())) * 31, 31), 31, this.f276376k1), 31, this.f276377l1);
        String str = this.f276378m1;
        int iM77245d3 = s571.m77245d((iM77245d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f276379n1);
        b791 b791Var6 = this.f276380o1;
        int iHashCode12 = (iM77245d3 + (b791Var6 == null ? 0 : b791Var6.hashCode())) * 31;
        Integer num = this.f276381p1;
        int iM77245d4 = s571.m77245d((this.f276382q1.hashCode() + ((iHashCode12 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f276383r1);
        Integer num2 = this.f276384s1;
        int iHashCode13 = (iM77245d4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f276386t1;
        return iHashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixingModel(");
        sb.append("presetMode=" + this.f276347T0);
        sb.append(", currentTransition=" + this.f276343P0.m28367g());
        sb.append(", autoTransition=" + this.f276369g.m28367g());
        b791 b791Var = this.f276341N0;
        if (b791Var != null) {
            sb.append(", storedTransition=" + b791Var.m28367g());
        }
        b791 b791Var2 = this.f276342O0;
        if (b791Var2 != null) {
            sb.append(", customTransition=" + b791Var2.m28367g());
        }
        b791 b791Var3 = this.f276380o1;
        if (b791Var3 != null) {
            sb.append(", firstBeatmatchedTransition=" + b791Var3.m28367g());
        }
        sb.append(", playerState=" + this.f276367f);
        sb.append(", modalBottomSheet=" + this.f276363d);
        k69 k69Var = this.f276364d1;
        sb.append(", beatsTrackA=" + (k69Var != null ? Integer.valueOf(k69Var.f119694b.size()) : "null") + " beats");
        k69 k69Var2 = this.f276366e1;
        sb.append(", beatsTrackB=" + (k69Var2 != null ? Integer.valueOf(k69Var2.f119694b.size()) : "null") + " beats");
        sb.append(", trackABpm=" + this.f276368f1 + ", trackBBpm=" + this.f276370g1);
        sb.append(", trackASpeed=" + this.f276372h1 + ", trackBSpeed=" + this.f276374i1);
        StringBuilder sb2 = new StringBuilder(", isCurveEditingMode=");
        sb2.append(this.f276348U0);
        sb.append(sb2.toString());
        sb.append(", hasBeatmatchedTransition=" + this.f276379n1);
        sb.append(", beatMatchedBarCount=" + this.f276381p1);
        sb.append(", ongoingBackendCalls=" + this.f276362c1);
        sb.append(", isSharedTransitionOutdated=" + this.f276376k1);
        sb.append(", isSharedTransitionFlow=" + this.f276377l1);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f276357a ? 1 : 0);
        parcel.writeInt(this.f276359b ? 1 : 0);
        parcel.writeInt(this.f276361c ? 1 : 0);
        parcel.writeParcelable(this.f276363d, i);
        Boolean bool = this.f276365e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f276367f, i);
        parcel.writeParcelable(this.f276369g, i);
        parcel.writeParcelable(this.f276371h, i);
        parcel.writeParcelable(this.f276373i, i);
        this.f276385t.writeToParcel(parcel, i);
        Iterator itM42468l = fr0.m42468l(parcel, this.f276351X);
        while (itM42468l.hasNext()) {
            ((mky) itM42468l.next()).writeToParcel(parcel, i);
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f276353Y);
        while (itM42468l2.hasNext()) {
            ((mky) itM42468l2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f276355Z ? 1 : 0);
        parcel.writeInt(this.f276339L0 ? 1 : 0);
        Float f = this.f276340M0;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeParcelable(this.f276341N0, i);
        parcel.writeParcelable(this.f276342O0, i);
        parcel.writeParcelable(this.f276343P0, i);
        parcel.writeString(this.f276344Q0);
        parcel.writeString(this.f276345R0);
        parcel.writeParcelable(this.f276346S0, i);
        parcel.writeParcelable(this.f276347T0, i);
        parcel.writeInt(this.f276348U0 ? 1 : 0);
        parcel.writeInt(this.f276349V0);
        parcel.writeInt(this.f276350W0);
        Iterator itM42468l3 = fr0.m42468l(parcel, this.f276352X0);
        while (itM42468l3.hasNext()) {
            parcel.writeInt(((Number) itM42468l3.next()).intValue());
        }
        Iterator itM42468l4 = fr0.m42468l(parcel, this.f276354Y0);
        while (itM42468l4.hasNext()) {
            parcel.writeInt(((Number) itM42468l4.next()).intValue());
        }
        parcel.writeInt(this.f276356Z0);
        parcel.writeInt(this.f276358a1);
        parcel.writeInt(this.f276360b1);
        Float f2 = this.f276372h1;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.f276374i1;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        parcel.writeInt(this.f276375j1);
        parcel.writeInt(this.f276376k1 ? 1 : 0);
        parcel.writeInt(this.f276377l1 ? 1 : 0);
        parcel.writeString(this.f276378m1);
        parcel.writeInt(this.f276379n1 ? 1 : 0);
        parcel.writeParcelable(this.f276380o1, i);
        Integer num = this.f276381p1;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        this.f276382q1.writeToParcel(parcel, i);
        parcel.writeInt(this.f276383r1 ? 1 : 0);
    }

    public yuf0(boolean z, boolean z2, boolean z3, csh0 csh0Var, Boolean bool, jbp0 jbp0Var, b791 b791Var, b791 b791Var2, b791 b791Var3, xx7 xx7Var, List list, List list2, boolean z4, boolean z5, Float f, b791 b791Var4, b791 b791Var5, b791 b791Var6, String str, String str2, b791 b791Var7, h2r0 h2r0Var, boolean z6, int i, int i2, List list3, ArrayList arrayList, int i3, int i4, int i5, Float f2, Float f3, int i6, boolean z7, boolean z8, String str3, boolean z9, b791 b791Var8, Integer num, xjf0 xjf0Var, boolean z10, int i7, int i8) {
        this(z, z2, z3, csh0Var, (i7 & 16) != 0 ? null : bool, (i7 & 32) != 0 ? hbp0.f89568a : jbp0Var, b791Var, b791Var2, b791Var3, xx7Var, list, list2, z4, z5, f, b791Var4, b791Var5, b791Var6, (i7 & 262144) != 0 ? b791Var6.f24196b.f204175b : str, (i7 & 524288) != 0 ? b791Var6.f24196b.f204181h : str2, (i7 & 1048576) != 0 ? b791Var4 : b791Var7, h2r0Var, (i7 & 4194304) != 0 ? false : z6, i, i2, list3, arrayList, i3, i4, (i7 & 536870912) != 0 ? 25 : i5, onl0.f167287a, null, null, null, null, f2, f3, i6, z7, z8, str3, z9, b791Var8, (i8 & 2048) != 0 ? null : num, (i8 & 4096) != 0 ? new xjf0() : xjf0Var, z10, null, null);
    }
}
