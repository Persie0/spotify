package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tbp0 {

    /* JADX INFO: renamed from: a */
    public final String f218925a;

    /* JADX INFO: renamed from: b */
    public final boolean f218926b;

    /* JADX INFO: renamed from: c */
    public final boolean f218927c;

    public tbp0(String str, boolean z, boolean z2) {
        this.f218925a = str;
        this.f218926b = z;
        this.f218927c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbp0)) {
            return false;
        }
        tbp0 tbp0Var = (tbp0) obj;
        return wj50.m88271j(this.f218925a, tbp0Var.f218925a) && this.f218926b == tbp0Var.f218926b && this.f218927c == tbp0Var.f218927c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218927c) + s571.m77245d(this.f218925a.hashCode() * 31, 31, this.f218926b);
    }
}
