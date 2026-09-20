package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class j71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final List f109460a;

    /* JADX INFO: renamed from: b */
    public final boolean f109461b;

    /* JADX INFO: renamed from: c */
    public final String f109462c;

    /* JADX INFO: renamed from: d */
    public final boolean f109463d;

    public j71(List list, boolean z, String str, boolean z2) {
        this.f109460a = list;
        this.f109461b = z;
        this.f109462c = str;
        this.f109463d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j71)) {
            return false;
        }
        j71 j71Var = (j71) obj;
        return wj50.m88271j(this.f109460a, j71Var.f109460a) && this.f109461b == j71Var.f109461b && wj50.m88271j(this.f109462c, j71Var.f109462c) && this.f109463d == j71Var.f109463d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109463d) + s571.m77243b(s571.m77245d(this.f109460a.hashCode() * 31, 31, this.f109461b), 31, this.f109462c);
    }
}
