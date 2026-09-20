package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gqi {

    /* JADX INFO: renamed from: a */
    public final String f83479a;

    /* JADX INFO: renamed from: b */
    public final String f83480b;

    /* JADX INFO: renamed from: c */
    public final String f83481c;

    /* JADX INFO: renamed from: d */
    public final int f83482d;

    /* JADX INFO: renamed from: e */
    public final int f83483e;

    public gqi(int i, int i2, String str, String str2, String str3) {
        this.f83479a = str;
        this.f83480b = str2;
        this.f83481c = str3;
        this.f83482d = i;
        this.f83483e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqi)) {
            return false;
        }
        gqi gqiVar = (gqi) obj;
        return wj50.m88271j(this.f83479a, gqiVar.f83479a) && wj50.m88271j(this.f83480b, gqiVar.f83480b) && wj50.m88271j(this.f83481c, gqiVar.f83481c) && this.f83482d == gqiVar.f83482d && this.f83483e == gqiVar.f83483e;
    }

    public final int hashCode() {
        String str = this.f83479a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f83480b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83481c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        int i = this.f83482d;
        int iM38547C = (iHashCode3 + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        int i2 = this.f83483e;
        return iM38547C + (i2 != 0 ? edb.m38547C(i2) : 0);
    }
}
