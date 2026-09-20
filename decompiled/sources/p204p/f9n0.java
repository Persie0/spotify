package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f9n0 extends j9n0 {

    /* JADX INFO: renamed from: a */
    public final String f67307a;

    /* JADX INFO: renamed from: b */
    public final boolean f67308b;

    public f9n0(String str, boolean z) {
        this.f67307a = str;
        this.f67308b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9n0)) {
            return false;
        }
        f9n0 f9n0Var = (f9n0) obj;
        return wj50.m88271j(this.f67307a, f9n0Var.f67307a) && this.f67308b == f9n0Var.f67308b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67308b) + (this.f67307a.hashCode() * 31);
    }

    public final String toString() {
        return "PasswordInputChanged()";
    }
}
