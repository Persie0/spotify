package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dzs0 {

    /* JADX INFO: renamed from: a */
    public final vco f54731a;

    /* JADX INFO: renamed from: b */
    public final o5a0 f54732b;

    public dzs0(vco vcoVar, o5a0 o5a0Var) {
        this.f54731a = vcoVar;
        this.f54732b = o5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzs0)) {
            return false;
        }
        dzs0 dzs0Var = (dzs0) obj;
        return wj50.m88271j(this.f54731a, dzs0Var.f54731a) && wj50.m88271j(this.f54732b, dzs0Var.f54732b);
    }

    public final int hashCode() {
        return this.f54732b.hashCode() + (this.f54731a.hashCode() * 31);
    }
}
