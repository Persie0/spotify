package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i6c0 extends fpg1 {

    /* JADX INFO: renamed from: c */
    public final String f99207c;

    /* JADX INFO: renamed from: d */
    public final z5c0 f99208d;

    /* JADX INFO: renamed from: e */
    public final boolean f99209e;

    public i6c0(String str, z5c0 z5c0Var, boolean z) {
        this.f99207c = str;
        this.f99208d = z5c0Var;
        this.f99209e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6c0)) {
            return false;
        }
        i6c0 i6c0Var = (i6c0) obj;
        return wj50.m88271j(this.f99207c, i6c0Var.f99207c) && this.f99208d == i6c0Var.f99208d && this.f99209e == i6c0Var.f99209e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99209e) + ((this.f99208d.hashCode() + (this.f99207c.hashCode() * 31)) * 31);
    }
}
