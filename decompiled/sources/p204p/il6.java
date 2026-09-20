package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class il6 implements vwf {

    /* JADX INFO: renamed from: a */
    public final ArrayList f103294a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f103295b;

    /* JADX INFO: renamed from: c */
    public final int f103296c;

    /* JADX INFO: renamed from: d */
    public final String f103297d;

    public il6(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f103294a = arrayList;
        this.f103295b = arrayList2;
        this.f103296c = i;
        this.f103297d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il6)) {
            return false;
        }
        il6 il6Var = (il6) obj;
        return this.f103294a.equals(il6Var.f103294a) && this.f103295b.equals(il6Var.f103295b) && this.f103296c == il6Var.f103296c && wj50.m88271j(this.f103297d, il6Var.f103297d);
    }

    public final int hashCode() {
        return this.f103297d.hashCode() + mt60.m62800g(this.f103296c, lq51.m59700f(this.f103295b, this.f103294a.hashCode() * 31, 31), 31);
    }
}
