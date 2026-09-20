package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nh11 implements ph11 {

    /* JADX INFO: renamed from: a */
    public final boolean f153842a;

    /* JADX INFO: renamed from: b */
    public final boolean f153843b;

    public nh11(boolean z, boolean z2) {
        this.f153842a = z;
        this.f153843b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh11)) {
            return false;
        }
        nh11 nh11Var = (nh11) obj;
        return this.f153842a == nh11Var.f153842a && this.f153843b == nh11Var.f153843b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153843b) + (Boolean.hashCode(this.f153842a) * 31);
    }
}
