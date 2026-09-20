package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class rw61 {

    /* JADX INFO: renamed from: a */
    public final String f203281a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f203282b;

    /* JADX INFO: renamed from: c */
    public final String f203283c;

    /* JADX INFO: renamed from: d */
    public final String f203284d;

    /* JADX INFO: renamed from: e */
    public final int f203285e;

    public rw61(int i, String str, String str2, String str3, ArrayList arrayList) {
        this.f203281a = str;
        this.f203282b = arrayList;
        this.f203283c = str2;
        this.f203284d = str3;
        this.f203285e = i;
    }

    /* JADX INFO: renamed from: a */
    public static rw61 m76507a(rw61 rw61Var, ArrayList arrayList) {
        String str = rw61Var.f203281a;
        String str2 = rw61Var.f203283c;
        String str3 = rw61Var.f203284d;
        int i = rw61Var.f203285e;
        rw61Var.getClass();
        return new rw61(i, str, str2, str3, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76508b() {
        ArrayList arrayList = this.f203282b;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = ((dx61) it.next()).f53862d;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((rly) it2.next()).f200394d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw61)) {
            return false;
        }
        rw61 rw61Var = (rw61) obj;
        return wj50.m88271j(this.f203281a, rw61Var.f203281a) && this.f203282b.equals(rw61Var.f203282b) && wj50.m88271j(this.f203283c, rw61Var.f203283c) && wj50.m88271j(this.f203284d, rw61Var.f203284d) && this.f203285e == rw61Var.f203285e;
    }

    public final int hashCode() {
        String str = this.f203281a;
        int iM59700f = lq51.m59700f(this.f203282b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f203283c;
        int iHashCode = (iM59700f + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f203284d;
        return Integer.hashCode(this.f203285e) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
