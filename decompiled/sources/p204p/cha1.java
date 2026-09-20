package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cha1 {

    /* JADX INFO: renamed from: a */
    public final String f37972a;

    /* JADX INFO: renamed from: b */
    public final String f37973b;

    public cha1(String str, String str2) {
        this.f37972a = str;
        this.f37973b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cha1)) {
            return false;
        }
        cha1 cha1Var = (cha1) obj;
        return wj50.m88271j(this.f37972a, cha1Var.f37972a) && wj50.m88271j(this.f37973b, cha1Var.f37973b);
    }

    public final int hashCode() {
        return this.f37973b.hashCode() + (this.f37972a.hashCode() * 31);
    }
}
