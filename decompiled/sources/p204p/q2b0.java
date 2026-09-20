package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q2b0 {

    /* JADX INFO: renamed from: a */
    public final int f184580a;

    /* JADX INFO: renamed from: b */
    public final String f184581b;

    public q2b0(int i, String str) {
        this.f184580a = i;
        this.f184581b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2b0)) {
            return false;
        }
        q2b0 q2b0Var = (q2b0) obj;
        return this.f184580a == q2b0Var.f184580a && wj50.m88271j(this.f184581b, q2b0Var.f184581b);
    }

    public final int hashCode() {
        return this.f184581b.hashCode() + (Integer.hashCode(this.f184580a) * 31);
    }
}
