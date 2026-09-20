package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b9u0 implements f9u0 {

    /* JADX INFO: renamed from: a */
    public final String f25001a;

    /* JADX INFO: renamed from: b */
    public final int f25002b;

    /* JADX INFO: renamed from: c */
    public final boolean f25003c;

    public b9u0(String str, int i, boolean z) {
        this.f25001a = str;
        this.f25002b = i;
        this.f25003c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9u0)) {
            return false;
        }
        b9u0 b9u0Var = (b9u0) obj;
        return wj50.m88271j(this.f25001a, b9u0Var.f25001a) && this.f25002b == b9u0Var.f25002b && this.f25003c == b9u0Var.f25003c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25003c) + mt60.m62800g(this.f25002b, this.f25001a.hashCode() * 31, 31);
    }
}
