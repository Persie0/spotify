package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final String f185169a;

    /* JADX INFO: renamed from: b */
    public final u9z f185170b;

    /* JADX INFO: renamed from: c */
    public final int f185171c;

    public q4e1(String str, u9z u9zVar, int i) {
        this.f185169a = str;
        this.f185170b = u9zVar;
        this.f185171c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4e1)) {
            return false;
        }
        q4e1 q4e1Var = (q4e1) obj;
        return wj50.m88271j(this.f185169a, q4e1Var.f185169a) && this.f185170b == q4e1Var.f185170b && this.f185171c == q4e1Var.f185171c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f185171c) + ((this.f185170b.hashCode() + (this.f185169a.hashCode() * 31)) * 31);
    }
}
