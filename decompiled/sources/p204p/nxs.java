package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class nxs implements wxs {

    /* JADX INFO: renamed from: a */
    public final String f159585a;

    /* JADX INFO: renamed from: b */
    public final List f159586b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f159587c;

    /* JADX INFO: renamed from: d */
    public final blw0 f159588d;

    public nxs(String str, List list, ArrayList arrayList, blw0 blw0Var) {
        this.f159585a = str;
        this.f159586b = list;
        this.f159587c = arrayList;
        this.f159588d = blw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxs)) {
            return false;
        }
        nxs nxsVar = (nxs) obj;
        return this.f159585a.equals(nxsVar.f159585a) && wj50.m88271j(this.f159586b, nxsVar.f159586b) && this.f159587c.equals(nxsVar.f159587c) && wj50.m88271j(this.f159588d, nxsVar.f159588d);
    }

    public final int hashCode() {
        return this.f159588d.hashCode() + lq51.m59700f(this.f159587c, s571.m77244c(this.f159585a.hashCode() * 31, 31, this.f159586b), 31);
    }
}
