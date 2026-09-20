package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class owo0 {

    /* JADX INFO: renamed from: a */
    public final String f170748a;

    /* JADX INFO: renamed from: b */
    public final boolean f170749b;

    public owo0(String str, boolean z) {
        this.f170748a = str;
        this.f170749b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owo0)) {
            return false;
        }
        owo0 owo0Var = (owo0) obj;
        return wj50.m88271j(this.f170748a, owo0Var.f170748a) && this.f170749b == owo0Var.f170749b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170749b) + (this.f170748a.hashCode() * 31);
    }
}
