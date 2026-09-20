package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ji11 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f112606a;

    /* JADX INFO: renamed from: b */
    public final Map f112607b;

    /* JADX INFO: renamed from: c */
    public final Set f112608c;

    public ji11(ebf0 ebf0Var, Map map, Set set) {
        this.f112606a = ebf0Var;
        this.f112607b = map;
        this.f112608c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji11)) {
            return false;
        }
        ji11 ji11Var = (ji11) obj;
        return wj50.m88271j(this.f112606a, ji11Var.f112606a) && wj50.m88271j(this.f112607b, ji11Var.f112607b) && wj50.m88271j(this.f112608c, ji11Var.f112608c);
    }

    public final int hashCode() {
        ebf0 ebf0Var = this.f112606a;
        int iHashCode = (ebf0Var == null ? 0 : ebf0Var.f57921a.hashCode()) * 31;
        Map map = this.f112607b;
        return this.f112608c.hashCode() + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
    }
}
