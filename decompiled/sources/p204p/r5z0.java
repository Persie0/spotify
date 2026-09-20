package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class r5z0 extends j6z0 {

    /* JADX INFO: renamed from: a */
    public final String f196147a;

    /* JADX INFO: renamed from: b */
    public final String f196148b;

    /* JADX INFO: renamed from: c */
    public final String f196149c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f196150d;

    /* JADX INFO: renamed from: e */
    public final boolean f196151e;

    public r5z0(String str, String str2, String str3, ArrayList arrayList, boolean z) {
        this.f196147a = str;
        this.f196148b = str2;
        this.f196149c = str3;
        this.f196150d = arrayList;
        this.f196151e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5z0)) {
            return false;
        }
        r5z0 r5z0Var = (r5z0) obj;
        return wj50.m88271j(this.f196147a, r5z0Var.f196147a) && wj50.m88271j(this.f196148b, r5z0Var.f196148b) && wj50.m88271j(this.f196149c, r5z0Var.f196149c) && this.f196150d.equals(r5z0Var.f196150d) && this.f196151e == r5z0Var.f196151e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196151e) + lq51.m59700f(this.f196150d, s571.m77243b(s571.m77243b(this.f196147a.hashCode() * 31, 31, this.f196148b), 31, this.f196149c), 31);
    }
}
