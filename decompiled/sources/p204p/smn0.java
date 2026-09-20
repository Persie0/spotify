package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class smn0 {

    /* JADX INFO: renamed from: a */
    public final boolean f210689a;

    /* JADX INFO: renamed from: b */
    public final boolean f210690b;

    /* JADX INFO: renamed from: c */
    public final boolean f210691c;

    public smn0(boolean z, boolean z2, boolean z3) {
        this.f210689a = z;
        this.f210690b = z2;
        this.f210691c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smn0)) {
            return false;
        }
        smn0 smn0Var = (smn0) obj;
        return this.f210689a == smn0Var.f210689a && this.f210690b == smn0Var.f210690b && this.f210691c == smn0Var.f210691c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210691c) + s571.m77245d(Boolean.hashCode(this.f210689a) * 31, 31, this.f210690b);
    }
}
