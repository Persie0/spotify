package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yfr0 {

    /* JADX INFO: renamed from: a */
    public final lt10 f272323a;

    /* JADX INFO: renamed from: b */
    public final int f272324b;

    public yfr0(lt10 lt10Var, int i) {
        this.f272323a = lt10Var;
        this.f272324b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfr0)) {
            return false;
        }
        yfr0 yfr0Var = (yfr0) obj;
        return wj50.m88271j(this.f272323a, yfr0Var.f272323a) && this.f272324b == yfr0Var.f272324b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272324b) + (this.f272323a.hashCode() * 31);
    }
}
