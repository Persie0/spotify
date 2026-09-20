package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p9e0 extends h1h1 {

    /* JADX INFO: renamed from: b */
    public final String f175219b;

    /* JADX INFO: renamed from: c */
    public final boolean f175220c;

    public p9e0(String str, boolean z) {
        this.f175219b = str;
        this.f175220c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9e0)) {
            return false;
        }
        p9e0 p9e0Var = (p9e0) obj;
        return wj50.m88271j(this.f175219b, p9e0Var.f175219b) && this.f175220c == p9e0Var.f175220c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175220c) + (this.f175219b.hashCode() * 31);
    }
}
