package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tcy0 implements vcy0 {

    /* JADX INFO: renamed from: a */
    public final ldy0 f219164a;

    public tcy0(ldy0 ldy0Var) {
        this.f219164a = ldy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcy0) && wj50.m88271j(this.f219164a, ((tcy0) obj).f219164a);
    }

    public final int hashCode() {
        ldy0 ldy0Var = this.f219164a;
        if (ldy0Var == null) {
            return 0;
        }
        return ldy0Var.hashCode();
    }
}
