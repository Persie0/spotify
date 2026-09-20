package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xhu0 {

    /* JADX INFO: renamed from: a */
    public final List f261708a;

    /* JADX INFO: renamed from: b */
    public final String f261709b;

    /* JADX INFO: renamed from: c */
    public final th00 f261710c;

    /* JADX INFO: renamed from: d */
    public final gh00 f261711d;

    public /* synthetic */ xhu0(ArrayList arrayList, String str, th00 th00Var, gh00 gh00Var, int i) {
        this((i & 1) != 0 ? zhu0.f283015a : arrayList, str, th00Var, (i & 8) != 0 ? null : gh00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhu0)) {
            return false;
        }
        xhu0 xhu0Var = (xhu0) obj;
        return wj50.m88271j(this.f261708a, xhu0Var.f261708a) && wj50.m88271j(this.f261709b, xhu0Var.f261709b) && wj50.m88271j(this.f261710c, xhu0Var.f261710c) && wj50.m88271j(this.f261711d, xhu0Var.f261711d);
    }

    public final int hashCode() {
        int iHashCode = this.f261708a.hashCode() * 31;
        String str = this.f261709b;
        int iHashCode2 = (this.f261710c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        gh00 gh00Var = this.f261711d;
        return iHashCode2 + (gh00Var != null ? gh00Var.hashCode() : 0);
    }

    public xhu0(List list, String str, th00 th00Var, gh00 gh00Var) {
        this.f261708a = list;
        this.f261709b = str;
        this.f261710c = th00Var;
        this.f261711d = gh00Var;
    }
}
