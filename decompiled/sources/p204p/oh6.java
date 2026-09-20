package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class oh6 extends uh6 {

    /* JADX INFO: renamed from: a */
    public final String f165342a;

    /* JADX INFO: renamed from: b */
    public final String f165343b;

    /* JADX INFO: renamed from: c */
    public final String f165344c;

    /* JADX INFO: renamed from: d */
    public final boolean f165345d;

    /* JADX INFO: renamed from: e */
    public final List f165346e;

    /* JADX INFO: renamed from: f */
    public final List f165347f;

    public oh6(String str, String str2, String str3, boolean z, List list, List list2, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        z = (i & 8) != 0 ? false : z;
        int i2 = i & 16;
        lau lauVar = lau.f131415a;
        list = i2 != 0 ? lauVar : list;
        list2 = (i & 32) != 0 ? lauVar : list2;
        this.f165342a = str;
        this.f165343b = str2;
        this.f165344c = str3;
        this.f165345d = z;
        this.f165346e = list;
        this.f165347f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh6)) {
            return false;
        }
        oh6 oh6Var = (oh6) obj;
        return wj50.m88271j(this.f165342a, oh6Var.f165342a) && wj50.m88271j(this.f165343b, oh6Var.f165343b) && wj50.m88271j(this.f165344c, oh6Var.f165344c) && this.f165345d == oh6Var.f165345d && wj50.m88271j(this.f165346e, oh6Var.f165346e) && wj50.m88271j(this.f165347f, oh6Var.f165347f);
    }

    public final int hashCode() {
        int iHashCode = this.f165342a.hashCode() * 31;
        String str = this.f165343b;
        return this.f165347f.hashCode() + s571.m77244c(s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f165344c), 31, this.f165345d), 31, this.f165346e);
    }
}
