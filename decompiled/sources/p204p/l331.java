package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class l331 {

    /* JADX INFO: renamed from: a */
    public final List f129196a;

    public l331(List list) {
        this.f129196a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l331) && wj50.m88271j(this.f129196a, ((l331) obj).f129196a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + mt60.m62800g(0, mt60.m62800g(0, this.f129196a.hashCode() * 31, 31), 31);
    }
}
