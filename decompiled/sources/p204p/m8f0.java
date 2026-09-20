package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m8f0 implements fz0 {

    /* JADX INFO: renamed from: a */
    public final hy0 f141037a;

    public m8f0(hy0 hy0Var) {
        this.f141037a = hy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8f0) && wj50.m88271j(this.f141037a, ((m8f0) obj).f141037a);
    }

    public final int hashCode() {
        hy0 hy0Var = this.f141037a;
        if (hy0Var == null) {
            return 0;
        }
        return hy0Var.hashCode();
    }
}
