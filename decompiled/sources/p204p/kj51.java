package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kj51 implements qi51 {

    /* JADX INFO: renamed from: a */
    public final mj51 f123250a;

    public kj51(mj51 mj51Var) {
        this.f123250a = mj51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj51) && wj50.m88271j(this.f123250a, ((kj51) obj).f123250a);
    }

    public final int hashCode() {
        return this.f123250a.hashCode();
    }
}
