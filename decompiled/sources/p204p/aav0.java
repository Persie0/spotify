package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class aav0 {

    /* JADX INFO: renamed from: a */
    public final String f13931a;

    /* JADX INFO: renamed from: b */
    public final int f13932b;

    /* JADX INFO: renamed from: c */
    public final rcm0 f13933c;

    /* JADX INFO: renamed from: d */
    public final String f13934d;

    /* JADX INFO: renamed from: e */
    public final String f13935e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f13936f;

    public aav0(int i, String str, String str2, String str3, ArrayList arrayList, rcm0 rcm0Var) {
        this.f13931a = str;
        this.f13932b = i;
        this.f13933c = rcm0Var;
        this.f13934d = str2;
        this.f13935e = str3;
        this.f13936f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aav0)) {
            return false;
        }
        aav0 aav0Var = (aav0) obj;
        return wj50.m88271j(this.f13931a, aav0Var.f13931a) && this.f13932b == aav0Var.f13932b && this.f13933c.equals(aav0Var.f13933c) && wj50.m88271j(this.f13934d, aav0Var.f13934d) && wj50.m88271j(this.f13935e, aav0Var.f13935e) && this.f13936f.equals(aav0Var.f13936f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(yds.m93483m(this.f13933c, mt60.m62800g(this.f13932b, this.f13931a.hashCode() * 31, 31), 31), 31, this.f13934d);
        String str = this.f13935e;
        return this.f13936f.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
