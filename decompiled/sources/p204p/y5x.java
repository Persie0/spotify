package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y5x {

    /* JADX INFO: renamed from: a */
    public final z5x f269560a;

    /* JADX INFO: renamed from: b */
    public final String f269561b;

    /* JADX INFO: renamed from: c */
    public final z5x f269562c;

    /* JADX INFO: renamed from: d */
    public final Integer f269563d;

    /* JADX INFO: renamed from: e */
    public final String f269564e;

    /* JADX INFO: renamed from: f */
    public final z5x f269565f;

    /* JADX INFO: renamed from: g */
    public final Integer f269566g;

    /* JADX INFO: renamed from: h */
    public final String f269567h;

    public y5x(z5x z5xVar, String str, z5x z5xVar2, Integer num, String str2, z5x z5xVar3, Integer num2, String str3) {
        this.f269560a = z5xVar;
        this.f269561b = str;
        this.f269562c = z5xVar2;
        this.f269563d = num;
        this.f269564e = str2;
        this.f269565f = z5xVar3;
        this.f269566g = num2;
        this.f269567h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5x)) {
            return false;
        }
        y5x y5xVar = (y5x) obj;
        return this.f269560a == y5xVar.f269560a && wj50.m88271j(this.f269561b, y5xVar.f269561b) && this.f269562c == y5xVar.f269562c && wj50.m88271j(this.f269563d, y5xVar.f269563d) && wj50.m88271j(this.f269564e, y5xVar.f269564e) && this.f269565f == y5xVar.f269565f && wj50.m88271j(this.f269566g, y5xVar.f269566g) && wj50.m88271j(this.f269567h, y5xVar.f269567h);
    }

    public final int hashCode() {
        z5x z5xVar = this.f269560a;
        int iHashCode = (z5xVar == null ? 0 : z5xVar.hashCode()) * 31;
        String str = this.f269561b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        z5x z5xVar2 = this.f269562c;
        int iHashCode3 = (iHashCode2 + (z5xVar2 == null ? 0 : z5xVar2.hashCode())) * 31;
        Integer num = this.f269563d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f269564e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        z5x z5xVar3 = this.f269565f;
        int iHashCode6 = (iHashCode5 + (z5xVar3 == null ? 0 : z5xVar3.hashCode())) * 31;
        Integer num2 = this.f269566g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f269567h;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ y5x(z5x z5xVar, String str, z5x z5xVar2, String str2, int i) {
        this(z5xVar, str, (i & 4) != 0 ? null : z5xVar2, null, (i & 16) != 0 ? null : str2, null, null, null);
    }
}
