package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class l0z {

    /* JADX INFO: renamed from: a */
    public final List f128537a;

    /* JADX INFO: renamed from: b */
    public final kyy f128538b;

    public l0z(List list, kyy kyyVar) {
        this.f128537a = list;
        this.f128538b = kyyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0z)) {
            return false;
        }
        l0z l0zVar = (l0z) obj;
        return wj50.m88271j(this.f128537a, l0zVar.f128537a) && this.f128538b == l0zVar.f128538b;
    }

    public final int hashCode() {
        int iHashCode = this.f128537a.hashCode() * 31;
        kyy kyyVar = this.f128538b;
        return iHashCode + (kyyVar == null ? 0 : kyyVar.hashCode());
    }
}
