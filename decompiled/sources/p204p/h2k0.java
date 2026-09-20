package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class h2k0 extends erg1 {

    /* JADX INFO: renamed from: c */
    public final atj0 f87016c;

    /* JADX INFO: renamed from: d */
    public final esz0 f87017d;

    /* JADX INFO: renamed from: e */
    public final e8d0 f87018e;

    /* JADX INFO: renamed from: f */
    public final String f87019f;

    /* JADX INFO: renamed from: g */
    public final l720 f87020g;

    /* JADX INFO: renamed from: h */
    public final List f87021h;

    /* JADX INFO: renamed from: i */
    public final String f87022i;

    /* JADX INFO: renamed from: j */
    public final wdt0 f87023j;

    public h2k0(atj0 atj0Var, esz0 esz0Var, e8d0 e8d0Var, String str, l720 l720Var, List list, String str2, wdt0 wdt0Var) {
        this.f87016c = atj0Var;
        this.f87017d = esz0Var;
        this.f87018e = e8d0Var;
        this.f87019f = str;
        this.f87020g = l720Var;
        this.f87021h = list;
        this.f87022i = str2;
        this.f87023j = wdt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2k0)) {
            return false;
        }
        h2k0 h2k0Var = (h2k0) obj;
        return wj50.m88271j(this.f87016c, h2k0Var.f87016c) && wj50.m88271j(this.f87017d, h2k0Var.f87017d) && wj50.m88271j(this.f87018e, h2k0Var.f87018e) && wj50.m88271j(this.f87019f, h2k0Var.f87019f) && wj50.m88271j(this.f87020g, h2k0Var.f87020g) && wj50.m88271j(this.f87021h, h2k0Var.f87021h) && wj50.m88271j(this.f87022i, h2k0Var.f87022i) && wj50.m88271j(this.f87023j, h2k0Var.f87023j);
    }

    public final int hashCode() {
        int iHashCode = (this.f87017d.hashCode() + (this.f87016c.hashCode() * 31)) * 31;
        e8d0 e8d0Var = this.f87018e;
        int iM77243b = s571.m77243b((iHashCode + (e8d0Var == null ? 0 : e8d0Var.hashCode())) * 31, 31, this.f87019f);
        l720 l720Var = this.f87020g;
        int iM77244c = s571.m77244c((iM77243b + (l720Var == null ? 0 : l720Var.hashCode())) * 31, 31, this.f87021h);
        String str = this.f87022i;
        return this.f87023j.hashCode() + ((iM77244c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p204p.erg1
    /* JADX INFO: renamed from: q */
    public final wdt0 mo39808q() {
        return this.f87023j;
    }
}
