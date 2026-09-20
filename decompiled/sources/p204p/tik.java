package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tik {

    /* JADX INFO: renamed from: a */
    public final List f220699a;

    /* JADX INFO: renamed from: b */
    public final Boolean f220700b;

    public tik(List list, Boolean bool) {
        this.f220699a = list;
        this.f220700b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tik)) {
            return false;
        }
        tik tikVar = (tik) obj;
        return wj50.m88271j(this.f220699a, tikVar.f220699a) && wj50.m88271j(this.f220700b, tikVar.f220700b);
    }

    public final int hashCode() {
        List list = this.f220699a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.f220700b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
