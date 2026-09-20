package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class z1c1 {

    /* JADX INFO: renamed from: a */
    public final int f278282a;

    /* JADX INFO: renamed from: b */
    public final boolean f278283b;

    /* JADX INFO: renamed from: c */
    public final List f278284c;

    /* JADX INFO: renamed from: d */
    public final String f278285d;

    /* JADX INFO: renamed from: e */
    public final v1p0 f278286e;

    public z1c1(int i, boolean z, List list, String str, v1p0 v1p0Var) {
        this.f278282a = i;
        this.f278283b = z;
        this.f278284c = list;
        this.f278285d = str;
        this.f278286e = v1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1c1)) {
            return false;
        }
        z1c1 z1c1Var = (z1c1) obj;
        return this.f278282a == z1c1Var.f278282a && this.f278283b == z1c1Var.f278283b && wj50.m88271j(this.f278284c, z1c1Var.f278284c) && wj50.m88271j(this.f278285d, z1c1Var.f278285d) && wj50.m88271j(this.f278286e, z1c1Var.f278286e);
    }

    public final int hashCode() {
        return this.f278286e.hashCode() + s571.m77243b(s571.m77244c(s571.m77245d(edb.m38547C(this.f278282a) * 31, 31, this.f278283b), 31, this.f278284c), 31, this.f278285d);
    }
}
