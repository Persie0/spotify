package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gf10 {

    /* JADX INFO: renamed from: a */
    public final boolean f79247a;

    /* JADX INFO: renamed from: b */
    public final tf10 f79248b;

    public gf10(boolean z, tf10 tf10Var) {
        this.f79247a = z;
        this.f79248b = tf10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf10)) {
            return false;
        }
        gf10 gf10Var = (gf10) obj;
        return this.f79247a == gf10Var.f79247a && this.f79248b.equals(gf10Var.f79248b);
    }

    public final int hashCode() {
        return this.f79248b.hashCode() + (Boolean.hashCode(this.f79247a) * 31);
    }
}
