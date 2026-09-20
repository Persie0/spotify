package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class n9x {

    /* JADX INFO: renamed from: a */
    public final ArrayList f151878a;

    /* JADX INFO: renamed from: b */
    public final int f151879b;

    /* JADX INFO: renamed from: c */
    public final String f151880c;

    /* JADX INFO: renamed from: d */
    public final Integer f151881d;

    public n9x(ArrayList arrayList, int i, String str, Integer num) {
        this.f151878a = arrayList;
        this.f151879b = i;
        this.f151880c = str;
        this.f151881d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9x)) {
            return false;
        }
        n9x n9xVar = (n9x) obj;
        return this.f151878a.equals(n9xVar.f151878a) && this.f151879b == n9xVar.f151879b && this.f151880c.equals(n9xVar.f151880c) && wj50.m88271j(this.f151881d, n9xVar.f151881d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f151879b, this.f151878a.hashCode() * 31, 31), 31, this.f151880c);
        Integer num = this.f151881d;
        return iM77243b + (num == null ? 0 : num.hashCode());
    }
}
