package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vhx0 implements aix0 {

    /* JADX INFO: renamed from: a */
    public final String f241565a;

    /* JADX INFO: renamed from: b */
    public final String f241566b;

    public vhx0(String str, String str2) {
        this.f241565a = str;
        this.f241566b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhx0)) {
            return false;
        }
        vhx0 vhx0Var = (vhx0) obj;
        return wj50.m88271j(this.f241565a, vhx0Var.f241565a) && wj50.m88271j(this.f241566b, vhx0Var.f241566b);
    }

    public final int hashCode() {
        return this.f241566b.hashCode() + (this.f241565a.hashCode() * 31);
    }
}
