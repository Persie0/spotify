package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class osi implements rsi {

    /* JADX INFO: renamed from: a */
    public final String f168823a;

    /* JADX INFO: renamed from: b */
    public final yx61 f168824b;

    public osi(String str, yx61 yx61Var) {
        this.f168823a = str;
        this.f168824b = yx61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osi)) {
            return false;
        }
        osi osiVar = (osi) obj;
        return wj50.m88271j(this.f168823a, osiVar.f168823a) && this.f168824b == osiVar.f168824b;
    }

    public final int hashCode() {
        int iHashCode = this.f168823a.hashCode() * 31;
        yx61 yx61Var = this.f168824b;
        return iHashCode + (yx61Var == null ? 0 : yx61Var.hashCode());
    }
}
