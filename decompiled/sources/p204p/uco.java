package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class uco {

    /* JADX INFO: renamed from: a */
    public final Object f229090a;

    /* JADX INFO: renamed from: b */
    public final String f229091b;

    /* JADX INFO: renamed from: c */
    public final boolean f229092c;

    public uco(String str, List list, boolean z) {
        this.f229090a = list;
        this.f229091b = str;
        this.f229092c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uco)) {
            return false;
        }
        uco ucoVar = (uco) obj;
        return this.f229090a.equals(ucoVar.f229090a) && wj50.m88271j(this.f229091b, ucoVar.f229091b) && this.f229092c == ucoVar.f229092c;
    }

    public final int hashCode() {
        int iHashCode = this.f229090a.hashCode() * 31;
        String str = this.f229091b;
        return Boolean.hashCode(this.f229092c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
