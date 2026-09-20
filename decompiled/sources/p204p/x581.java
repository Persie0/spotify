package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x581 {

    /* JADX INFO: renamed from: a */
    public final String f258328a;

    /* JADX INFO: renamed from: b */
    public final String f258329b;

    /* JADX INFO: renamed from: c */
    public final String f258330c;

    /* JADX INFO: renamed from: d */
    public final String f258331d;

    /* JADX INFO: renamed from: e */
    public final gkk f258332e;

    /* JADX INFO: renamed from: f */
    public final Integer f258333f;

    public x581(String str, String str2, String str3, String str4, gkk gkkVar, Integer num) {
        this.f258328a = str;
        this.f258329b = str2;
        this.f258330c = str3;
        this.f258331d = str4;
        this.f258332e = gkkVar;
        this.f258333f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x581)) {
            return false;
        }
        x581 x581Var = (x581) obj;
        return wj50.m88271j(this.f258328a, x581Var.f258328a) && wj50.m88271j(this.f258329b, x581Var.f258329b) && wj50.m88271j(this.f258330c, x581Var.f258330c) && wj50.m88271j(this.f258331d, x581Var.f258331d) && this.f258332e == x581Var.f258332e && wj50.m88271j(this.f258333f, x581Var.f258333f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f258328a.hashCode() * 31, 31, this.f258329b), 31, this.f258330c), 31, this.f258331d);
        gkk gkkVar = this.f258332e;
        int iHashCode = (iM77243b + (gkkVar == null ? 0 : gkkVar.hashCode())) * 31;
        Integer num = this.f258333f;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
