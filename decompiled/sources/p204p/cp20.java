package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cp20 extends gp20 {

    /* JADX INFO: renamed from: a */
    public final zo20 f40404a;

    /* JADX INFO: renamed from: b */
    public final fyj f40405b;

    /* JADX INFO: renamed from: c */
    public final boolean f40406c;

    public cp20(zo20 zo20Var, fyj fyjVar, boolean z) {
        this.f40404a = zo20Var;
        this.f40405b = fyjVar;
        this.f40406c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp20)) {
            return false;
        }
        cp20 cp20Var = (cp20) obj;
        return wj50.m88271j(this.f40404a, cp20Var.f40404a) && wj50.m88271j(this.f40405b, cp20Var.f40405b) && this.f40406c == cp20Var.f40406c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40406c) + ((this.f40405b.hashCode() + (this.f40404a.hashCode() * 31)) * 31);
    }
}
