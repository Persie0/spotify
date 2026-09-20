package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class l2k0 extends erg1 {

    /* JADX INFO: renamed from: c */
    public final atj0 f129029c;

    /* JADX INFO: renamed from: d */
    public final String f129030d;

    /* JADX INFO: renamed from: e */
    public final List f129031e;

    /* JADX INFO: renamed from: f */
    public final wdt0 f129032f;

    public l2k0(atj0 atj0Var, String str, List list, wdt0 wdt0Var) {
        this.f129029c = atj0Var;
        this.f129030d = str;
        this.f129031e = list;
        this.f129032f = wdt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2k0)) {
            return false;
        }
        l2k0 l2k0Var = (l2k0) obj;
        return wj50.m88271j(this.f129029c, l2k0Var.f129029c) && wj50.m88271j(this.f129030d, l2k0Var.f129030d) && wj50.m88271j(this.f129031e, l2k0Var.f129031e) && wj50.m88271j(this.f129032f, l2k0Var.f129032f);
    }

    public final int hashCode() {
        return this.f129032f.hashCode() + s571.m77244c(s571.m77243b(this.f129029c.hashCode() * 31, 31, this.f129030d), 31, this.f129031e);
    }

    @Override // p204p.erg1
    /* JADX INFO: renamed from: q */
    public final wdt0 mo39808q() {
        return this.f129032f;
    }
}
