package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jue0 extends lue0 {

    /* JADX INFO: renamed from: a */
    public final zke0 f116103a;

    /* JADX INFO: renamed from: b */
    public final int f116104b;

    public jue0(zke0 zke0Var, int i) {
        this.f116103a = zke0Var;
        this.f116104b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jue0)) {
            return false;
        }
        jue0 jue0Var = (jue0) obj;
        return this.f116103a.equals(jue0Var.f116103a) && this.f116104b == jue0Var.f116104b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f116104b) + (this.f116103a.hashCode() * 31);
    }
}
