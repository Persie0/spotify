package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class g721 {

    /* JADX INFO: renamed from: a */
    public final String f77160a;

    /* JADX INFO: renamed from: b */
    public final String f77161b;

    /* JADX INFO: renamed from: c */
    public final String f77162c;

    /* JADX INFO: renamed from: d */
    public final Map f77163d;

    public g721(Map map, String str, String str2, String str3) {
        this.f77160a = str;
        this.f77161b = str2;
        this.f77162c = str3;
        this.f77163d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g721)) {
            return false;
        }
        g721 g721Var = (g721) obj;
        return wj50.m88271j(this.f77160a, g721Var.f77160a) && wj50.m88271j(this.f77161b, g721Var.f77161b) && wj50.m88271j(this.f77162c, g721Var.f77162c) && wj50.m88271j(this.f77163d, g721Var.f77163d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f77160a.hashCode() * 31, 31, this.f77161b);
        String str = this.f77162c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f77163d;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}
