package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ty90 implements wy90 {

    /* JADX INFO: renamed from: a */
    public final boolean f224884a;

    /* JADX INFO: renamed from: b */
    public final String f224885b;

    public ty90(boolean z, String str) {
        this.f224884a = z;
        this.f224885b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty90)) {
            return false;
        }
        ty90 ty90Var = (ty90) obj;
        return this.f224884a == ty90Var.f224884a && wj50.m88271j(this.f224885b, ty90Var.f224885b);
    }

    public final int hashCode() {
        return this.f224885b.hashCode() + (Boolean.hashCode(this.f224884a) * 31);
    }
}
