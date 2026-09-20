package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sc61 {

    /* JADX INFO: renamed from: a */
    public final int f207653a;

    /* JADX INFO: renamed from: b */
    public final gc61 f207654b;

    public sc61(int i, gc61 gc61Var) {
        this.f207653a = i;
        this.f207654b = gc61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc61)) {
            return false;
        }
        sc61 sc61Var = (sc61) obj;
        return this.f207653a == sc61Var.f207653a && wj50.m88271j(this.f207654b, sc61Var.f207654b);
    }

    public final int hashCode() {
        return this.f207654b.hashCode() + (Integer.hashCode(this.f207653a) * 31);
    }
}
