package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class xca1 {

    /* JADX INFO: renamed from: a */
    public final String f260175a;

    /* JADX INFO: renamed from: b */
    public final boolean f260176b;

    /* JADX INFO: renamed from: c */
    public final boolean f260177c;

    /* JADX INFO: renamed from: d */
    public final boolean f260178d;

    /* JADX INFO: renamed from: e */
    public final boolean f260179e;

    /* JADX INFO: renamed from: f */
    public final Map f260180f;

    public xca1(String str, boolean z, boolean z2, boolean z3, boolean z4, Map map) {
        this.f260175a = str;
        this.f260176b = z;
        this.f260177c = z2;
        this.f260178d = z3;
        this.f260179e = z4;
        this.f260180f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xca1)) {
            return false;
        }
        xca1 xca1Var = (xca1) obj;
        return wj50.m88271j(this.f260175a, xca1Var.f260175a) && this.f260176b == xca1Var.f260176b && this.f260177c == xca1Var.f260177c && this.f260178d == xca1Var.f260178d && this.f260179e == xca1Var.f260179e && wj50.m88271j(this.f260180f, xca1Var.f260180f);
    }

    public final int hashCode() {
        return this.f260180f.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f260175a.hashCode() * 31, 31, this.f260176b), 31, this.f260177c), 31, this.f260178d), 31, this.f260179e);
    }
}
