package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qu60 {

    /* JADX INFO: renamed from: a */
    public final List f192575a;

    public qu60(List list) {
        this.f192575a = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m73876a() {
        return this.f192575a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu60)) {
            return false;
        }
        return wj50.m88271j(this.f192575a, ((qu60) obj).f192575a);
    }

    public final int hashCode() {
        return this.f192575a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("KeyResolver(", g6f.m43753y0(this.f192575a, " -> ", null, null, df60.f48471O0, 30), ")");
    }
}
