package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y091 {

    /* JADX INFO: renamed from: a */
    public final String f267936a;

    /* JADX INFO: renamed from: b */
    public final boolean f267937b;

    /* JADX INFO: renamed from: c */
    public final boolean f267938c;

    public y091(String str, boolean z, boolean z2) {
        this.f267936a = str;
        this.f267937b = z;
        this.f267938c = z2;
    }

    /* JADX INFO: renamed from: a */
    public final String m92554a() {
        return this.f267936a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y091)) {
            return false;
        }
        y091 y091Var = (y091) obj;
        return wj50.m88271j(this.f267936a, y091Var.f267936a) && this.f267937b == y091Var.f267937b && this.f267938c == y091Var.f267938c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267938c) + s571.m77245d(this.f267936a.hashCode() * 31, 31, this.f267937b);
    }
}
