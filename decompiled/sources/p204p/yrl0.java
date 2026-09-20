package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yrl0 {

    /* JADX INFO: renamed from: a */
    public final lmc f275502a;

    /* JADX INFO: renamed from: b */
    public final srl0 f275503b;

    /* JADX INFO: renamed from: c */
    public final boolean f275504c;

    public yrl0(lmc lmcVar, srl0 srl0Var, boolean z) {
        this.f275502a = lmcVar;
        this.f275503b = srl0Var;
        this.f275504c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrl0)) {
            return false;
        }
        yrl0 yrl0Var = (yrl0) obj;
        return this.f275502a == yrl0Var.f275502a && this.f275503b == yrl0Var.f275503b && this.f275504c == yrl0Var.f275504c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275504c) + ((this.f275503b.hashCode() + (this.f275502a.hashCode() * 31)) * 31);
    }
}
