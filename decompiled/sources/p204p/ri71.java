package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ri71 {

    /* JADX INFO: renamed from: a */
    public final sh71 f199450a;

    /* JADX INFO: renamed from: b */
    public final boolean f199451b;

    public ri71(sh71 sh71Var, boolean z) {
        this.f199450a = sh71Var;
        this.f199451b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri71)) {
            return false;
        }
        ri71 ri71Var = (ri71) obj;
        return this.f199450a == ri71Var.f199450a && this.f199451b == ri71Var.f199451b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199451b) + (this.f199450a.hashCode() * 31);
    }
}
