package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class af0 {

    /* JADX INFO: renamed from: a */
    public final String f14994a;

    /* JADX INFO: renamed from: b */
    public final fb80 f14995b;

    public af0(String str, fb80 fb80Var) {
        this.f14994a = str;
        this.f14995b = fb80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af0)) {
            return false;
        }
        af0 af0Var = (af0) obj;
        return wj50.m88271j(this.f14994a, af0Var.f14994a) && this.f14995b == af0Var.f14995b;
    }

    public final int hashCode() {
        return this.f14995b.hashCode() + (this.f14994a.hashCode() * 31);
    }
}
