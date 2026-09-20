package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xsi {

    /* JADX INFO: renamed from: a */
    public final String f265597a;

    /* JADX INFO: renamed from: b */
    public final gve0 f265598b;

    public xsi(gve0 gve0Var) {
        this.f265597a = "device_predictability_".concat(gve0Var.f84738a);
        this.f265598b = gve0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsi) && this.f265598b == ((xsi) obj).f265598b;
    }

    public final int hashCode() {
        return this.f265598b.hashCode();
    }
}
