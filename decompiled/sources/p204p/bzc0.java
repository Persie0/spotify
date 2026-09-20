package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bzc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f32459a;

    /* JADX INFO: renamed from: b */
    public final String f32460b;

    /* JADX INFO: renamed from: c */
    public final String f32461c;

    /* JADX INFO: renamed from: d */
    public final String f32462d;

    /* JADX INFO: renamed from: e */
    public final String f32463e;

    /* JADX INFO: renamed from: f */
    public final int f32464f;

    public bzc0(String str, String str2, String str3, String str4, String str5, int i) {
        this.f32459a = str;
        this.f32460b = str2;
        this.f32461c = str3;
        this.f32462d = str4;
        this.f32463e = str5;
        this.f32464f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzc0)) {
            return false;
        }
        bzc0 bzc0Var = (bzc0) obj;
        return wj50.m88271j(this.f32459a, bzc0Var.f32459a) && wj50.m88271j(this.f32460b, bzc0Var.f32460b) && wj50.m88271j(this.f32461c, bzc0Var.f32461c) && wj50.m88271j(this.f32462d, bzc0Var.f32462d) && wj50.m88271j(this.f32463e, bzc0Var.f32463e) && this.f32464f == bzc0Var.f32464f;
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f32459a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f32459a.hashCode() * 961, 31, this.f32460b);
        String str = this.f32461c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32462d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f32463e;
        return Integer.hashCode(this.f32464f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
