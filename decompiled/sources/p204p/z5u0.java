package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class z5u0 {

    /* JADX INFO: renamed from: a */
    public final List f279636a;

    /* JADX INFO: renamed from: b */
    public final String f279637b;

    public z5u0(List list, String str) {
        this.f279636a = list;
        this.f279637b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5u0)) {
            return false;
        }
        z5u0 z5u0Var = (z5u0) obj;
        return wj50.m88271j(this.f279636a, z5u0Var.f279636a) && wj50.m88271j(this.f279637b, z5u0Var.f279637b);
    }

    public final int hashCode() {
        int iHashCode = this.f279636a.hashCode() * 31;
        String str = this.f279637b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
