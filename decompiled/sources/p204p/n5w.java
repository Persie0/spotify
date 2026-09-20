package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n5w {

    /* JADX INFO: renamed from: a */
    public final boolean f150628a;

    /* JADX INFO: renamed from: b */
    public final boolean f150629b;

    /* JADX INFO: renamed from: c */
    public final boolean f150630c;

    /* JADX INFO: renamed from: d */
    public final boolean f150631d;

    /* JADX INFO: renamed from: e */
    public final boolean f150632e;

    public n5w(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f150628a = z;
        this.f150629b = z2;
        this.f150630c = z3;
        this.f150631d = z4;
        this.f150632e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5w)) {
            return false;
        }
        n5w n5wVar = (n5w) obj;
        return this.f150628a == n5wVar.f150628a && this.f150629b == n5wVar.f150629b && this.f150630c == n5wVar.f150630c && this.f150631d == n5wVar.f150631d && this.f150632e == n5wVar.f150632e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150632e) + s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f150628a) * 31, 31, this.f150629b), 31, this.f150630c), 31, this.f150631d);
    }
}
