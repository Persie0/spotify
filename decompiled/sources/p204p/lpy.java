package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lpy {

    /* JADX INFO: renamed from: a */
    public final ffj0 f135859a;

    /* JADX INFO: renamed from: b */
    public final int f135860b;

    public lpy(ffj0 ffj0Var, int i) {
        this.f135859a = ffj0Var;
        this.f135860b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpy)) {
            return false;
        }
        lpy lpyVar = (lpy) obj;
        return this.f135859a == lpyVar.f135859a && this.f135860b == lpyVar.f135860b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135860b) + (this.f135859a.hashCode() * 31);
    }
}
