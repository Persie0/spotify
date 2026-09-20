package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u670 extends v670 {

    /* JADX INFO: renamed from: a */
    public final int f227235a;

    /* JADX INFO: renamed from: b */
    public final String f227236b;

    public u670(int i, String str) {
        this.f227235a = i;
        this.f227236b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u670)) {
            return false;
        }
        u670 u670Var = (u670) obj;
        return this.f227235a == u670Var.f227235a && wj50.m88271j(this.f227236b, u670Var.f227236b);
    }

    public final int hashCode() {
        return this.f227236b.hashCode() + (Integer.hashCode(this.f227235a) * 31);
    }
}
