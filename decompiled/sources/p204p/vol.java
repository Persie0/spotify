package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class vol implements vwf {

    /* JADX INFO: renamed from: a */
    public final List f243496a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f243497b;

    /* JADX INFO: renamed from: c */
    public final String f243498c;

    /* JADX INFO: renamed from: d */
    public final String f243499d;

    /* JADX INFO: renamed from: e */
    public final rol f243500e;

    /* JADX INFO: renamed from: f */
    public final tol f243501f;

    /* JADX INFO: renamed from: g */
    public final String f243502g;

    public vol(ae50 ae50Var, ArrayList arrayList, String str, String str2, rol rolVar, tol tolVar, String str3) {
        this.f243496a = ae50Var;
        this.f243497b = arrayList;
        this.f243498c = str;
        this.f243499d = str2;
        this.f243500e = rolVar;
        this.f243501f = tolVar;
        this.f243502g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vol)) {
            return false;
        }
        vol volVar = (vol) obj;
        return wj50.m88271j(this.f243496a, volVar.f243496a) && this.f243497b.equals(volVar.f243497b) && wj50.m88271j(this.f243498c, volVar.f243498c) && wj50.m88271j(this.f243499d, volVar.f243499d) && wj50.m88271j(this.f243500e, volVar.f243500e) && this.f243501f.equals(volVar.f243501f) && wj50.m88271j(this.f243502g, volVar.f243502g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(lq51.m59700f(this.f243497b, this.f243496a.hashCode() * 31, 31), 31, this.f243498c), 31, this.f243499d);
        rol rolVar = this.f243500e;
        return this.f243502g.hashCode() + ((this.f243501f.hashCode() + ((iM77243b + (rolVar == null ? 0 : rolVar.hashCode())) * 31)) * 31);
    }
}
