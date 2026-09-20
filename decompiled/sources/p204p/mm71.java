package p204p;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class mm71 {

    /* JADX INFO: renamed from: a */
    public final UUID f145062a;

    /* JADX INFO: renamed from: b */
    public final String f145063b;

    /* JADX INFO: renamed from: c */
    public final Map f145064c;

    /* JADX INFO: renamed from: d */
    public final Map f145065d;

    /* JADX INFO: renamed from: e */
    public final Set f145066e;

    /* JADX INFO: renamed from: f */
    public final String f145067f;

    /* JADX INFO: renamed from: g */
    public final UUID f145068g;

    /* JADX INFO: renamed from: h */
    public final sm71 f145069h;

    public mm71(UUID uuid, String str, Map map, Map map2, Set set, String str2, UUID uuid2, sm71 sm71Var) {
        this.f145062a = uuid;
        this.f145063b = str;
        this.f145064c = map;
        this.f145065d = map2;
        this.f145066e = set;
        this.f145067f = str2;
        this.f145068g = uuid2;
        this.f145069h = sm71Var;
    }

    /* JADX INFO: renamed from: a */
    public static mm71 m62272a(mm71 mm71Var, Set set, UUID uuid, int i) {
        UUID uuid2 = mm71Var.f145062a;
        String str = mm71Var.f145063b;
        Map map = mm71Var.f145064c;
        Map map2 = mm71Var.f145065d;
        if ((i & 16) != 0) {
            set = mm71Var.f145066e;
        }
        Set set2 = set;
        String str2 = mm71Var.f145067f;
        if ((i & 64) != 0) {
            uuid = mm71Var.f145068g;
        }
        return new mm71(uuid2, str, map, map2, set2, str2, uuid, mm71Var.f145069h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm71)) {
            return false;
        }
        mm71 mm71Var = (mm71) obj;
        return wj50.m88271j(this.f145062a, mm71Var.f145062a) && wj50.m88271j(this.f145063b, mm71Var.f145063b) && wj50.m88271j(this.f145064c, mm71Var.f145064c) && wj50.m88271j(this.f145065d, mm71Var.f145065d) && wj50.m88271j(this.f145066e, mm71Var.f145066e) && wj50.m88271j(this.f145067f, mm71Var.f145067f) && wj50.m88271j(this.f145068g, mm71Var.f145068g) && wj50.m88271j(this.f145069h, mm71Var.f145069h);
    }

    public final int hashCode() {
        int iM56830b = klh.m56830b(edb.m38557f(edb.m38557f(s571.m77243b(this.f145062a.hashCode() * 31, 31, this.f145063b), 31, this.f145064c), 31, this.f145065d), 31, this.f145066e);
        String str = this.f145067f;
        int iHashCode = (iM56830b + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.f145068g;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 961;
        sm71 sm71Var = this.f145069h;
        return iHashCode2 + (sm71Var != null ? sm71Var.hashCode() : 0);
    }
}
