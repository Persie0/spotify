package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class yi60 {

    /* JADX INFO: renamed from: a */
    public final cx50 f273047a;

    /* JADX INFO: renamed from: b */
    public final wj60 f273048b;

    /* JADX INFO: renamed from: c */
    public final boolean f273049c;

    /* JADX INFO: renamed from: d */
    public final String f273050d;

    /* JADX INFO: renamed from: e */
    public final String f273051e;

    /* JADX INFO: renamed from: f */
    public final boolean f273052f;

    /* JADX INFO: renamed from: g */
    public final wwu f273053g;

    /* JADX INFO: renamed from: h */
    public final Set f273054h;

    public yi60(cx50 cx50Var, wj60 wj60Var, boolean z, String str, String str2, boolean z2, wwu wwuVar, Set set) {
        this.f273047a = cx50Var;
        this.f273048b = wj60Var;
        this.f273049c = z;
        this.f273050d = str;
        this.f273051e = str2;
        this.f273052f = z2;
        this.f273053g = wwuVar;
        this.f273054h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi60)) {
            return false;
        }
        yi60 yi60Var = (yi60) obj;
        return wj50.m88271j(this.f273047a, yi60Var.f273047a) && this.f273048b == yi60Var.f273048b && this.f273049c == yi60Var.f273049c && wj50.m88271j(this.f273050d, yi60Var.f273050d) && wj50.m88271j(this.f273051e, yi60Var.f273051e) && this.f273052f == yi60Var.f273052f && wj50.m88271j(this.f273053g, yi60Var.f273053g) && wj50.m88271j(this.f273054h, yi60Var.f273054h);
    }

    public final int hashCode() {
        return this.f273054h.hashCode() + ((this.f273053g.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77245d((this.f273048b.hashCode() + (this.f273047a.hashCode() * 31)) * 31, 31, this.f273049c), 31, this.f273050d), 31, this.f273051e), 31, this.f273052f)) * 31);
    }
}
