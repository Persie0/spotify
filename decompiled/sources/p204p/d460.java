package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d460 implements f460 {

    /* JADX INFO: renamed from: a */
    public final String f45091a;

    /* JADX INFO: renamed from: b */
    public final int f45092b;

    public d460(String str, int i) {
        this.f45091a = str;
        this.f45092b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d460)) {
            return false;
        }
        d460 d460Var = (d460) obj;
        return this.f45091a.equals(d460Var.f45091a) && this.f45092b == d460Var.f45092b;
    }

    public final int hashCode() {
        int iHashCode = this.f45091a.hashCode() * 31;
        int i = this.f45092b;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }
}
