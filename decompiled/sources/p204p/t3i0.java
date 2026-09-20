package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class t3i0 {

    /* JADX INFO: renamed from: a */
    public final List f216785a;

    /* JADX INFO: renamed from: b */
    public final String f216786b;

    public t3i0(List list, String str) {
        this.f216785a = list;
        this.f216786b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3i0)) {
            return false;
        }
        t3i0 t3i0Var = (t3i0) obj;
        return wj50.m88271j(this.f216785a, t3i0Var.f216785a) && wj50.m88271j(this.f216786b, t3i0Var.f216786b);
    }

    public final int hashCode() {
        int iHashCode = this.f216785a.hashCode() * 31;
        String str = this.f216786b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
