package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class o5i0 {

    /* JADX INFO: renamed from: a */
    public final String f162005a;

    /* JADX INFO: renamed from: b */
    public final String f162006b;

    /* JADX INFO: renamed from: c */
    public final String f162007c;

    /* JADX INFO: renamed from: d */
    public final List f162008d;

    /* JADX INFO: renamed from: e */
    public final String f162009e;

    /* JADX INFO: renamed from: f */
    public final String f162010f;

    /* JADX INFO: renamed from: g */
    public final int f162011g;

    public o5i0(int i, String str, String str2, String str3, String str4, String str5, List list) {
        this.f162005a = str;
        this.f162006b = str2;
        this.f162007c = str3;
        this.f162008d = list;
        this.f162009e = str4;
        this.f162010f = str5;
        this.f162011g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5i0)) {
            return false;
        }
        o5i0 o5i0Var = (o5i0) obj;
        return this.f162005a.equals(o5i0Var.f162005a) && wj50.m88271j(this.f162006b, o5i0Var.f162006b) && this.f162007c.equals(o5i0Var.f162007c) && wj50.m88271j(this.f162008d, o5i0Var.f162008d) && wj50.m88271j(this.f162009e, o5i0Var.f162009e) && wj50.m88271j(this.f162010f, o5i0Var.f162010f) && this.f162011g == o5i0Var.f162011g;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f162005a.hashCode() * 31, 31, this.f162006b), 31, this.f162007c), 31, this.f162008d);
        String str = this.f162009e;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f162010f;
        return edb.m38547C(this.f162011g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
