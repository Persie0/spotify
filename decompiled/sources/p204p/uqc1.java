package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uqc1 {

    /* JADX INFO: renamed from: a */
    public final String f232977a;

    /* JADX INFO: renamed from: b */
    public final ker0 f232978b;

    public uqc1(String str, ker0 ker0Var) {
        this.f232977a = str;
        this.f232978b = ker0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqc1)) {
            return false;
        }
        uqc1 uqc1Var = (uqc1) obj;
        return wj50.m88271j(this.f232977a, uqc1Var.f232977a) && this.f232978b == uqc1Var.f232978b;
    }

    public final int hashCode() {
        return this.f232978b.hashCode() + (this.f232977a.hashCode() * 31);
    }
}
