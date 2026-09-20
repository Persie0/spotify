package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c1w0 {

    /* JADX INFO: renamed from: a */
    public final String f33212a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f33213b;

    public c1w0(String str, v6w0 v6w0Var) {
        this.f33212a = str;
        this.f33213b = v6w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1w0)) {
            return false;
        }
        c1w0 c1w0Var = (c1w0) obj;
        return wj50.m88271j(this.f33212a, c1w0Var.f33212a) && this.f33213b.equals(c1w0Var.f33213b);
    }

    public final int hashCode() {
        return (this.f33213b.hashCode() + (this.f33212a.hashCode() * 31)) * 31;
    }
}
