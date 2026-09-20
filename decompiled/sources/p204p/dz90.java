package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class dz90 {

    /* JADX INFO: renamed from: a */
    public final String f54584a;

    /* JADX INFO: renamed from: b */
    public final String f54585b;

    /* JADX INFO: renamed from: c */
    public final Object f54586c;

    /* JADX INFO: renamed from: d */
    public final String f54587d;

    /* JADX INFO: renamed from: e */
    public final String f54588e;

    /* JADX INFO: renamed from: f */
    public final int f54589f;

    /* JADX INFO: renamed from: g */
    public final String f54590g;

    /* JADX INFO: renamed from: h */
    public final boolean f54591h;

    public dz90(String str, String str2, List list, String str3, String str4, int i, String str5, boolean z) {
        this.f54584a = str;
        this.f54585b = str2;
        this.f54586c = list;
        this.f54587d = str3;
        this.f54588e = str4;
        this.f54589f = i;
        this.f54590g = str5;
        this.f54591h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz90)) {
            return false;
        }
        dz90 dz90Var = (dz90) obj;
        return this.f54584a.equals(dz90Var.f54584a) && this.f54585b.equals(dz90Var.f54585b) && this.f54586c.equals(dz90Var.f54586c) && this.f54587d.equals(dz90Var.f54587d) && this.f54588e.equals(dz90Var.f54588e) && this.f54589f == dz90Var.f54589f && this.f54590g.equals(dz90Var.f54590g) && this.f54591h == dz90Var.f54591h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54591h) + s571.m77243b(f710.m40938f(this.f54589f, s571.m77243b(s571.m77243b(dq60.m36604d(s571.m77243b(this.f54584a.hashCode() * 31, 31, this.f54585b), 31, this.f54586c), 31, this.f54587d), 31, this.f54588e), 31), 31, this.f54590g);
    }
}
