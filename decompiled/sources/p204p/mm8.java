package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mm8 {

    /* JADX INFO: renamed from: a */
    public final eq9 f145070a;

    public mm8(eq9 eq9Var) {
        this.f145070a = eq9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm8) && wj50.m88271j(this.f145070a, ((mm8) obj).f145070a);
    }

    public final int hashCode() {
        eq9 eq9Var = this.f145070a;
        if (eq9Var == null) {
            return 0;
        }
        return eq9Var.hashCode();
    }
}
