package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gye implements jye {

    /* JADX INFO: renamed from: a */
    public final String f85560a;

    /* JADX INFO: renamed from: b */
    public final String f85561b;

    /* JADX INFO: renamed from: c */
    public final String f85562c;

    /* JADX INFO: renamed from: d */
    public final int f85563d;

    /* JADX INFO: renamed from: e */
    public final String f85564e;

    /* JADX INFO: renamed from: f */
    public final boolean f85565f;

    /* JADX INFO: renamed from: g */
    public final n6f f85566g;

    public gye(String str, String str2, String str3, int i, String str4, boolean z, n6f n6fVar) {
        this.f85560a = str;
        this.f85561b = str2;
        this.f85562c = str3;
        this.f85563d = i;
        this.f85564e = str4;
        this.f85565f = z;
        this.f85566g = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gye)) {
            return false;
        }
        gye gyeVar = (gye) obj;
        return wj50.m88271j(this.f85560a, gyeVar.f85560a) && wj50.m88271j(this.f85561b, gyeVar.f85561b) && wj50.m88271j(this.f85562c, gyeVar.f85562c) && this.f85563d == gyeVar.f85563d && wj50.m88271j(this.f85564e, gyeVar.f85564e) && this.f85565f == gyeVar.f85565f && wj50.m88271j(this.f85566g, gyeVar.f85566g);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f85563d, s571.m77243b(s571.m77243b(this.f85560a.hashCode() * 31, 31, this.f85561b), 31, this.f85562c), 31);
        String str = this.f85564e;
        int iM77245d = s571.m77245d((iM62800g + (str == null ? 0 : str.hashCode())) * 31, 31, this.f85565f);
        n6f n6fVar = this.f85566g;
        return iM77245d + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }
}
