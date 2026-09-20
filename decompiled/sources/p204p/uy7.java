package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uy7 extends g4l {

    /* JADX INFO: renamed from: b */
    public final String f235191b;

    /* JADX INFO: renamed from: c */
    public final String f235192c;

    /* JADX INFO: renamed from: d */
    public final int f235193d;

    /* JADX INFO: renamed from: e */
    public final String f235194e;

    /* JADX INFO: renamed from: f */
    public final String f235195f;

    /* JADX INFO: renamed from: g */
    public final String f235196g;

    /* JADX INFO: renamed from: h */
    public final String f235197h;

    /* JADX INFO: renamed from: i */
    public final String f235198i;

    /* JADX INFO: renamed from: j */
    public final String f235199j;

    /* JADX INFO: renamed from: k */
    public final f4l f235200k;

    /* JADX INFO: renamed from: l */
    public final l3l f235201l;

    /* JADX INFO: renamed from: m */
    public final i3l f235202m;

    public uy7(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, f4l f4lVar, l3l l3lVar, i3l i3lVar) {
        this.f235191b = str;
        this.f235192c = str2;
        this.f235193d = i;
        this.f235194e = str3;
        this.f235195f = str4;
        this.f235196g = str5;
        this.f235197h = str6;
        this.f235198i = str7;
        this.f235199j = str8;
        this.f235200k = f4lVar;
        this.f235201l = l3lVar;
        this.f235202m = i3lVar;
    }

    @Override // p204p.g4l
    /* JADX INFO: renamed from: a */
    public final ty7 mo43536a() {
        ty7 ty7Var = new ty7();
        ty7Var.f224856a = this.f235191b;
        ty7Var.f224857b = this.f235192c;
        ty7Var.f224858c = this.f235193d;
        ty7Var.f224859d = this.f235194e;
        ty7Var.f224860e = this.f235195f;
        ty7Var.f224861f = this.f235196g;
        ty7Var.f224862g = this.f235197h;
        ty7Var.f224863h = this.f235198i;
        ty7Var.f224864i = this.f235199j;
        ty7Var.f224865j = this.f235200k;
        ty7Var.f224866k = this.f235201l;
        ty7Var.f224867l = this.f235202m;
        ty7Var.f224868m = (byte) 1;
        return ty7Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        f4l f4lVar;
        l3l l3lVar;
        i3l i3lVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g4l) {
            uy7 uy7Var = (uy7) ((g4l) obj);
            i3l i3lVar2 = uy7Var.f235202m;
            l3l l3lVar2 = uy7Var.f235201l;
            f4l f4lVar2 = uy7Var.f235200k;
            String str4 = uy7Var.f235197h;
            String str5 = uy7Var.f235196g;
            String str6 = uy7Var.f235195f;
            if (this.f235191b.equals(uy7Var.f235191b) && this.f235192c.equals(uy7Var.f235192c) && this.f235193d == uy7Var.f235193d && this.f235194e.equals(uy7Var.f235194e) && ((str = this.f235195f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f235196g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f235197h) != null ? str3.equals(str4) : str4 == null) && this.f235198i.equals(uy7Var.f235198i) && this.f235199j.equals(uy7Var.f235199j) && ((f4lVar = this.f235200k) != null ? f4lVar.equals(f4lVar2) : f4lVar2 == null) && ((l3lVar = this.f235201l) != null ? l3lVar.equals(l3lVar2) : l3lVar2 == null) && ((i3lVar = this.f235202m) != null ? i3lVar.equals(i3lVar2) : i3lVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f235191b.hashCode() ^ 1000003) * 1000003) ^ this.f235192c.hashCode()) * 1000003) ^ this.f235193d) * 1000003) ^ this.f235194e.hashCode()) * 1000003;
        String str = this.f235195f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f235196g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f235197h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f235198i.hashCode()) * 1000003) ^ this.f235199j.hashCode()) * 1000003;
        f4l f4lVar = this.f235200k;
        int iHashCode5 = (iHashCode4 ^ (f4lVar == null ? 0 : f4lVar.hashCode())) * 1000003;
        l3l l3lVar = this.f235201l;
        int iHashCode6 = (iHashCode5 ^ (l3lVar == null ? 0 : l3lVar.hashCode())) * 1000003;
        i3l i3lVar = this.f235202m;
        return iHashCode6 ^ (i3lVar != null ? i3lVar.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f235191b + ", gmpAppId=" + this.f235192c + ", platform=" + this.f235193d + ", installationUuid=" + this.f235194e + ", firebaseInstallationId=" + this.f235195f + ", firebaseAuthenticationToken=" + this.f235196g + ", appQualitySessionId=" + this.f235197h + ", buildVersion=" + this.f235198i + ", displayVersion=" + this.f235199j + ", session=" + this.f235200k + ", ndkPayload=" + this.f235201l + ", appExitInfo=" + this.f235202m + "}";
    }
}
