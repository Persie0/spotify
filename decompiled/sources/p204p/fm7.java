package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fm7 {

    /* JADX INFO: renamed from: a */
    public final String f70970a;

    /* JADX INFO: renamed from: b */
    public final boolean f70971b;

    /* JADX INFO: renamed from: c */
    public final rk7 f70972c;

    public fm7(String str, boolean z, rk7 rk7Var) {
        this.f70970a = str;
        this.f70971b = z;
        this.f70972c = rk7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm7)) {
            return false;
        }
        fm7 fm7Var = (fm7) obj;
        return wj50.m88271j(this.f70970a, fm7Var.f70970a) && this.f70971b == fm7Var.f70971b && this.f70972c == fm7Var.f70972c;
    }

    public final int hashCode() {
        return this.f70972c.hashCode() + s571.m77245d(this.f70970a.hashCode() * 31, 31, this.f70971b);
    }
}
