package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yqx0 {

    /* JADX INFO: renamed from: a */
    public final String f275315a;

    /* JADX INFO: renamed from: b */
    public final c171 f275316b;

    /* JADX INFO: renamed from: c */
    public final qy30 f275317c;

    /* JADX INFO: renamed from: d */
    public final boolean f275318d;

    /* JADX INFO: renamed from: e */
    public final boolean f275319e;

    /* JADX INFO: renamed from: f */
    public final boolean f275320f;

    /* JADX INFO: renamed from: g */
    public final List f275321g;

    /* JADX INFO: renamed from: h */
    public final List f275322h;

    /* JADX INFO: renamed from: i */
    public final List f275323i;

    /* JADX INFO: renamed from: j */
    public final Object f275324j;

    public yqx0(String str, c171 c171Var, qy30 qy30Var, boolean z, boolean z2, List list, List list2, ArrayList arrayList, Object obj, int i) {
        boolean z3 = (i & 32) == 0;
        list = (i & 64) != 0 ? lau.f131415a : list;
        list2 = (i & 128) != 0 ? null : list2;
        arrayList = (i & 256) != 0 ? null : arrayList;
        this.f275315a = str;
        this.f275316b = c171Var;
        this.f275317c = qy30Var;
        this.f275318d = z;
        this.f275319e = z2;
        this.f275320f = z3;
        this.f275321g = list;
        this.f275322h = list2;
        this.f275323i = arrayList;
        this.f275324j = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqx0)) {
            return false;
        }
        yqx0 yqx0Var = (yqx0) obj;
        return wj50.m88271j(this.f275315a, yqx0Var.f275315a) && wj50.m88271j(this.f275316b, yqx0Var.f275316b) && wj50.m88271j(this.f275317c, yqx0Var.f275317c) && this.f275318d == yqx0Var.f275318d && this.f275319e == yqx0Var.f275319e && this.f275320f == yqx0Var.f275320f && wj50.m88271j(this.f275321g, yqx0Var.f275321g) && wj50.m88271j(this.f275322h, yqx0Var.f275322h) && wj50.m88271j(this.f275323i, yqx0Var.f275323i) && wj50.m88271j(this.f275324j, yqx0Var.f275324j);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77245d(s571.m77245d(s571.m77245d((this.f275317c.hashCode() + ((this.f275316b.hashCode() + (this.f275315a.hashCode() * 31)) * 31)) * 31, 31, this.f275318d), 31, this.f275319e), 31, this.f275320f), 31, this.f275321g);
        List list = this.f275322h;
        int iHashCode = (iM77244c + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f275323i;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Object obj = this.f275324j;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }
}
