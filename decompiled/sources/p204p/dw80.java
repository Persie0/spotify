package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dw80 implements ew80 {

    /* JADX INFO: renamed from: a */
    public final nt80 f53641a;

    public dw80(nt80 nt80Var) {
        this.f53641a = nt80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dw80) && wj50.m88271j(this.f53641a, ((dw80) obj).f53641a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f53641a.hashCode() * 31);
    }
}
