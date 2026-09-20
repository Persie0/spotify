package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xoz0 implements pe10 {

    /* JADX INFO: renamed from: a */
    public final uoz0 f264392a;

    public xoz0(uoz0 uoz0Var) {
        this.f264392a = uoz0Var;
    }

    /* JADX INFO: renamed from: e */
    public final uoz0 m91575e() {
        return this.f264392a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xoz0) && wj50.m88271j(this.f264392a, ((xoz0) obj).f264392a);
    }

    public final int hashCode() {
        return this.f264392a.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.f264392a + ')';
    }
}
