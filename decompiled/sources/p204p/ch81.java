package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ch81 {

    /* JADX INFO: renamed from: a */
    public final bh81 f37960a;

    /* JADX INFO: renamed from: b */
    public final yg81 f37961b;

    public ch81(bh81 bh81Var, yg81 yg81Var) {
        this.f37960a = bh81Var;
        this.f37961b = yg81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch81)) {
            return false;
        }
        ch81 ch81Var = (ch81) obj;
        return wj50.m88271j(this.f37960a, ch81Var.f37960a) && wj50.m88271j(this.f37961b, ch81Var.f37961b);
    }

    public final int hashCode() {
        return this.f37961b.hashCode() + (this.f37960a.hashCode() * 31);
    }
}
