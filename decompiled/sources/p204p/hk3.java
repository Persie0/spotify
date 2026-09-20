package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hk3 {

    /* JADX INFO: renamed from: a */
    public final String f92326a;

    /* JADX INFO: renamed from: b */
    public final String f92327b;

    /* JADX INFO: renamed from: c */
    public final String f92328c;

    /* JADX INFO: renamed from: d */
    public final String f92329d;

    /* JADX INFO: renamed from: e */
    public final List f92330e;

    public hk3(String str, String str2, String str3, String str4, List list) {
        this.f92326a = str;
        this.f92327b = str2;
        this.f92328c = str3;
        this.f92329d = str4;
        this.f92330e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk3)) {
            return false;
        }
        hk3 hk3Var = (hk3) obj;
        return wj50.m88271j(this.f92326a, hk3Var.f92326a) && wj50.m88271j(this.f92327b, hk3Var.f92327b) && wj50.m88271j(this.f92328c, hk3Var.f92328c) && wj50.m88271j(this.f92329d, hk3Var.f92329d) && wj50.m88271j(this.f92330e, hk3Var.f92330e);
    }

    public final int hashCode() {
        return this.f92330e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f92326a.hashCode() * 31, 31, this.f92327b), 31, this.f92328c), 31, this.f92329d);
    }
}
