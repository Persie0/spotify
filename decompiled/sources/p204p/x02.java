package p204p;

import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel$Format;
import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel$Product;

/* JADX INFO: loaded from: classes9.dex */
public final class x02 implements gh0 {

    /* JADX INFO: renamed from: L0 */
    public final String f256752L0;

    /* JADX INFO: renamed from: M0 */
    public final r4x0 f256753M0;

    /* JADX INFO: renamed from: N0 */
    public final lr20 f256754N0;

    /* JADX INFO: renamed from: O0 */
    public final int f256755O0;

    /* JADX INFO: renamed from: P0 */
    public final AdsModeModel$Format f256756P0;

    /* JADX INFO: renamed from: Q0 */
    public final AdsModeModel$Product f256757Q0;

    /* JADX INFO: renamed from: R0 */
    public final boolean f256758R0;

    /* JADX INFO: renamed from: S0 */
    public final hu0 f256759S0;

    /* JADX INFO: renamed from: T0 */
    public final String f256760T0;

    /* JADX INFO: renamed from: X */
    public final String f256761X;

    /* JADX INFO: renamed from: Y */
    public final int f256762Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC1861fi f256763Z;

    /* JADX INFO: renamed from: a */
    public final long f256764a;

    /* JADX INFO: renamed from: b */
    public final String f256765b;

    /* JADX INFO: renamed from: c */
    public final String f256766c;

    /* JADX INFO: renamed from: d */
    public final String f256767d;

    /* JADX INFO: renamed from: e */
    public final String f256768e;

    /* JADX INFO: renamed from: f */
    public final String f256769f;

    /* JADX INFO: renamed from: g */
    public final String f256770g;

    /* JADX INFO: renamed from: h */
    public final String f256771h;

    /* JADX INFO: renamed from: i */
    public final String f256772i;

    /* JADX INFO: renamed from: t */
    public final String f256773t;

    public x02(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, AbstractC1861fi abstractC1861fi, String str11, r4x0 r4x0Var, lr20 lr20Var, int i2, AdsModeModel$Format adsModeModel$Format, AdsModeModel$Product adsModeModel$Product, boolean z, hu0 hu0Var, String str12) {
        this.f256764a = j;
        this.f256765b = str;
        this.f256766c = str2;
        this.f256767d = str3;
        this.f256768e = str4;
        this.f256769f = str5;
        this.f256770g = str6;
        this.f256771h = str7;
        this.f256772i = str8;
        this.f256773t = str9;
        this.f256761X = str10;
        this.f256762Y = i;
        this.f256763Z = abstractC1861fi;
        this.f256752L0 = str11;
        this.f256753M0 = r4x0Var;
        this.f256754N0 = lr20Var;
        this.f256755O0 = i2;
        this.f256756P0 = adsModeModel$Format;
        this.f256757Q0 = adsModeModel$Product;
        this.f256758R0 = z;
        this.f256759S0 = hu0Var;
        this.f256760T0 = str12;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        return this.f256773t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x02)) {
            return false;
        }
        x02 x02Var = (x02) obj;
        return this.f256764a == x02Var.f256764a && this.f256765b.equals(x02Var.f256765b) && wj50.m88271j(this.f256766c, x02Var.f256766c) && this.f256767d.equals(x02Var.f256767d) && this.f256768e.equals(x02Var.f256768e) && this.f256769f.equals(x02Var.f256769f) && this.f256770g.equals(x02Var.f256770g) && wj50.m88271j(this.f256771h, x02Var.f256771h) && wj50.m88271j(this.f256772i, x02Var.f256772i) && wj50.m88271j(this.f256773t, x02Var.f256773t) && wj50.m88271j(this.f256761X, x02Var.f256761X) && this.f256762Y == x02Var.f256762Y && this.f256763Z.equals(x02Var.f256763Z) && this.f256752L0.equals(x02Var.f256752L0) && this.f256753M0.equals(x02Var.f256753M0) && this.f256754N0.equals(x02Var.f256754N0) && this.f256755O0 == x02Var.f256755O0 && this.f256756P0 == x02Var.f256756P0 && this.f256757Q0 == x02Var.f256757Q0 && this.f256758R0 == x02Var.f256758R0 && this.f256759S0.equals(x02Var.f256759S0) && wj50.m88271j(this.f256760T0, x02Var.f256760T0);
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: h */
    public final String mo29282h() {
        return this.f256771h;
    }

    public final int hashCode() {
        return this.f256760T0.hashCode() + ((this.f256759S0.hashCode() + s571.m77245d((this.f256757Q0.hashCode() + ((this.f256756P0.hashCode() + f710.m40938f(this.f256755O0, (this.f256754N0.hashCode() + ((this.f256753M0.hashCode() + s571.m77243b((this.f256763Z.hashCode() + f710.m40938f(this.f256762Y, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(Long.hashCode(this.f256764a) * 31, 31, this.f256765b), 31, this.f256766c), 31, this.f256767d), 31, this.f256768e), 31, this.f256769f), 31, this.f256770g), 31, this.f256771h), 31, this.f256772i), 31, this.f256773t), 31, this.f256761X), 31)) * 31, 31, this.f256752L0)) * 31)) * 31, 31)) * 31)) * 31, 31, this.f256758R0)) * 31);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        return this.f256761X;
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: k */
    public final String mo29284k() {
        return this.f256765b;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        return this.f256772i;
    }
}
