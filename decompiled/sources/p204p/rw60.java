package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final String f203278a;

    /* JADX INFO: renamed from: b */
    public final boolean f203279b;

    /* JADX INFO: renamed from: c */
    public final boolean f203280c;

    public rw60(String str, boolean z, boolean z2) {
        this.f203278a = str;
        this.f203279b = z;
        this.f203280c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw60)) {
            return false;
        }
        rw60 rw60Var = (rw60) obj;
        return wj50.m88271j(this.f203278a, rw60Var.f203278a) && this.f203279b == rw60Var.f203279b && this.f203280c == rw60Var.f203280c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203280c) + s571.m77245d(this.f203278a.hashCode() * 31, 31, this.f203279b);
    }
}
