package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hd7 {

    /* JADX INFO: renamed from: a */
    public final String f90035a;

    /* JADX INFO: renamed from: b */
    public final String f90036b;

    /* JADX INFO: renamed from: c */
    public final String f90037c;

    /* JADX INFO: renamed from: d */
    public final String f90038d;

    /* JADX INFO: renamed from: e */
    public final int f90039e;

    /* JADX INFO: renamed from: f */
    public final boolean f90040f;

    /* JADX INFO: renamed from: g */
    public final String f90041g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f90042h;

    /* JADX INFO: renamed from: i */
    public final boolean f90043i;

    /* JADX INFO: renamed from: j */
    public final List f90044j;

    public hd7(String str, String str2, String str3, String str4, int i, boolean z, String str5, rcm0 rcm0Var, boolean z2, List list) {
        this.f90035a = str;
        this.f90036b = str2;
        this.f90037c = str3;
        this.f90038d = str4;
        this.f90039e = i;
        this.f90040f = z;
        this.f90041g = str5;
        this.f90042h = rcm0Var;
        this.f90043i = z2;
        this.f90044j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd7)) {
            return false;
        }
        hd7 hd7Var = (hd7) obj;
        return wj50.m88271j(this.f90035a, hd7Var.f90035a) && wj50.m88271j(this.f90036b, hd7Var.f90036b) && wj50.m88271j(this.f90037c, hd7Var.f90037c) && wj50.m88271j(this.f90038d, hd7Var.f90038d) && this.f90039e == hd7Var.f90039e && this.f90040f == hd7Var.f90040f && wj50.m88271j(this.f90041g, hd7Var.f90041g) && this.f90042h.equals(hd7Var.f90042h) && this.f90043i == hd7Var.f90043i && this.f90044j.equals(hd7Var.f90044j);
    }

    public final int hashCode() {
        return this.f90044j.hashCode() + s571.m77245d(yds.m93483m(this.f90042h, s571.m77243b(s571.m77245d(f710.m40938f(this.f90039e, s571.m77243b(s571.m77243b(s571.m77243b(this.f90035a.hashCode() * 31, 31, this.f90036b), 31, this.f90037c), 31, this.f90038d), 31), 31, this.f90040f), 31, this.f90041g), 31), 31, this.f90043i);
    }
}
