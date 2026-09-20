package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class y3x0 {

    /* JADX INFO: renamed from: a */
    public final Map f268996a;

    /* JADX INFO: renamed from: b */
    public final List f268997b;

    /* JADX INFO: renamed from: c */
    public final pla1 f268998c;

    /* JADX INFO: renamed from: d */
    public final boolean f268999d;

    /* JADX INFO: renamed from: e */
    public final String f269000e;

    /* JADX INFO: renamed from: f */
    public final String f269001f;

    public y3x0(Map map, List list, pla1 pla1Var, boolean z, String str, String str2) {
        this.f268996a = map;
        this.f268997b = list;
        this.f268998c = pla1Var;
        this.f268999d = z;
        this.f269000e = str;
        this.f269001f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3x0)) {
            return false;
        }
        y3x0 y3x0Var = (y3x0) obj;
        return wj50.m88271j(this.f268996a, y3x0Var.f268996a) && wj50.m88271j(this.f268997b, y3x0Var.f268997b) && wj50.m88271j(this.f268998c, y3x0Var.f268998c) && this.f268999d == y3x0Var.f268999d && wj50.m88271j(this.f269000e, y3x0Var.f269000e) && wj50.m88271j(this.f269001f, y3x0Var.f269001f);
    }

    public final int hashCode() {
        int iHashCode = this.f268996a.hashCode() * 31;
        List list = this.f268997b;
        int iM77245d = s571.m77245d(ydj.m93448g(this.f268998c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.f268999d);
        String str = this.f269000e;
        int iHashCode2 = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f269001f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
