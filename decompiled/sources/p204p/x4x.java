package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class x4x {

    /* JADX INFO: renamed from: a */
    public final w4x f258205a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f258206b;

    /* JADX INFO: renamed from: c */
    public final boolean f258207c;

    /* JADX INFO: renamed from: d */
    public final String f258208d;

    /* JADX INFO: renamed from: e */
    public final int f258209e;

    public x4x(w4x w4xVar, ArrayList arrayList, boolean z, String str, int i) {
        this.f258205a = w4xVar;
        this.f258206b = arrayList;
        this.f258207c = z;
        this.f258208d = str;
        this.f258209e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4x)) {
            return false;
        }
        x4x x4xVar = (x4x) obj;
        return this.f258205a.equals(x4xVar.f258205a) && this.f258206b.equals(x4xVar.f258206b) && this.f258207c == x4xVar.f258207c && wj50.m88271j(this.f258208d, x4xVar.f258208d) && this.f258209e == x4xVar.f258209e;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(lq51.m59700f(this.f258206b, this.f258205a.hashCode() * 31, 31), 31, this.f258207c);
        String str = this.f258208d;
        return Integer.hashCode(this.f258209e) + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
