package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zjv {

    /* JADX INFO: renamed from: a */
    public final List f283542a;

    /* JADX INFO: renamed from: b */
    public final bkv f283543b;

    public zjv(List list, bkv bkvVar) {
        this.f283542a = list;
        this.f283543b = bkvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjv)) {
            return false;
        }
        zjv zjvVar = (zjv) obj;
        return wj50.m88271j(this.f283542a, zjvVar.f283542a) && wj50.m88271j(this.f283543b, zjvVar.f283543b);
    }

    public final int hashCode() {
        List list = this.f283542a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        bkv bkvVar = this.f283543b;
        return iHashCode + (bkvVar != null ? bkvVar.hashCode() : 0);
    }
}
