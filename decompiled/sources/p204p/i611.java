package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class i611 {

    /* JADX INFO: renamed from: a */
    public final String f99069a;

    /* JADX INFO: renamed from: b */
    public final String f99070b;

    /* JADX INFO: renamed from: c */
    public final j1b1 f99071c;

    /* JADX INFO: renamed from: d */
    public final Map f99072d;

    /* JADX INFO: renamed from: e */
    public final String f99073e;

    /* JADX INFO: renamed from: f */
    public final im80 f99074f;

    public /* synthetic */ i611(String str, String str2, j1b1 j1b1Var, Map map, String str3) {
        this(str, str2, j1b1Var, map, str3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i611)) {
            return false;
        }
        i611 i611Var = (i611) obj;
        return wj50.m88271j(this.f99069a, i611Var.f99069a) && wj50.m88271j(this.f99070b, i611Var.f99070b) && wj50.m88271j(this.f99071c, i611Var.f99071c) && wj50.m88271j(this.f99072d, i611Var.f99072d) && wj50.m88271j(this.f99073e, i611Var.f99073e) && wj50.m88271j(this.f99074f, i611Var.f99074f);
    }

    public final int hashCode() {
        int iHashCode = this.f99069a.hashCode() * 31;
        String str = this.f99070b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        j1b1 j1b1Var = this.f99071c;
        int iM38557f = edb.m38557f((iHashCode2 + (j1b1Var == null ? 0 : j1b1Var.hashCode())) * 31, 31, this.f99072d);
        String str2 = this.f99073e;
        int iHashCode3 = (iM38557f + (str2 == null ? 0 : str2.hashCode())) * 31;
        im80 im80Var = this.f99074f;
        return iHashCode3 + (im80Var != null ? im80Var.hashCode() : 0);
    }

    public i611(String str, String str2, j1b1 j1b1Var, Map map, String str3, im80 im80Var) {
        this.f99069a = str;
        this.f99070b = str2;
        this.f99071c = j1b1Var;
        this.f99072d = map;
        this.f99073e = str3;
        this.f99074f = im80Var;
    }
}
