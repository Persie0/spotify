package p204p;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class vq7 {

    /* JADX INFO: renamed from: a */
    public final String f243884a;

    /* JADX INFO: renamed from: b */
    public final int f243885b;

    /* JADX INFO: renamed from: c */
    public final String f243886c;

    /* JADX INFO: renamed from: d */
    public final cke f243887d;

    /* JADX INFO: renamed from: e */
    public final String f243888e;

    /* JADX INFO: renamed from: f */
    public final List f243889f;

    /* JADX INFO: renamed from: g */
    public final v2m0 f243890g;

    /* JADX INFO: renamed from: h */
    public final boolean f243891h;

    /* JADX INFO: renamed from: i */
    public final String f243892i;

    /* JADX INFO: renamed from: j */
    public final String f243893j;

    /* JADX INFO: renamed from: k */
    public final String f243894k;

    /* JADX INFO: renamed from: l */
    public final String f243895l;

    public vq7(String str, int i, String str2, cke ckeVar, String str3, List list, v2m0 v2m0Var, boolean z, String str4, String str5, String str6, String str7) {
        this.f243884a = str;
        this.f243885b = i;
        this.f243886c = str2;
        this.f243887d = ckeVar;
        this.f243888e = str3;
        this.f243889f = list;
        this.f243890g = v2m0Var;
        this.f243891h = z;
        this.f243892i = str4;
        this.f243893j = str5;
        this.f243894k = str6;
        this.f243895l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq7)) {
            return false;
        }
        vq7 vq7Var = (vq7) obj;
        return wj50.m88271j(this.f243884a, vq7Var.f243884a) && this.f243885b == vq7Var.f243885b && wj50.m88271j(this.f243886c, vq7Var.f243886c) && wj50.m88271j(this.f243887d, vq7Var.f243887d) && wj50.m88271j(this.f243888e, vq7Var.f243888e) && wj50.m88271j(this.f243889f, vq7Var.f243889f) && wj50.m88271j(this.f243890g, vq7Var.f243890g) && this.f243891h == vq7Var.f243891h && wj50.m88271j(this.f243892i, vq7Var.f243892i) && wj50.m88271j(this.f243893j, vq7Var.f243893j) && wj50.m88271j(this.f243894k, vq7Var.f243894k) && wj50.m88271j(this.f243895l, vq7Var.f243895l);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(f710.m40938f(this.f243885b, this.f243884a.hashCode() * 31, 31), 31, this.f243886c);
        cke ckeVar = this.f243887d;
        int iM77244c = s571.m77244c(s571.m77243b((iM77243b + (ckeVar == null ? 0 : ckeVar.hashCode())) * 31, 31, this.f243888e), 31, this.f243889f);
        v2m0 v2m0Var = this.f243890g;
        int iM77245d = s571.m77245d((iM77244c + (v2m0Var == null ? 0 : v2m0Var.hashCode())) * 31, 31, this.f243891h);
        String str = this.f243892i;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f243893j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f243894k;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f243895l;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ vq7(String str, int i, String str2, cke ckeVar, String str3, List list, boolean z, int i2) {
        this(str, i, str2, ckeVar, (i2 & 16) != 0 ? UUID.randomUUID().toString() : str3, list, null, (i2 & 128) != 0 ? false : z, null, null, null, null);
    }
}
