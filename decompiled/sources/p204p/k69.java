package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k69 implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f119693a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f119694b;

    /* JADX INFO: renamed from: c */
    public final String f119695c;

    public k69(int i, String str, ArrayList arrayList) {
        this.f119693a = i;
        this.f119694b = arrayList;
        this.f119695c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k69)) {
            return false;
        }
        k69 k69Var = (k69) obj;
        return this.f119693a == k69Var.f119693a && this.f119694b.equals(k69Var.f119694b) && wj50.m88271j(this.f119695c, k69Var.f119695c);
    }

    public final int hashCode() {
        return this.f119695c.hashCode() + lq51.m59700f(this.f119694b, Integer.hashCode(this.f119693a) * 31, 31);
    }
}
