package p204p;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes8.dex */
public final class l8j0 {

    /* JADX INFO: renamed from: a */
    public final k5j0 f130877a;

    /* JADX INFO: renamed from: b */
    public final k5j0 f130878b;

    /* JADX INFO: renamed from: c */
    public final Deque f130879c;

    /* JADX INFO: renamed from: d */
    public final Deque f130880d;

    public l8j0(k5j0 k5j0Var, k5j0 k5j0Var2, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.f130877a = k5j0Var;
        this.f130878b = k5j0Var2;
        this.f130879c = arrayDeque;
        this.f130880d = arrayDeque2;
    }

    /* JADX INFO: renamed from: a */
    public final Deque m58474a() {
        return this.f130879c;
    }

    /* JADX INFO: renamed from: b */
    public final k5j0 m58475b() {
        return this.f130877a;
    }

    /* JADX INFO: renamed from: c */
    public final Deque m58476c() {
        return this.f130880d;
    }

    /* JADX INFO: renamed from: d */
    public final k5j0 m58477d() {
        return this.f130878b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8j0)) {
            return false;
        }
        l8j0 l8j0Var = (l8j0) obj;
        return wj50.m88271j(this.f130877a, l8j0Var.f130877a) && wj50.m88271j(this.f130878b, l8j0Var.f130878b) && wj50.m88271j(this.f130879c, l8j0Var.f130879c) && wj50.m88271j(this.f130880d, l8j0Var.f130880d);
    }

    public final int hashCode() {
        k5j0 k5j0Var = this.f130877a;
        int iHashCode = (k5j0Var == null ? 0 : k5j0Var.hashCode()) * 31;
        k5j0 k5j0Var2 = this.f130878b;
        return this.f130880d.hashCode() + ((this.f130879c.hashCode() + ((iHashCode + (k5j0Var2 != null ? k5j0Var2.hashCode() : 0)) * 31)) * 31);
    }
}
