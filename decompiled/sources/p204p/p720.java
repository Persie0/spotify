package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class p720 {

    /* JADX INFO: renamed from: a */
    public final List f174548a;

    /* JADX INFO: renamed from: b */
    public final String f174549b;

    /* JADX INFO: renamed from: c */
    public final String f174550c;

    /* JADX INFO: renamed from: d */
    public final int f174551d;

    public p720(int i, String str, String str2, List list) {
        this.f174548a = list;
        this.f174549b = str;
        this.f174550c = str2;
        this.f174551d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p720)) {
            return false;
        }
        p720 p720Var = (p720) obj;
        return wj50.m88271j(this.f174548a, p720Var.f174548a) && wj50.m88271j(this.f174549b, p720Var.f174549b) && wj50.m88271j(this.f174550c, p720Var.f174550c) && this.f174551d == p720Var.f174551d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174551d) + s571.m77243b(s571.m77243b(this.f174548a.hashCode() * 31, 31, this.f174549b), 31, this.f174550c);
    }
}
