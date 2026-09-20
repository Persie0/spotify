package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class xce0 {

    /* JADX INFO: renamed from: a */
    public final String f260212a;

    /* JADX INFO: renamed from: b */
    public final String f260213b;

    /* JADX INFO: renamed from: c */
    public final w8e0 f260214c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f260215d;

    /* JADX INFO: renamed from: e */
    public final boolean f260216e;

    /* JADX INFO: renamed from: f */
    public final String f260217f;

    public xce0(String str, String str2, w8e0 w8e0Var, ArrayList arrayList, boolean z, String str3) {
        this.f260212a = str;
        this.f260213b = str2;
        this.f260214c = w8e0Var;
        this.f260215d = arrayList;
        this.f260216e = z;
        this.f260217f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xce0)) {
            return false;
        }
        xce0 xce0Var = (xce0) obj;
        return wj50.m88271j(this.f260212a, xce0Var.f260212a) && wj50.m88271j(this.f260213b, xce0Var.f260213b) && wj50.m88271j(this.f260214c, xce0Var.f260214c) && this.f260215d.equals(xce0Var.f260215d) && this.f260216e == xce0Var.f260216e && this.f260217f.equals(xce0Var.f260217f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f260212a.hashCode() * 31, 31, this.f260213b);
        w8e0 w8e0Var = this.f260214c;
        return this.f260217f.hashCode() + s571.m77245d(lq51.m59700f(this.f260215d, (iM77243b + (w8e0Var == null ? 0 : w8e0Var.hashCode())) * 31, 31), 31, this.f260216e);
    }
}
