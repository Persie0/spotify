package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x12 extends a22 {

    /* JADX INFO: renamed from: e */
    public final String f257037e;

    /* JADX INFO: renamed from: f */
    public final m761 f257038f;

    /* JADX INFO: renamed from: g */
    public final int f257039g;

    public x12(String str, m761 m761Var, int i) {
        super(str, m761Var, i);
        this.f257037e = str;
        this.f257038f = m761Var;
        this.f257039g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x12)) {
            return false;
        }
        x12 x12Var = (x12) obj;
        return wj50.m88271j(this.f257037e, x12Var.f257037e) && this.f257038f == x12Var.f257038f && this.f257039g == x12Var.f257039g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257039g) + ((this.f257038f.hashCode() + (this.f257037e.hashCode() * 31)) * 31);
    }
}
