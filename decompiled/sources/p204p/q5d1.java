package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final int f185507a;

    /* JADX INFO: renamed from: b */
    public final String f185508b;

    public q5d1(int i, String str) {
        this.f185507a = i;
        this.f185508b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5d1)) {
            return false;
        }
        q5d1 q5d1Var = (q5d1) obj;
        return this.f185507a == q5d1Var.f185507a && wj50.m88271j(this.f185508b, q5d1Var.f185508b);
    }

    public final int hashCode() {
        return this.f185508b.hashCode() + (Integer.hashCode(this.f185507a) * 31);
    }
}
