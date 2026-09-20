package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xks0 {

    /* JADX INFO: renamed from: a */
    public final List f262931a;

    /* JADX INFO: renamed from: b */
    public final eh00 f262932b;

    public xks0(List list, eh00 eh00Var) {
        this.f262931a = list;
        this.f262932b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xks0)) {
            return false;
        }
        xks0 xks0Var = (xks0) obj;
        return wj50.m88271j(this.f262931a, xks0Var.f262931a) && wj50.m88271j(this.f262932b, xks0Var.f262932b);
    }

    public final int hashCode() {
        return this.f262932b.hashCode() + (this.f262931a.hashCode() * 31);
    }
}
