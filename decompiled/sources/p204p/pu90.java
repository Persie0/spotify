package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pu90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f181392a;

    /* JADX INFO: renamed from: b */
    public final my90 f181393b;

    public pu90(String str, my90 my90Var) {
        this.f181392a = str;
        this.f181393b = my90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu90)) {
            return false;
        }
        pu90 pu90Var = (pu90) obj;
        return wj50.m88271j(this.f181392a, pu90Var.f181392a) && wj50.m88271j(this.f181393b, pu90Var.f181393b);
    }

    public final int hashCode() {
        return this.f181393b.hashCode() + (this.f181392a.hashCode() * 31);
    }
}
