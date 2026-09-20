package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cv20 implements gv20 {

    /* JADX INFO: renamed from: a */
    public final c96 f42273a;

    /* JADX INFO: renamed from: b */
    public final c96 f42274b;

    public cv20(c96 c96Var, c96 c96Var2) {
        this.f42273a = c96Var;
        this.f42274b = c96Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv20)) {
            return false;
        }
        cv20 cv20Var = (cv20) obj;
        return wj50.m88271j(this.f42273a, cv20Var.f42273a) && wj50.m88271j(this.f42274b, cv20Var.f42274b);
    }

    public final int hashCode() {
        return this.f42274b.hashCode() + (this.f42273a.hashCode() * 31);
    }
}
