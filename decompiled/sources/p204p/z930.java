package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z930 {

    /* JADX INFO: renamed from: a */
    public final t730 f280653a;

    public z930(t730 t730Var) {
        this.f280653a = t730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z930) && wj50.m88271j(this.f280653a, ((z930) obj).f280653a);
    }

    public final int hashCode() {
        t730 t730Var = this.f280653a;
        if (t730Var == null) {
            return 0;
        }
        return t730Var.hashCode();
    }
}
