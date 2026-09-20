package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class efe0 {

    /* JADX INFO: renamed from: a */
    public final String f59034a;

    /* JADX INFO: renamed from: b */
    public final boolean f59035b;

    public efe0(String str, boolean z) {
        this.f59034a = str;
        this.f59035b = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m38728a() {
        return this.f59034a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38729b() {
        return this.f59035b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efe0)) {
            return false;
        }
        efe0 efe0Var = (efe0) obj;
        return wj50.m88271j(this.f59034a, efe0Var.f59034a) && this.f59035b == efe0Var.f59035b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59035b) + (this.f59034a.hashCode() * 31);
    }
}
