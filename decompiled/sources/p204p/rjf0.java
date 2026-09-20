package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rjf0 {

    /* JADX INFO: renamed from: a */
    public final yhr f199824a;

    /* JADX INFO: renamed from: b */
    public final onl0 f199825b;

    public rjf0(yhr yhrVar, onl0 onl0Var) {
        this.f199824a = yhrVar;
        this.f199825b = onl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjf0)) {
            return false;
        }
        rjf0 rjf0Var = (rjf0) obj;
        return wj50.m88271j(this.f199824a, rjf0Var.f199824a) && this.f199825b == rjf0Var.f199825b;
    }

    public final int hashCode() {
        return this.f199825b.hashCode() + (this.f199824a.hashCode() * 31);
    }
}
