package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class m2k0 extends erg1 {

    /* JADX INFO: renamed from: c */
    public final atj0 f139374c;

    /* JADX INFO: renamed from: d */
    public final String f139375d;

    /* JADX INFO: renamed from: e */
    public final List f139376e;

    /* JADX INFO: renamed from: f */
    public final wdt0 f139377f;

    public m2k0(atj0 atj0Var, String str, List list, wdt0 wdt0Var) {
        this.f139374c = atj0Var;
        this.f139375d = str;
        this.f139376e = list;
        this.f139377f = wdt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2k0)) {
            return false;
        }
        m2k0 m2k0Var = (m2k0) obj;
        return wj50.m88271j(this.f139374c, m2k0Var.f139374c) && wj50.m88271j(this.f139375d, m2k0Var.f139375d) && wj50.m88271j(this.f139376e, m2k0Var.f139376e) && wj50.m88271j(this.f139377f, m2k0Var.f139377f);
    }

    public final int hashCode() {
        int iHashCode = this.f139374c.hashCode() * 31;
        String str = this.f139375d;
        return this.f139377f.hashCode() + s571.m77244c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f139376e);
    }

    @Override // p204p.erg1
    /* JADX INFO: renamed from: q */
    public final wdt0 mo39808q() {
        return this.f139377f;
    }
}
