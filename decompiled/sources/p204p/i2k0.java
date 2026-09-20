package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i2k0 extends erg1 {

    /* JADX INFO: renamed from: c */
    public final String f97859c;

    /* JADX INFO: renamed from: d */
    public final wdt0 f97860d;

    public i2k0(String str, wdt0 wdt0Var) {
        this.f97859c = str;
        this.f97860d = wdt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2k0)) {
            return false;
        }
        i2k0 i2k0Var = (i2k0) obj;
        return wj50.m88271j(this.f97859c, i2k0Var.f97859c) && wj50.m88271j(this.f97860d, i2k0Var.f97860d);
    }

    public final int hashCode() {
        return this.f97860d.hashCode() + (this.f97859c.hashCode() * 31);
    }

    @Override // p204p.erg1
    /* JADX INFO: renamed from: q */
    public final wdt0 mo39808q() {
        return this.f97860d;
    }
}
