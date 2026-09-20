package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rn31 {

    /* JADX INFO: renamed from: a */
    public final String f200715a;

    /* JADX INFO: renamed from: b */
    public final List f200716b;

    /* JADX INFO: renamed from: c */
    public final String f200717c;

    /* JADX INFO: renamed from: d */
    public final boolean f200718d;

    /* JADX INFO: renamed from: e */
    public final String f200719e;

    public rn31(String str, String str2, boolean z, String str3, List list) {
        this.f200715a = str;
        this.f200716b = list;
        this.f200717c = str2;
        this.f200718d = z;
        this.f200719e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn31)) {
            return false;
        }
        rn31 rn31Var = (rn31) obj;
        return wj50.m88271j(this.f200715a, rn31Var.f200715a) && wj50.m88271j(this.f200716b, rn31Var.f200716b) && wj50.m88271j(this.f200717c, rn31Var.f200717c) && this.f200718d == rn31Var.f200718d && wj50.m88271j(this.f200719e, rn31Var.f200719e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77244c(this.f200715a.hashCode() * 31, 31, this.f200716b), 31, this.f200717c), 31, this.f200718d);
        String str = this.f200719e;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ rn31(int i, String str, String str2, List list, boolean z) {
        this(str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z, (String) null, list);
    }
}
