package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class orj0 {

    /* JADX INFO: renamed from: a */
    public final List f168612a;

    /* JADX INFO: renamed from: b */
    public final String f168613b;

    /* JADX INFO: renamed from: c */
    public final String f168614c;

    /* JADX INFO: renamed from: d */
    public final String f168615d;

    public orj0(String str, List list, String str2, String str3) {
        this.f168612a = list;
        this.f168613b = str;
        this.f168614c = str2;
        this.f168615d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orj0)) {
            return false;
        }
        orj0 orj0Var = (orj0) obj;
        return wj50.m88271j(this.f168612a, orj0Var.f168612a) && wj50.m88271j(this.f168613b, orj0Var.f168613b) && wj50.m88271j(this.f168614c, orj0Var.f168614c) && wj50.m88271j(this.f168615d, orj0Var.f168615d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f168612a.hashCode() * 31, 31, this.f168613b), 31, this.f168614c);
        String str = this.f168615d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
