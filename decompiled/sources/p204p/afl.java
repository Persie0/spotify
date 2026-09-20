package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class afl implements ffl {

    /* JADX INFO: renamed from: a */
    public final ci20 f15171a;

    public afl(ci20 ci20Var) {
        this.f15171a = ci20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afl) && wj50.m88271j(this.f15171a, ((afl) obj).f15171a);
    }

    public final int hashCode() {
        return this.f15171a.hashCode();
    }
}
