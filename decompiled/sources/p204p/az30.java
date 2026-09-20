package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class az30 {

    /* JADX INFO: renamed from: a */
    public final wwu f21409a;

    /* JADX INFO: renamed from: b */
    public final String f21410b;

    /* JADX INFO: renamed from: c */
    public final String f21411c;

    public az30(wwu wwuVar, String str, String str2) {
        this.f21409a = wwuVar;
        this.f21410b = str;
        this.f21411c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az30)) {
            return false;
        }
        az30 az30Var = (az30) obj;
        return wj50.m88271j(this.f21409a, az30Var.f21409a) && wj50.m88271j(this.f21410b, az30Var.f21410b) && wj50.m88271j(this.f21411c, az30Var.f21411c);
    }

    public final int hashCode() {
        return this.f21411c.hashCode() + s571.m77243b(this.f21409a.hashCode() * 31, 31, this.f21410b);
    }
}
