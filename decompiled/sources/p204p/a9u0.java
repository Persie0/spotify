package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a9u0 {

    /* JADX INFO: renamed from: a */
    public final boolean f13640a;

    /* JADX INFO: renamed from: b */
    public final String f13641b;

    /* JADX INFO: renamed from: c */
    public final int f13642c;

    public a9u0(boolean z, String str, int i) {
        this.f13640a = z;
        this.f13641b = str;
        this.f13642c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9u0)) {
            return false;
        }
        a9u0 a9u0Var = (a9u0) obj;
        return this.f13640a == a9u0Var.f13640a && wj50.m88271j(this.f13641b, a9u0Var.f13641b) && this.f13642c == a9u0Var.f13642c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13642c) + s571.m77243b(Boolean.hashCode(this.f13640a) * 31, 31, this.f13641b);
    }
}
