package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mb0 {

    /* JADX INFO: renamed from: a */
    public final String f141756a;

    /* JADX INFO: renamed from: b */
    public final boolean f141757b;

    public mb0(String str, boolean z) {
        this.f141756a = str;
        this.f141757b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0Var = (mb0) obj;
        return wj50.m88271j(this.f141756a, mb0Var.f141756a) && this.f141757b == mb0Var.f141757b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141757b) + (this.f141756a.hashCode() * 31);
    }
}
