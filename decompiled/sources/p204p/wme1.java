package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class wme1 {

    /* JADX INFO: renamed from: a */
    public final List f252844a;

    /* JADX INFO: renamed from: b */
    public final List f252845b;

    /* JADX INFO: renamed from: c */
    public final kb01 f252846c;

    /* JADX INFO: renamed from: d */
    public final kb01 f252847d;

    /* JADX INFO: renamed from: e */
    public final kb01 f252848e;

    public wme1(List list, List list2, kb01 kb01Var, kb01 kb01Var2, kb01 kb01Var3) {
        this.f252844a = list;
        this.f252845b = list2;
        this.f252846c = kb01Var;
        this.f252847d = kb01Var2;
        this.f252848e = kb01Var3;
    }

    /* JADX INFO: renamed from: a */
    public static wme1 m88566a(wme1 wme1Var, kb01 kb01Var, kb01 kb01Var2, int i) {
        List list = wme1Var.f252844a;
        List list2 = wme1Var.f252845b;
        if ((i & 4) != 0) {
            kb01Var = wme1Var.f252846c;
        }
        kb01 kb01Var3 = kb01Var;
        if ((i & 8) != 0) {
            kb01Var2 = wme1Var.f252847d;
        }
        kb01 kb01Var4 = wme1Var.f252848e;
        wme1Var.getClass();
        return new wme1(list, list2, kb01Var3, kb01Var2, kb01Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wme1)) {
            return false;
        }
        wme1 wme1Var = (wme1) obj;
        return wj50.m88271j(this.f252844a, wme1Var.f252844a) && wj50.m88271j(this.f252845b, wme1Var.f252845b) && wj50.m88271j(this.f252846c, wme1Var.f252846c) && wj50.m88271j(this.f252847d, wme1Var.f252847d) && wj50.m88271j(this.f252848e, wme1Var.f252848e);
    }

    public final int hashCode() {
        return this.f252848e.hashCode() + ((this.f252847d.hashCode() + ((this.f252846c.hashCode() + s571.m77244c(this.f252844a.hashCode() * 31, 31, this.f252845b)) * 31)) * 31);
    }
}
