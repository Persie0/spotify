package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h1q0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f86680a;

    /* JADX INFO: renamed from: b */
    public final String f86681b;

    public h1q0(int i, String str) {
        this.f86680a = i;
        this.f86681b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1q0)) {
            return false;
        }
        h1q0 h1q0Var = (h1q0) obj;
        return this.f86680a == h1q0Var.f86680a && wj50.m88271j(this.f86681b, h1q0Var.f86681b);
    }

    public final int hashCode() {
        return this.f86681b.hashCode() + (edb.m38547C(this.f86680a) * 31);
    }
}
