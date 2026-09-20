package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class n2k0 extends erg1 {

    /* JADX INFO: renamed from: c */
    public final atj0 f149776c;

    /* JADX INFO: renamed from: d */
    public final String f149777d;

    /* JADX INFO: renamed from: e */
    public final String f149778e;

    /* JADX INFO: renamed from: f */
    public final String f149779f;

    /* JADX INFO: renamed from: g */
    public final String f149780g;

    /* JADX INFO: renamed from: h */
    public final String f149781h;

    /* JADX INFO: renamed from: i */
    public final List f149782i;

    /* JADX INFO: renamed from: j */
    public final wdt0 f149783j;

    public n2k0(atj0 atj0Var, String str, String str2, String str3, String str4, String str5, List list, wdt0 wdt0Var) {
        this.f149776c = atj0Var;
        this.f149777d = str;
        this.f149778e = str2;
        this.f149779f = str3;
        this.f149780g = str4;
        this.f149781h = str5;
        this.f149782i = list;
        this.f149783j = wdt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2k0)) {
            return false;
        }
        n2k0 n2k0Var = (n2k0) obj;
        return wj50.m88271j(this.f149776c, n2k0Var.f149776c) && wj50.m88271j(this.f149777d, n2k0Var.f149777d) && wj50.m88271j(this.f149778e, n2k0Var.f149778e) && wj50.m88271j(this.f149779f, n2k0Var.f149779f) && wj50.m88271j(this.f149780g, n2k0Var.f149780g) && wj50.m88271j(this.f149781h, n2k0Var.f149781h) && wj50.m88271j(this.f149782i, n2k0Var.f149782i) && wj50.m88271j(this.f149783j, n2k0Var.f149783j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f149776c.hashCode() * 31, 31, this.f149777d);
        String str = this.f149778e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f149779f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f149780g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f149781h;
        return this.f149783j.hashCode() + s571.m77244c((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f149782i);
    }

    @Override // p204p.erg1
    /* JADX INFO: renamed from: q */
    public final wdt0 mo39808q() {
        return this.f149783j;
    }
}
