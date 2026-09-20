package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class su8 implements uu8 {

    /* JADX INFO: renamed from: a */
    public final String f214028a;

    /* JADX INFO: renamed from: b */
    public final lw8 f214029b;

    public su8(String str, lw8 lw8Var) {
        this.f214028a = str;
        this.f214029b = lw8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su8)) {
            return false;
        }
        su8 su8Var = (su8) obj;
        return wj50.m88271j(this.f214028a, su8Var.f214028a) && this.f214029b == su8Var.f214029b;
    }

    public final int hashCode() {
        return this.f214029b.hashCode() + (this.f214028a.hashCode() * 31);
    }
}
