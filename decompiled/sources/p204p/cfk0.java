package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cfk0 {

    /* JADX INFO: renamed from: a */
    public final dfk0 f37397a;

    /* JADX INFO: renamed from: b */
    public final bfk0 f37398b;

    public cfk0(dfk0 dfk0Var, bfk0 bfk0Var) {
        this.f37397a = dfk0Var;
        this.f37398b = bfk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfk0)) {
            return false;
        }
        cfk0 cfk0Var = (cfk0) obj;
        return wj50.m88271j(this.f37397a, cfk0Var.f37397a) && wj50.m88271j(this.f37398b, cfk0Var.f37398b);
    }

    public final int hashCode() {
        dfk0 dfk0Var = this.f37397a;
        return this.f37398b.hashCode() + ((dfk0Var == null ? 0 : dfk0Var.hashCode()) * 31);
    }
}
