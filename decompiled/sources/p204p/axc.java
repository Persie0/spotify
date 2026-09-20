package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class axc {

    /* JADX INFO: renamed from: a */
    public final uyc f20836a;

    /* JADX INFO: renamed from: b */
    public final j4m0 f20837b;

    /* JADX INFO: renamed from: c */
    public final boolean f20838c;

    public axc(uyc uycVar, j4m0 j4m0Var, boolean z) {
        this.f20836a = uycVar;
        this.f20837b = j4m0Var;
        this.f20838c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axc)) {
            return false;
        }
        axc axcVar = (axc) obj;
        return wj50.m88271j(this.f20836a, axcVar.f20836a) && this.f20837b.equals(axcVar.f20837b) && this.f20838c == axcVar.f20838c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20838c) + ((this.f20837b.hashCode() + s571.m77245d(this.f20836a.hashCode() * 31, 31, true)) * 31);
    }
}
