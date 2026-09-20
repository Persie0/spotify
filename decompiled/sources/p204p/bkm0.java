package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bkm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f27977a;

    /* JADX INFO: renamed from: b */
    public final List f27978b;

    /* JADX INFO: renamed from: c */
    public final gkm0 f27979c;

    public bkm0(String str, List list, gkm0 gkm0Var) {
        this.f27977a = str;
        this.f27978b = list;
        this.f27979c = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkm0)) {
            return false;
        }
        bkm0 bkm0Var = (bkm0) obj;
        return wj50.m88271j(this.f27977a, bkm0Var.f27977a) && wj50.m88271j(this.f27978b, bkm0Var.f27978b) && wj50.m88271j(this.f27979c, bkm0Var.f27979c);
    }

    public final int hashCode() {
        return this.f27979c.hashCode() + s571.m77244c(this.f27977a.hashCode() * 31, 31, this.f27978b);
    }
}
