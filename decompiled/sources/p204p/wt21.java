package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wt21 implements au21 {

    /* JADX INFO: renamed from: a */
    public final tu21 f254804a;

    /* JADX INFO: renamed from: b */
    public final List f254805b;

    /* JADX INFO: renamed from: c */
    public final kaa0 f254806c;

    /* JADX INFO: renamed from: d */
    public final i3a0 f254807d;

    /* JADX INFO: renamed from: e */
    public final String f254808e;

    /* JADX INFO: renamed from: f */
    public final String f254809f;

    /* JADX INFO: renamed from: g */
    public final String f254810g;

    /* JADX INFO: renamed from: h */
    public final Set f254811h;

    /* JADX INFO: renamed from: i */
    public final ebf0 f254812i;

    public wt21(tu21 tu21Var, List list, kaa0 kaa0Var, i3a0 i3a0Var, String str, String str2, String str3, Set set, ebf0 ebf0Var) {
        this.f254804a = tu21Var;
        this.f254805b = list;
        this.f254806c = kaa0Var;
        this.f254807d = i3a0Var;
        this.f254808e = str;
        this.f254809f = str2;
        this.f254810g = str3;
        this.f254811h = set;
        this.f254812i = ebf0Var;
    }

    @Override // p204p.au21
    public final String breadcrumb() {
        return "GotSlotContent: " + this.f254804a + ", " + this.f254805b.size() + " sections, strategy=" + this.f254806c + ", source=" + this.f254807d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt21)) {
            return false;
        }
        wt21 wt21Var = (wt21) obj;
        return this.f254804a == wt21Var.f254804a && wj50.m88271j(this.f254805b, wt21Var.f254805b) && this.f254806c == wt21Var.f254806c && this.f254807d == wt21Var.f254807d && wj50.m88271j(this.f254808e, wt21Var.f254808e) && wj50.m88271j(this.f254809f, wt21Var.f254809f) && wj50.m88271j(this.f254810g, wt21Var.f254810g) && wj50.m88271j(this.f254811h, wt21Var.f254811h) && wj50.m88271j(this.f254812i, wt21Var.f254812i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f254807d.hashCode() + ((this.f254806c.hashCode() + s571.m77244c(this.f254804a.hashCode() * 31, 31, this.f254805b)) * 31)) * 31, 31, this.f254808e);
        String str = this.f254809f;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f254810g);
        Set set = this.f254811h;
        int iHashCode = (iM77243b2 + (set == null ? 0 : set.hashCode())) * 31;
        ebf0 ebf0Var = this.f254812i;
        return iHashCode + (ebf0Var != null ? ebf0Var.f57921a.hashCode() : 0);
    }
}
