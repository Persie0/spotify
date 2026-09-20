package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w181 {

    /* JADX INFO: renamed from: a */
    public final String f247021a;

    /* JADX INFO: renamed from: b */
    public final j3h1 f247022b;

    /* JADX INFO: renamed from: c */
    public final String f247023c;

    /* JADX INFO: renamed from: d */
    public final boolean f247024d;

    /* JADX INFO: renamed from: e */
    public final String f247025e;

    /* JADX INFO: renamed from: f */
    public final List f247026f;

    /* JADX INFO: renamed from: g */
    public final boolean f247027g;

    /* JADX INFO: renamed from: h */
    public final v181 f247028h;

    /* JADX INFO: renamed from: i */
    public final String f247029i;

    /* JADX INFO: renamed from: j */
    public final u181 f247030j;

    public w181(String str, j3h1 j3h1Var, String str2, boolean z, String str3, List list, boolean z2, v181 v181Var, String str4, u181 u181Var) {
        this.f247021a = str;
        this.f247022b = j3h1Var;
        this.f247023c = str2;
        this.f247024d = z;
        this.f247025e = str3;
        this.f247026f = list;
        this.f247027g = z2;
        this.f247028h = v181Var;
        this.f247029i = str4;
        this.f247030j = u181Var;
    }

    /* JADX INFO: renamed from: a */
    public static w181 m86978a(w181 w181Var, boolean z, List list, int i) {
        String str = w181Var.f247021a;
        j3h1 j3h1Var = w181Var.f247022b;
        String str2 = w181Var.f247023c;
        String str3 = w181Var.f247025e;
        if ((i & 32) != 0) {
            list = w181Var.f247026f;
        }
        return new w181(str, j3h1Var, str2, z, str3, list, w181Var.f247027g, w181Var.f247028h, w181Var.f247029i, w181Var.f247030j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w181)) {
            return false;
        }
        w181 w181Var = (w181) obj;
        return wj50.m88271j(this.f247021a, w181Var.f247021a) && wj50.m88271j(this.f247022b, w181Var.f247022b) && wj50.m88271j(this.f247023c, w181Var.f247023c) && this.f247024d == w181Var.f247024d && wj50.m88271j(this.f247025e, w181Var.f247025e) && wj50.m88271j(this.f247026f, w181Var.f247026f) && this.f247027g == w181Var.f247027g && this.f247028h == w181Var.f247028h && wj50.m88271j(this.f247029i, w181Var.f247029i) && wj50.m88271j(this.f247030j, w181Var.f247030j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b((this.f247022b.hashCode() + (this.f247021a.hashCode() * 31)) * 31, 31, this.f247023c), 31, this.f247024d);
        String str = this.f247025e;
        int iHashCode = (this.f247028h.hashCode() + s571.m77245d(s571.m77244c((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f247026f), 31, this.f247027g)) * 31;
        String str2 = this.f247029i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        u181 u181Var = this.f247030j;
        return iHashCode2 + (u181Var != null ? u181Var.hashCode() : 0);
    }

    public /* synthetic */ w181(String str, j3h1 j3h1Var, String str2, boolean z, String str3, ArrayList arrayList, boolean z2, v181 v181Var, String str4, u181 u181Var, int i) {
        this(str, j3h1Var, str2, z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? lau.f131415a : arrayList, z2, (i & 128) != 0 ? v181.f236293a : v181Var, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : u181Var);
    }
}
