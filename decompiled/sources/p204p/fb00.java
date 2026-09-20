package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fb00 {

    /* JADX INFO: renamed from: a */
    public final wga1 f67681a;

    /* JADX INFO: renamed from: b */
    public final boolean f67682b;

    public fb00(wga1 wga1Var, boolean z) {
        this.f67681a = wga1Var;
        this.f67682b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb00)) {
            return false;
        }
        fb00 fb00Var = (fb00) obj;
        return wj50.m88271j(this.f67681a, fb00Var.f67681a) && this.f67682b == fb00Var.f67682b;
    }

    public final int hashCode() {
        wga1 wga1Var = this.f67681a;
        return Boolean.hashCode(this.f67682b) + ((wga1Var == null ? 0 : wga1Var.hashCode()) * 31);
    }
}
