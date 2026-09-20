package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o3z {

    /* JADX INFO: renamed from: a */
    public final List f161482a;

    /* JADX INFO: renamed from: b */
    public final List f161483b;

    /* JADX INFO: renamed from: c */
    public final int f161484c;

    /* JADX INFO: renamed from: d */
    public final int f161485d;

    /* JADX INFO: renamed from: e */
    public final boolean f161486e;

    /* JADX INFO: renamed from: f */
    public final boolean f161487f;

    public o3z(List list, List list2, int i, int i2, boolean z, boolean z2) {
        this.f161482a = list;
        this.f161483b = list2;
        this.f161484c = i;
        this.f161485d = i2;
        this.f161486e = z;
        this.f161487f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3z)) {
            return false;
        }
        o3z o3zVar = (o3z) obj;
        return wj50.m88271j(this.f161482a, o3zVar.f161482a) && wj50.m88271j(this.f161483b, o3zVar.f161483b) && this.f161484c == o3zVar.f161484c && this.f161485d == o3zVar.f161485d && this.f161486e == o3zVar.f161486e && this.f161487f == o3zVar.f161487f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161487f) + s571.m77245d(mt60.m62800g(this.f161485d, mt60.m62800g(this.f161484c, s571.m77244c(this.f161482a.hashCode() * 31, 31, this.f161483b), 31), 31), 31, this.f161486e);
    }
}
