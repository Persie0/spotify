package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b0d1 {

    /* JADX INFO: renamed from: a */
    public final String f21857a;

    /* JADX INFO: renamed from: b */
    public final String f21858b;

    public b0d1(String str, String str2) {
        this.f21857a = str;
        this.f21858b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0d1)) {
            return false;
        }
        b0d1 b0d1Var = (b0d1) obj;
        return wj50.m88271j(this.f21857a, b0d1Var.f21857a) && wj50.m88271j(this.f21858b, b0d1Var.f21858b);
    }

    public final int hashCode() {
        return this.f21858b.hashCode() + (this.f21857a.hashCode() * 31);
    }
}
