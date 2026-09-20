package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vl71 implements zl71 {

    /* JADX INFO: renamed from: a */
    public final String f242396a;

    /* JADX INFO: renamed from: b */
    public final vvk f242397b;

    public vl71(String str, vvk vvkVar) {
        this.f242396a = str;
        this.f242397b = vvkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl71)) {
            return false;
        }
        vl71 vl71Var = (vl71) obj;
        return wj50.m88271j(this.f242396a, vl71Var.f242396a) && wj50.m88271j(this.f242397b, vl71Var.f242397b);
    }

    public final int hashCode() {
        return this.f242397b.hashCode() + (this.f242396a.hashCode() * 31);
    }
}
