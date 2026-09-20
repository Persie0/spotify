package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dyz0 {

    /* JADX INFO: renamed from: a */
    public final String f54463a;

    /* JADX INFO: renamed from: b */
    public final String f54464b;

    /* JADX INFO: renamed from: c */
    public final boolean f54465c;

    public dyz0(String str, String str2, boolean z) {
        this.f54463a = str;
        this.f54464b = str2;
        this.f54465c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyz0)) {
            return false;
        }
        dyz0 dyz0Var = (dyz0) obj;
        return wj50.m88271j(this.f54463a, dyz0Var.f54463a) && wj50.m88271j(this.f54464b, dyz0Var.f54464b) && this.f54465c == dyz0Var.f54465c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54465c) + s571.m77243b(this.f54463a.hashCode() * 31, 31, this.f54464b);
    }
}
