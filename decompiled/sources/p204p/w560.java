package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class w560 implements kwh0 {

    /* JADX INFO: renamed from: a */
    public final String f248008a;

    /* JADX INFO: renamed from: b */
    public final String f248009b;

    /* JADX INFO: renamed from: c */
    public final boolean f248010c;

    /* JADX INFO: renamed from: d */
    public final boolean f248011d;

    /* JADX INFO: renamed from: e */
    public final List f248012e;

    public /* synthetic */ w560(int i) {
        this(null, null, (i & 4) != 0, false, lau.f131415a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w560)) {
            return false;
        }
        w560 w560Var = (w560) obj;
        return wj50.m88271j(this.f248008a, w560Var.f248008a) && wj50.m88271j(this.f248009b, w560Var.f248009b) && this.f248010c == w560Var.f248010c && this.f248011d == w560Var.f248011d && wj50.m88271j(this.f248012e, w560Var.f248012e);
    }

    public final int hashCode() {
        String str = this.f248008a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f248009b;
        return this.f248012e.hashCode() + s571.m77245d(s571.m77245d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f248010c), 31, this.f248011d);
    }

    public w560(String str, String str2, boolean z, boolean z2, List list) {
        this.f248008a = str;
        this.f248009b = str2;
        this.f248010c = z;
        this.f248011d = z2;
        this.f248012e = list;
    }
}
