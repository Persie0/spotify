package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nn2 {

    /* JADX INFO: renamed from: a */
    public final int f156316a;

    /* JADX INFO: renamed from: b */
    public final mn2 f156317b;

    public nn2(int i, mn2 mn2Var) {
        this.f156316a = i;
        this.f156317b = mn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn2)) {
            return false;
        }
        nn2 nn2Var = (nn2) obj;
        return this.f156316a == nn2Var.f156316a && this.f156317b.equals(nn2Var.f156317b);
    }

    public final int hashCode() {
        return this.f156317b.hashCode() + (edb.m38547C(this.f156316a) * 31);
    }
}
