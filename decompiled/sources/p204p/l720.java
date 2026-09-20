package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class l720 {

    /* JADX INFO: renamed from: a */
    public final String f130550a;

    /* JADX INFO: renamed from: b */
    public final ba8 f130551b;

    /* JADX INFO: renamed from: c */
    public final List f130552c;

    public l720(String str, ba8 ba8Var, List list) {
        this.f130550a = str;
        this.f130551b = ba8Var;
        this.f130552c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l720)) {
            return false;
        }
        l720 l720Var = (l720) obj;
        return wj50.m88271j(this.f130550a, l720Var.f130550a) && wj50.m88271j(this.f130551b, l720Var.f130551b) && wj50.m88271j(this.f130552c, l720Var.f130552c);
    }

    public final int hashCode() {
        String str = this.f130550a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ba8 ba8Var = this.f130551b;
        int iHashCode2 = (iHashCode + (ba8Var == null ? 0 : ba8Var.hashCode())) * 31;
        List list = this.f130552c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
