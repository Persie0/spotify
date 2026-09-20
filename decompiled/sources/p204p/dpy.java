package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dpy implements epy {

    /* JADX INFO: renamed from: a */
    public final String f51762a;

    /* JADX INFO: renamed from: b */
    public final String f51763b;

    /* JADX INFO: renamed from: c */
    public final long f51764c;

    /* JADX INFO: renamed from: d */
    public final boolean f51765d;

    public dpy(String str, String str2, long j, boolean z) {
        this.f51762a = str;
        this.f51763b = str2;
        this.f51764c = j;
        this.f51765d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpy)) {
            return false;
        }
        dpy dpyVar = (dpy) obj;
        return wj50.m88271j(this.f51762a, dpyVar.f51762a) && wj50.m88271j(this.f51763b, dpyVar.f51763b) && this.f51764c == dpyVar.f51764c && this.f51765d == dpyVar.f51765d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51765d) + dq60.m36605e(s571.m77243b(this.f51762a.hashCode() * 31, 31, this.f51763b), this.f51764c, 31);
    }
}
