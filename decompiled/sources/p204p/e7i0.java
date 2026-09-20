package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e7i0 {

    /* JADX INFO: renamed from: a */
    public final String f56942a;

    /* JADX INFO: renamed from: b */
    public final qe70 f56943b;

    /* JADX WARN: Multi-variable type inference failed */
    public e7i0(String str, eh00 eh00Var) {
        this.f56942a = str;
        this.f56943b = (qe70) eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7i0)) {
            return false;
        }
        e7i0 e7i0Var = (e7i0) obj;
        return wj50.m88271j(this.f56942a, e7i0Var.f56942a) && this.f56943b.equals(e7i0Var.f56943b);
    }

    public final int hashCode() {
        String str = this.f56942a;
        return this.f56943b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
