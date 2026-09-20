package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dd1 {

    /* JADX INFO: renamed from: a */
    public final ty80 f47689a;

    /* JADX INFO: renamed from: b */
    public final boolean f47690b;

    public dd1(ty80 ty80Var, boolean z) {
        this.f47689a = ty80Var;
        this.f47690b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd1)) {
            return false;
        }
        dd1 dd1Var = (dd1) obj;
        return wj50.m88271j(this.f47689a, dd1Var.f47689a) && this.f47690b == dd1Var.f47690b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f47690b) + (this.f47689a.hashCode() * 31);
    }
}
