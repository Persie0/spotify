package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l920 {

    /* JADX INFO: renamed from: a */
    public final yqx0 f130986a;

    /* JADX INFO: renamed from: b */
    public final int f130987b;

    public l920(yqx0 yqx0Var, int i) {
        this.f130986a = yqx0Var;
        this.f130987b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l920)) {
            return false;
        }
        l920 l920Var = (l920) obj;
        return wj50.m88271j(this.f130986a, l920Var.f130986a) && this.f130987b == l920Var.f130987b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130987b) + (this.f130986a.hashCode() * 31);
    }
}
