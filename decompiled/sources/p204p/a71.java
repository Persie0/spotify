package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final List f12917a;

    /* JADX INFO: renamed from: b */
    public final String f12918b;

    public a71(List list, String str) {
        this.f12917a = list;
        this.f12918b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a71)) {
            return false;
        }
        a71 a71Var = (a71) obj;
        return wj50.m88271j(this.f12917a, a71Var.f12917a) && wj50.m88271j(this.f12918b, a71Var.f12918b);
    }

    public final int hashCode() {
        int iHashCode = this.f12917a.hashCode() * 31;
        String str = this.f12918b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
