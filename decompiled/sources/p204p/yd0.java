package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yd0 {

    /* JADX INFO: renamed from: a */
    public final String f271601a;

    /* JADX INFO: renamed from: b */
    public final String f271602b;

    /* JADX INFO: renamed from: c */
    public final tfu f271603c;

    /* JADX INFO: renamed from: d */
    public final boolean f271604d;

    public yd0(String str, String str2, tfu tfuVar, boolean z) {
        this.f271601a = str;
        this.f271602b = str2;
        this.f271603c = tfuVar;
        this.f271604d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd0)) {
            return false;
        }
        yd0 yd0Var = (yd0) obj;
        return wj50.m88271j(this.f271601a, yd0Var.f271601a) && wj50.m88271j(this.f271602b, yd0Var.f271602b) && this.f271603c == yd0Var.f271603c && this.f271604d == yd0Var.f271604d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271604d) + ((this.f271603c.hashCode() + s571.m77243b(this.f271601a.hashCode() * 31, 31, this.f271602b)) * 31);
    }
}
