package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ry90 implements wy90 {

    /* JADX INFO: renamed from: a */
    public final boolean f203861a;

    /* JADX INFO: renamed from: b */
    public final String f203862b;

    /* JADX INFO: renamed from: c */
    public final boolean f203863c;

    public ry90(String str, boolean z, boolean z2) {
        this.f203861a = z;
        this.f203862b = str;
        this.f203863c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry90)) {
            return false;
        }
        ry90 ry90Var = (ry90) obj;
        return this.f203861a == ry90Var.f203861a && wj50.m88271j(this.f203862b, ry90Var.f203862b) && this.f203863c == ry90Var.f203863c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203863c) + s571.m77243b(Boolean.hashCode(this.f203861a) * 31, 31, this.f203862b);
    }
}
