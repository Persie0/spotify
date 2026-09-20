package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lod {

    /* JADX INFO: renamed from: a */
    public final String f135395a;

    /* JADX INFO: renamed from: b */
    public final knd f135396b;

    /* JADX INFO: renamed from: c */
    public final boolean f135397c;

    /* JADX INFO: renamed from: d */
    public final boolean f135398d;

    /* JADX INFO: renamed from: e */
    public final abd f135399e;

    /* JADX INFO: renamed from: f */
    public final boolean f135400f;

    /* JADX INFO: renamed from: g */
    public final String f135401g;

    /* JADX INFO: renamed from: h */
    public final String f135402h;

    public lod(String str, knd kndVar, boolean z, abd abdVar, boolean z2, String str2, int i) {
        boolean z3 = (i & 8) == 0;
        abdVar = (i & 16) != 0 ? null : abdVar;
        z2 = (i & 32) != 0 ? false : z2;
        str2 = (i & 64) != 0 ? null : str2;
        String str3 = (i & 128) == 0 ? "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties" : null;
        this.f135395a = str;
        this.f135396b = kndVar;
        this.f135397c = z;
        this.f135398d = z3;
        this.f135399e = abdVar;
        this.f135400f = z2;
        this.f135401g = str2;
        this.f135402h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lod)) {
            return false;
        }
        lod lodVar = (lod) obj;
        return wj50.m88271j(this.f135395a, lodVar.f135395a) && this.f135396b == lodVar.f135396b && this.f135397c == lodVar.f135397c && this.f135398d == lodVar.f135398d && wj50.m88271j(this.f135399e, lodVar.f135399e) && this.f135400f == lodVar.f135400f && wj50.m88271j(this.f135401g, lodVar.f135401g) && wj50.m88271j(this.f135402h, lodVar.f135402h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f135396b.hashCode() + (this.f135395a.hashCode() * 31)) * 31, 31, this.f135397c), 31, this.f135398d);
        abd abdVar = this.f135399e;
        int iM77245d2 = s571.m77245d((iM77245d + (abdVar == null ? 0 : abdVar.hashCode())) * 31, 31, this.f135400f);
        String str = this.f135401g;
        int iHashCode = (iM77245d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f135402h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
