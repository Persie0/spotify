package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ev20 implements gv20 {

    /* JADX INFO: renamed from: a */
    public final c96 f63128a;

    /* JADX INFO: renamed from: b */
    public final c96 f63129b;

    public ev20(c96 c96Var, c96 c96Var2) {
        this.f63128a = c96Var;
        this.f63129b = c96Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev20)) {
            return false;
        }
        ev20 ev20Var = (ev20) obj;
        return wj50.m88271j(this.f63128a, ev20Var.f63128a) && wj50.m88271j(this.f63129b, ev20Var.f63129b);
    }

    public final int hashCode() {
        return this.f63129b.hashCode() + (this.f63128a.hashCode() * 31);
    }
}
