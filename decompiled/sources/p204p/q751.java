package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class q751 {

    /* JADX INFO: renamed from: a */
    public final xam f186034a;

    /* JADX INFO: renamed from: b */
    public final List f186035b;

    /* JADX INFO: renamed from: c */
    public final String f186036c;

    /* JADX INFO: renamed from: d */
    public final tdu f186037d;

    /* JADX INFO: renamed from: e */
    public final String f186038e;

    public q751(xam xamVar, List list, String str, tdu tduVar, String str2) {
        this.f186034a = xamVar;
        this.f186035b = list;
        this.f186036c = str;
        this.f186037d = tduVar;
        this.f186038e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static q751 m72287a(q751 q751Var, List list, String str, tdu tduVar, String str2, int i) {
        List list2 = list;
        xam xamVar = q751Var.f186034a;
        if ((i & 2) != 0) {
            list2 = q751Var.f186035b;
        }
        if ((i & 4) != 0) {
            str = q751Var.f186036c;
        }
        if ((i & 8) != 0) {
            tduVar = q751Var.f186037d;
        }
        if ((i & 16) != 0) {
            str2 = q751Var.f186038e;
        }
        String str3 = str2;
        q751Var.getClass();
        tdu tduVar2 = tduVar;
        return new q751(xamVar, list2, str, tduVar2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q751)) {
            return false;
        }
        q751 q751Var = (q751) obj;
        return wj50.m88271j(this.f186034a, q751Var.f186034a) && wj50.m88271j(this.f186035b, q751Var.f186035b) && wj50.m88271j(this.f186036c, q751Var.f186036c) && wj50.m88271j(this.f186037d, q751Var.f186037d) && wj50.m88271j(this.f186038e, q751Var.f186038e);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f186034a.hashCode() * 31, 31, this.f186035b);
        String str = this.f186036c;
        int iHashCode = (this.f186037d.hashCode() + ((iM77244c + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f186038e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
