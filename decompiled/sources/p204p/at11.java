package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class at11 {

    /* JADX INFO: renamed from: a */
    public final String f19553a;

    /* JADX INFO: renamed from: b */
    public final String f19554b;

    /* JADX INFO: renamed from: c */
    public final String f19555c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f19556d;

    /* JADX INFO: renamed from: e */
    public final int f19557e;

    /* JADX INFO: renamed from: f */
    public final int f19558f;

    /* JADX INFO: renamed from: g */
    public final String f19559g;

    /* JADX INFO: renamed from: h */
    public final String f19560h;

    public at11(String str, String str2, String str3, ArrayList arrayList, int i, int i2, String str4, String str5) {
        this.f19553a = str;
        this.f19554b = str2;
        this.f19555c = str3;
        this.f19556d = arrayList;
        this.f19557e = i;
        this.f19558f = i2;
        this.f19559g = str4;
        this.f19560h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at11)) {
            return false;
        }
        at11 at11Var = (at11) obj;
        return wj50.m88271j(this.f19553a, at11Var.f19553a) && wj50.m88271j(this.f19554b, at11Var.f19554b) && wj50.m88271j(this.f19555c, at11Var.f19555c) && this.f19556d.equals(at11Var.f19556d) && this.f19557e == at11Var.f19557e && this.f19558f == at11Var.f19558f && wj50.m88271j(this.f19559g, at11Var.f19559g) && wj50.m88271j(this.f19560h, at11Var.f19560h);
    }

    public final int hashCode() {
        int iHashCode = this.f19553a.hashCode() * 31;
        String str = this.f19554b;
        return this.f19560h.hashCode() + s571.m77243b(mt60.m62800g(this.f19558f, mt60.m62800g(this.f19557e, lq51.m59700f(this.f19556d, s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f19555c), 31), 31), 31), 31, this.f19559g);
    }
}
