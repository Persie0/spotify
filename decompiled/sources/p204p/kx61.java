package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kx61 {

    /* JADX INFO: renamed from: a */
    public final String f127341a;

    /* JADX INFO: renamed from: b */
    public final qx61 f127342b;

    public kx61(String str, qx61 qx61Var) {
        this.f127341a = str;
        this.f127342b = qx61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx61)) {
            return false;
        }
        kx61 kx61Var = (kx61) obj;
        return wj50.m88271j(this.f127341a, kx61Var.f127341a) && this.f127342b == kx61Var.f127342b;
    }

    public final int hashCode() {
        String str = this.f127341a;
        return this.f127342b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
