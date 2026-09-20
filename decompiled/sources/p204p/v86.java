package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v86 {

    /* JADX INFO: renamed from: a */
    public final String f238410a;

    /* JADX INFO: renamed from: b */
    public final String f238411b;

    public v86(String str, String str2) {
        this.f238410a = str;
        this.f238411b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v86)) {
            return false;
        }
        v86 v86Var = (v86) obj;
        return wj50.m88271j(this.f238410a, v86Var.f238410a) && wj50.m88271j(this.f238411b, v86Var.f238411b);
    }

    public final int hashCode() {
        return this.f238411b.hashCode() + (this.f238410a.hashCode() * 31);
    }
}
