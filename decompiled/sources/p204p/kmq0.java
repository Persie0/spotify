package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kmq0 {

    /* JADX INFO: renamed from: a */
    public final jmq0 f124198a;

    /* JADX INFO: renamed from: b */
    public final int f124199b;

    public kmq0(jmq0 jmq0Var, int i) {
        this.f124198a = jmq0Var;
        this.f124199b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmq0)) {
            return false;
        }
        kmq0 kmq0Var = (kmq0) obj;
        return wj50.m88271j(this.f124198a, kmq0Var.f124198a) && this.f124199b == kmq0Var.f124199b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f124199b) + (this.f124198a.hashCode() * 31);
    }
}
