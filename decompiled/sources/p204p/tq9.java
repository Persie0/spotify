package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class tq9 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f222776a;

    /* JADX INFO: renamed from: b */
    public final Set f222777b;

    public tq9(Set set, boolean z) {
        this.f222776a = z;
        this.f222777b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq9)) {
            return false;
        }
        tq9 tq9Var = (tq9) obj;
        return this.f222776a == tq9Var.f222776a && wj50.m88271j(this.f222777b, tq9Var.f222777b);
    }

    public final int hashCode() {
        return this.f222777b.hashCode() + (Boolean.hashCode(this.f222776a) * 31);
    }

    public /* synthetic */ tq9(boolean z, int i) {
        this(gbu.f78413a, (i & 1) != 0 ? true : z);
    }
}
