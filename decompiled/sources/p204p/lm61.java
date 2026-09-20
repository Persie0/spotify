package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lm61 {

    /* JADX INFO: renamed from: a */
    public final String f134804a;

    /* JADX INFO: renamed from: b */
    public final boolean f134805b;

    public lm61(String str, boolean z) {
        this.f134804a = str;
        this.f134805b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm61)) {
            return false;
        }
        lm61 lm61Var = (lm61) obj;
        return wj50.m88271j(this.f134804a, lm61Var.f134804a) && this.f134805b == lm61Var.f134805b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f134805b) + (this.f134804a.hashCode() * 31);
    }
}
