package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class fs01 {

    /* JADX INFO: renamed from: a */
    public final dr01 f72720a;

    /* JADX INFO: renamed from: b */
    public final String f72721b;

    /* JADX INFO: renamed from: c */
    public final Map f72722c;

    public fs01(dr01 dr01Var, String str, Map map) {
        this.f72720a = dr01Var;
        this.f72721b = str;
        this.f72722c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs01)) {
            return false;
        }
        fs01 fs01Var = (fs01) obj;
        return wj50.m88271j(this.f72720a, fs01Var.f72720a) && wj50.m88271j(this.f72721b, fs01Var.f72721b) && wj50.m88271j(this.f72722c, fs01Var.f72722c);
    }

    public final int hashCode() {
        int iHashCode = this.f72720a.hashCode() * 31;
        String str = this.f72721b;
        return this.f72722c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
