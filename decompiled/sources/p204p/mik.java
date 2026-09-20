package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mik {

    /* JADX INFO: renamed from: a */
    public final List f144038a;

    /* JADX INFO: renamed from: b */
    public final Boolean f144039b;

    public mik(List list, Boolean bool) {
        this.f144038a = list;
        this.f144039b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mik)) {
            return false;
        }
        mik mikVar = (mik) obj;
        return wj50.m88271j(this.f144038a, mikVar.f144038a) && wj50.m88271j(this.f144039b, mikVar.f144039b);
    }

    public final int hashCode() {
        List list = this.f144038a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.f144039b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
