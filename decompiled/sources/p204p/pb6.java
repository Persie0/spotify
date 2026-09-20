package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pb6 implements qb6 {

    /* JADX INFO: renamed from: a */
    public final int f175721a;

    /* JADX INFO: renamed from: b */
    public final String f175722b;

    public pb6(int i, String str) {
        this.f175721a = i;
        this.f175722b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb6)) {
            return false;
        }
        pb6 pb6Var = (pb6) obj;
        return this.f175721a == pb6Var.f175721a && wj50.m88271j(this.f175722b, pb6Var.f175722b);
    }

    public final int hashCode() {
        return this.f175722b.hashCode() + (Integer.hashCode(this.f175721a) * 31);
    }
}
