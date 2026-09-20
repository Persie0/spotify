package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ytq0 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f276196a;

    /* JADX INFO: renamed from: b */
    public final boolean f276197b;

    public ytq0(ebf0 ebf0Var, boolean z) {
        this.f276196a = ebf0Var;
        this.f276197b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytq0)) {
            return false;
        }
        ytq0 ytq0Var = (ytq0) obj;
        return wj50.m88271j(this.f276196a, ytq0Var.f276196a) && this.f276197b == ytq0Var.f276197b;
    }

    public final int hashCode() {
        ebf0 ebf0Var = this.f276196a;
        return Boolean.hashCode(this.f276197b) + ((ebf0Var == null ? 0 : ebf0Var.f57921a.hashCode()) * 31);
    }
}
