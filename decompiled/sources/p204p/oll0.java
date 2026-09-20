package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class oll0 {

    /* JADX INFO: renamed from: a */
    public final int f166859a;

    /* JADX INFO: renamed from: b */
    public final ull0 f166860b;

    public oll0(int i, ull0 ull0Var) {
        this.f166859a = i;
        this.f166860b = ull0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oll0)) {
            return false;
        }
        oll0 oll0Var = (oll0) obj;
        return this.f166859a == oll0Var.f166859a && this.f166860b.equals(oll0Var.f166860b);
    }

    public final int hashCode() {
        return this.f166860b.hashCode() + (edb.m38547C(this.f166859a) * 31);
    }
}
