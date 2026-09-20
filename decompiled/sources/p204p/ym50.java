package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ym50 extends an50 {

    /* JADX INFO: renamed from: a */
    public final boolean f274160a;

    /* JADX INFO: renamed from: b */
    public final String f274161b;

    /* JADX INFO: renamed from: c */
    public final noa1 f274162c;

    public ym50(boolean z, String str, noa1 noa1Var) {
        this.f274160a = z;
        this.f274161b = str;
        this.f274162c = noa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym50)) {
            return false;
        }
        ym50 ym50Var = (ym50) obj;
        return this.f274160a == ym50Var.f274160a && this.f274161b.equals(ym50Var.f274161b) && wj50.m88271j(this.f274162c, ym50Var.f274162c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Boolean.hashCode(this.f274160a) * 31, 31, this.f274161b);
        noa1 noa1Var = this.f274162c;
        return iM77243b + (noa1Var == null ? 0 : noa1Var.hashCode());
    }
}
