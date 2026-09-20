package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fdb1 {

    /* JADX INFO: renamed from: a */
    public final String f68453a;

    /* JADX INFO: renamed from: b */
    public final String f68454b;

    /* JADX INFO: renamed from: c */
    public final List f68455c;

    public fdb1(String str, List list, String str2) {
        this.f68453a = str;
        this.f68454b = str2;
        this.f68455c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdb1)) {
            return false;
        }
        fdb1 fdb1Var = (fdb1) obj;
        return wj50.m88271j(this.f68453a, fdb1Var.f68453a) && wj50.m88271j(this.f68454b, fdb1Var.f68454b) && wj50.m88271j(this.f68455c, fdb1Var.f68455c);
    }

    public final int hashCode() {
        return this.f68455c.hashCode() + s571.m77243b(this.f68453a.hashCode() * 31, 31, this.f68454b);
    }
}
