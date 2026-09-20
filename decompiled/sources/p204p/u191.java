package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u191 {

    /* JADX INFO: renamed from: a */
    public final int f225728a;

    /* JADX INFO: renamed from: b */
    public final int f225729b;

    public u191(int i, int i2) {
        this.f225728a = i;
        this.f225729b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u191)) {
            return false;
        }
        u191 u191Var = (u191) obj;
        return this.f225728a == u191Var.f225728a && this.f225729b == u191Var.f225729b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f225729b) + (Integer.hashCode(this.f225728a) * 31);
    }
}
