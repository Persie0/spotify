package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pyc0 implements uyc0 {

    /* JADX INFO: renamed from: a */
    public final String f183387a;

    /* JADX INFO: renamed from: b */
    public final boolean f183388b;

    public pyc0(String str, boolean z) {
        this.f183387a = str;
        this.f183388b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyc0)) {
            return false;
        }
        pyc0 pyc0Var = (pyc0) obj;
        return wj50.m88271j(this.f183387a, pyc0Var.f183387a) && this.f183388b == pyc0Var.f183388b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183388b) + (this.f183387a.hashCode() * 31);
    }
}
