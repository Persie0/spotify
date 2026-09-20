package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k5q {

    /* JADX INFO: renamed from: a */
    public final x93 f119561a;

    /* JADX INFO: renamed from: b */
    public final List f119562b;

    public k5q(x93 x93Var, List list) {
        this.f119561a = x93Var;
        this.f119562b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5q)) {
            return false;
        }
        k5q k5qVar = (k5q) obj;
        return this.f119561a == k5qVar.f119561a && wj50.m88271j(this.f119562b, k5qVar.f119562b);
    }

    public final int hashCode() {
        return this.f119562b.hashCode() + (this.f119561a.hashCode() * 31);
    }
}
