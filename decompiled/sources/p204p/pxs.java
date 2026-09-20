package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class pxs implements wxs {

    /* JADX INFO: renamed from: a */
    public final Set f183181a;

    /* JADX INFO: renamed from: b */
    public final String f183182b;

    public pxs(String str, Set set) {
        this.f183181a = set;
        this.f183182b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxs)) {
            return false;
        }
        pxs pxsVar = (pxs) obj;
        return wj50.m88271j(this.f183181a, pxsVar.f183181a) && wj50.m88271j(this.f183182b, pxsVar.f183182b);
    }

    public final int hashCode() {
        int iHashCode = this.f183181a.hashCode() * 31;
        String str = this.f183182b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
