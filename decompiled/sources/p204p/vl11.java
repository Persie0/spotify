package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;

/* JADX INFO: loaded from: classes2.dex */
public final class vl11 {

    /* JADX INFO: renamed from: a */
    public final int f242346a;

    /* JADX INFO: renamed from: b */
    public final bq11 f242347b;

    /* JADX INFO: renamed from: c */
    public final Boolean f242348c;

    /* JADX INFO: renamed from: d */
    public final Boolean f242349d;

    /* JADX INFO: renamed from: e */
    public final Boolean f242350e;

    /* JADX INFO: renamed from: f */
    public final Boolean f242351f;

    /* JADX INFO: renamed from: g */
    public final Boolean f242352g;

    /* JADX INFO: renamed from: h */
    public final gs31 f242353h;

    /* JADX INFO: renamed from: i */
    public final Boolean f242354i;

    /* JADX INFO: renamed from: j */
    public final Integer f242355j;

    /* JADX INFO: renamed from: k */
    public final Integer f242356k;

    /* JADX INFO: renamed from: l */
    public final Double f242357l;

    /* JADX INFO: renamed from: m */
    public final Integer f242358m;

    /* JADX INFO: renamed from: n */
    public final String f242359n;

    /* JADX INFO: renamed from: o */
    public final Integer f242360o;

    /* JADX INFO: renamed from: p */
    public final String f242361p;

    /* JADX INFO: renamed from: q */
    public final g5u0 f242362q;

    /* JADX INFO: renamed from: r */
    public final Boolean f242363r;

    public vl11(int i, bq11 bq11Var, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, gs31 gs31Var, Boolean bool6, Integer num, Integer num2, Double d, Integer num3, String str, Integer num4, String str2, g5u0 g5u0Var, Boolean bool7) {
        this.f242346a = i;
        this.f242347b = bq11Var;
        this.f242348c = bool;
        this.f242349d = bool2;
        this.f242350e = bool3;
        this.f242351f = bool4;
        this.f242352g = bool5;
        this.f242353h = gs31Var;
        this.f242354i = bool6;
        this.f242355j = num;
        this.f242356k = num2;
        this.f242357l = d;
        this.f242358m = num3;
        this.f242359n = str;
        this.f242360o = num4;
        this.f242361p = str2;
        this.f242362q = g5u0Var;
        this.f242363r = bool7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl11)) {
            return false;
        }
        vl11 vl11Var = (vl11) obj;
        return this.f242346a == vl11Var.f242346a && wj50.m88271j(this.f242347b, vl11Var.f242347b) && wj50.m88271j(this.f242348c, vl11Var.f242348c) && wj50.m88271j(this.f242349d, vl11Var.f242349d) && wj50.m88271j(this.f242350e, vl11Var.f242350e) && wj50.m88271j(this.f242351f, vl11Var.f242351f) && wj50.m88271j(this.f242352g, vl11Var.f242352g) && wj50.m88271j(this.f242353h, vl11Var.f242353h) && wj50.m88271j(this.f242354i, vl11Var.f242354i) && wj50.m88271j(this.f242355j, vl11Var.f242355j) && wj50.m88271j(this.f242356k, vl11Var.f242356k) && wj50.m88271j(this.f242357l, vl11Var.f242357l) && wj50.m88271j(this.f242358m, vl11Var.f242358m) && wj50.m88271j(this.f242359n, vl11Var.f242359n) && wj50.m88271j(this.f242360o, vl11Var.f242360o) && wj50.m88271j(this.f242361p, vl11Var.f242361p) && wj50.m88271j(this.f242362q, vl11Var.f242362q) && wj50.m88271j(this.f242363r, vl11Var.f242363r);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f242346a) * 31;
        bq11 bq11Var = this.f242347b;
        int iHashCode2 = (iHashCode + (bq11Var == null ? 0 : bq11Var.hashCode())) * 31;
        Boolean bool = this.f242348c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f242349d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f242350e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f242351f;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f242352g;
        int iHashCode7 = (iHashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        gs31 gs31Var = this.f242353h;
        int iHashCode8 = (iHashCode7 + (gs31Var == null ? 0 : gs31Var.hashCode())) * 31;
        Boolean bool6 = this.f242354i;
        int iHashCode9 = (iHashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num = this.f242355j;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f242356k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.f242357l;
        int iHashCode12 = (iHashCode11 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.f242358m;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f242359n;
        int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.f242360o;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.f242361p;
        int iHashCode16 = (iHashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        g5u0 g5u0Var = this.f242362q;
        int iHashCode17 = (iHashCode16 + (g5u0Var == null ? 0 : g5u0Var.hashCode())) * 31;
        Boolean bool7 = this.f242363r;
        return iHashCode17 + (bool7 != null ? bool7.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vl11(bq11 bq11Var, gs31 gs31Var, g5u0 g5u0Var, int i) {
        Boolean bool = Boolean.TRUE;
        this(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, bq11Var, (i & 4) != 0 ? null : bool, null, null, null, (i & 64) != 0 ? null : Boolean.FALSE, (i & 128) != 0 ? null : gs31Var, null, null, null, null, null, null, (i & 16384) != 0 ? null : 15, null, (65536 & i) != 0 ? null : g5u0Var, (i & 131072) != 0 ? null : bool);
    }
}
