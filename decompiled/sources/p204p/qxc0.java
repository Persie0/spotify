package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f193615a;

    /* JADX INFO: renamed from: b */
    public final boolean f193616b;

    /* JADX INFO: renamed from: c */
    public final boolean f193617c;

    public qxc0(String str, boolean z, boolean z2) {
        this.f193615a = str;
        this.f193616b = z;
        this.f193617c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxc0)) {
            return false;
        }
        qxc0 qxc0Var = (qxc0) obj;
        return wj50.m88271j(this.f193615a, qxc0Var.f193615a) && this.f193616b == qxc0Var.f193616b && this.f193617c == qxc0Var.f193617c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193617c) + s571.m77245d(this.f193615a.hashCode() * 31, 31, this.f193616b);
    }
}
