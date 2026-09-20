package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oqx0 implements arx0 {

    /* JADX INFO: renamed from: a */
    public final String f168398a;

    /* JADX INFO: renamed from: b */
    public final String f168399b;

    public oqx0(String str, String str2) {
        this.f168398a = str;
        this.f168399b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqx0)) {
            return false;
        }
        oqx0 oqx0Var = (oqx0) obj;
        return wj50.m88271j(this.f168398a, oqx0Var.f168398a) && wj50.m88271j(this.f168399b, oqx0Var.f168399b);
    }

    @Override // p204p.arx0
    public final String getId() {
        return this.f168399b;
    }

    public final int hashCode() {
        return this.f168399b.hashCode() + (this.f168398a.hashCode() * 31);
    }
}
