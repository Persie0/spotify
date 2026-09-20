package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cfr0 implements dfr0 {

    /* JADX INFO: renamed from: a */
    public final String f37425a;

    /* JADX INFO: renamed from: b */
    public final boolean f37426b;

    public cfr0(String str, boolean z) {
        this.f37425a = str;
        this.f37426b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfr0)) {
            return false;
        }
        cfr0 cfr0Var = (cfr0) obj;
        return wj50.m88271j(this.f37425a, cfr0Var.f37425a) && this.f37426b == cfr0Var.f37426b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37426b) + (this.f37425a.hashCode() * 31);
    }
}
