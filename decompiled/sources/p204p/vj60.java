package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vj60 {

    /* JADX INFO: renamed from: a */
    public final String f241877a;

    /* JADX INFO: renamed from: b */
    public final wj60 f241878b;

    public vj60(String str, wj60 wj60Var) {
        this.f241877a = str;
        this.f241878b = wj60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj60)) {
            return false;
        }
        vj60 vj60Var = (vj60) obj;
        return wj50.m88271j(this.f241877a, vj60Var.f241877a) && this.f241878b == vj60Var.f241878b;
    }

    public final int hashCode() {
        return this.f241878b.hashCode() + (this.f241877a.hashCode() * 31);
    }

    public vj60(wj60 wj60Var) {
        this(wj60Var.f251866a, wj60Var);
    }
}
