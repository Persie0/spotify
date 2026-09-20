package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fy7 {

    /* JADX INFO: renamed from: a */
    public final String f74535a;

    /* JADX INFO: renamed from: b */
    public final Map f74536b;

    /* JADX INFO: renamed from: c */
    public final List f74537c;

    /* JADX INFO: renamed from: d */
    public final cke f74538d;

    public fy7(String str, Map map, List list, cke ckeVar) {
        if (str == null) {
            throw new NullPointerException("Null authid");
        }
        this.f74535a = str;
        this.f74536b = map;
        if (list == null) {
            throw new NullPointerException("Null authMethods");
        }
        this.f74537c = list;
        this.f74538d = ckeVar;
    }

    public final boolean equals(Object obj) {
        Map map;
        cke ckeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fy7) {
            fy7 fy7Var = (fy7) obj;
            cke ckeVar2 = fy7Var.f74538d;
            Map map2 = fy7Var.f74536b;
            if (this.f74535a.equals(fy7Var.f74535a) && ((map = this.f74536b) != null ? map.equals(map2) : map2 == null) && this.f74537c.equals(fy7Var.f74537c) && ((ckeVar = this.f74538d) != null ? ckeVar.equals(ckeVar2) : ckeVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f74535a.hashCode() ^ 1000003) * 1000003;
        Map map = this.f74536b;
        int iHashCode2 = (((iHashCode ^ (map == null ? 0 : map.hashCode())) * 1000003) ^ this.f74537c.hashCode()) * 1000003;
        cke ckeVar = this.f74538d;
        return iHashCode2 ^ (ckeVar != null ? ckeVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f74536b);
        return klh.m56837i(edb.m38573v("AuthDetails{authid=", this.f74535a, ", extras=", strValueOf, ", authMethods="), String.valueOf(this.f74537c), ", clientIdentity=", String.valueOf(this.f74538d), "}");
    }
}
