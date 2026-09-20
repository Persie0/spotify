package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class s6f0 {

    /* JADX INFO: renamed from: a */
    public final String f206119a;

    /* JADX INFO: renamed from: b */
    public final Map f206120b;

    /* JADX INFO: renamed from: c */
    public final hpx f206121c;

    public s6f0(String str, Map map, hpx hpxVar) {
        this.f206119a = str;
        this.f206120b = map;
        this.f206121c = hpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6f0)) {
            return false;
        }
        s6f0 s6f0Var = (s6f0) obj;
        return wj50.m88271j(this.f206119a, s6f0Var.f206119a) && wj50.m88271j(this.f206120b, s6f0Var.f206120b) && wj50.m88271j(this.f206121c, s6f0Var.f206121c);
    }

    public final int hashCode() {
        return this.f206121c.f93852a.hashCode() + edb.m38557f(this.f206119a.hashCode() * 31, 31, this.f206120b);
    }
}
