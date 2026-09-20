package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rd7 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f198051a;

    /* JADX INFO: renamed from: b */
    public final v64 f198052b;

    public rd7(v64 v64Var, boolean z) {
        this.f198051a = z;
        this.f198052b = v64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd7)) {
            return false;
        }
        rd7 rd7Var = (rd7) obj;
        return this.f198051a == rd7Var.f198051a && this.f198052b == rd7Var.f198052b;
    }

    public final int hashCode() {
        return this.f198052b.hashCode() + (Boolean.hashCode(this.f198051a) * 31);
    }
}
