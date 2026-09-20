package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s550 {

    /* JADX INFO: renamed from: a */
    public final qf40 f205733a;

    /* JADX INFO: renamed from: b */
    public final String f205734b;

    public s550(String str, qf40 qf40Var) {
        this.f205733a = qf40Var;
        this.f205734b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s550)) {
            return false;
        }
        s550 s550Var = (s550) obj;
        return wj50.m88271j(this.f205733a, s550Var.f205733a) && wj50.m88271j(this.f205734b, s550Var.f205734b);
    }

    public final int hashCode() {
        int iHashCode = this.f205733a.hashCode() * 31;
        String str = this.f205734b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
