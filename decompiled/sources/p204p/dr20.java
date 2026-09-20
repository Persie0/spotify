package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dr20 {

    /* JADX INFO: renamed from: a */
    public final boolean f52152a;

    /* JADX INFO: renamed from: b */
    public final boolean f52153b;

    public dr20(boolean z, boolean z2) {
        this.f52152a = z;
        this.f52153b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr20)) {
            return false;
        }
        dr20 dr20Var = (dr20) obj;
        return this.f52152a == dr20Var.f52152a && this.f52153b == dr20Var.f52153b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52153b) + (Boolean.hashCode(this.f52152a) * 31);
    }
}
