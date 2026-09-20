package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vz6 {

    /* JADX INFO: renamed from: d */
    public static final vz6 f246399d = new uz6().m84282a();

    /* JADX INFO: renamed from: a */
    public final boolean f246400a;

    /* JADX INFO: renamed from: b */
    public final boolean f246401b;

    /* JADX INFO: renamed from: c */
    public final boolean f246402c;

    public vz6(uz6 uz6Var) {
        this.f246400a = uz6Var.f235431a;
        this.f246401b = uz6Var.f235432b;
        this.f246402c = uz6Var.f235433c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vz6.class != obj.getClass()) {
            return false;
        }
        vz6 vz6Var = (vz6) obj;
        return this.f246400a == vz6Var.f246400a && this.f246401b == vz6Var.f246401b && this.f246402c == vz6Var.f246402c;
    }

    public final int hashCode() {
        return ((this.f246400a ? 1 : 0) << 2) + ((this.f246401b ? 1 : 0) << 1) + (this.f246402c ? 1 : 0);
    }
}
