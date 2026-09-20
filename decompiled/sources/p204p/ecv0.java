package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ecv0 {

    /* JADX INFO: renamed from: a */
    public final String f58393a;

    /* JADX INFO: renamed from: b */
    public final String f58394b;

    /* JADX INFO: renamed from: c */
    public final String f58395c;

    /* JADX INFO: renamed from: d */
    public final String f58396d;

    /* JADX INFO: renamed from: e */
    public final List f58397e;

    public ecv0(String str, String str2, String str3, String str4, List list) {
        this.f58393a = str;
        this.f58394b = str2;
        this.f58395c = str3;
        this.f58396d = str4;
        this.f58397e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecv0)) {
            return false;
        }
        ecv0 ecv0Var = (ecv0) obj;
        return wj50.m88271j(this.f58393a, ecv0Var.f58393a) && wj50.m88271j(this.f58394b, ecv0Var.f58394b) && wj50.m88271j(this.f58395c, ecv0Var.f58395c) && wj50.m88271j(this.f58396d, ecv0Var.f58396d) && wj50.m88271j(this.f58397e, ecv0Var.f58397e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f58393a.hashCode() * 31, 31, this.f58394b);
        String str = this.f58395c;
        return s571.m77244c(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f58396d), 31, this.f58397e);
    }
}
