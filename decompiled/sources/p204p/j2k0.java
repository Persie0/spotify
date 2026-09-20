package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class j2k0 extends erg1 {

    /* JADX INFO: renamed from: c */
    public final atj0 f108098c;

    /* JADX INFO: renamed from: d */
    public final List f108099d;

    /* JADX INFO: renamed from: e */
    public final wdt0 f108100e;

    public j2k0(atj0 atj0Var, List list, wdt0 wdt0Var) {
        this.f108098c = atj0Var;
        this.f108099d = list;
        this.f108100e = wdt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2k0)) {
            return false;
        }
        j2k0 j2k0Var = (j2k0) obj;
        return wj50.m88271j(this.f108098c, j2k0Var.f108098c) && wj50.m88271j(this.f108099d, j2k0Var.f108099d) && wj50.m88271j(this.f108100e, j2k0Var.f108100e);
    }

    public final int hashCode() {
        return this.f108100e.hashCode() + s571.m77244c(this.f108098c.hashCode() * 31, 31, this.f108099d);
    }

    @Override // p204p.erg1
    /* JADX INFO: renamed from: q */
    public final wdt0 mo39808q() {
        return this.f108100e;
    }
}
