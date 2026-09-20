package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tp1 implements jq1 {

    /* JADX INFO: renamed from: a */
    public final zl1 f222378a;

    /* JADX INFO: renamed from: b */
    public final List f222379b;

    public tp1(zl1 zl1Var, List list) {
        this.f222378a = zl1Var;
        this.f222379b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp1)) {
            return false;
        }
        tp1 tp1Var = (tp1) obj;
        return wj50.m88271j(this.f222378a, tp1Var.f222378a) && wj50.m88271j(this.f222379b, tp1Var.f222379b);
    }

    public final int hashCode() {
        return this.f222379b.hashCode() + (this.f222378a.hashCode() * 31);
    }
}
