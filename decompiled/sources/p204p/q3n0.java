package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q3n0 {

    /* JADX INFO: renamed from: a */
    public final int f184900a;

    /* JADX INFO: renamed from: b */
    public final String f184901b;

    public q3n0(int i, String str) {
        this.f184900a = i;
        this.f184901b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3n0)) {
            return false;
        }
        q3n0 q3n0Var = (q3n0) obj;
        return this.f184900a == q3n0Var.f184900a && wj50.m88271j(this.f184901b, q3n0Var.f184901b);
    }

    public final int hashCode() {
        return this.f184901b.hashCode() + (edb.m38547C(this.f184900a) * 31);
    }
}
