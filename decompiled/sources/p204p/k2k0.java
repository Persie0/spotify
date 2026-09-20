package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class k2k0 extends erg1 {

    /* JADX INFO: renamed from: c */
    public final atj0 f118657c;

    /* JADX INFO: renamed from: d */
    public final String f118658d;

    /* JADX INFO: renamed from: e */
    public final String f118659e;

    /* JADX INFO: renamed from: f */
    public final String f118660f;

    /* JADX INFO: renamed from: g */
    public final List f118661g;

    /* JADX INFO: renamed from: h */
    public final wdt0 f118662h;

    public k2k0(atj0 atj0Var, String str, String str2, String str3, List list, wdt0 wdt0Var) {
        this.f118657c = atj0Var;
        this.f118658d = str;
        this.f118659e = str2;
        this.f118660f = str3;
        this.f118661g = list;
        this.f118662h = wdt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2k0)) {
            return false;
        }
        k2k0 k2k0Var = (k2k0) obj;
        return wj50.m88271j(this.f118657c, k2k0Var.f118657c) && wj50.m88271j(this.f118658d, k2k0Var.f118658d) && wj50.m88271j(this.f118659e, k2k0Var.f118659e) && wj50.m88271j(this.f118660f, k2k0Var.f118660f) && wj50.m88271j(this.f118661g, k2k0Var.f118661g) && wj50.m88271j(this.f118662h, k2k0Var.f118662h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f118657c.hashCode() * 31, 31, this.f118658d);
        String str = this.f118659e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f118660f;
        return this.f118662h.hashCode() + s571.m77244c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f118661g);
    }

    @Override // p204p.erg1
    /* JADX INFO: renamed from: q */
    public final wdt0 mo39808q() {
        return this.f118662h;
    }
}
