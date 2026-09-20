package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class isd {

    /* JADX INFO: renamed from: a */
    public final boolean f105225a;

    /* JADX INFO: renamed from: b */
    public final boolean f105226b;

    /* JADX INFO: renamed from: c */
    public final boolean f105227c;

    public isd(boolean z, boolean z2, boolean z3) {
        this.f105225a = z;
        this.f105226b = z2;
        this.f105227c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isd)) {
            return false;
        }
        isd isdVar = (isd) obj;
        return this.f105225a == isdVar.f105225a && this.f105226b == isdVar.f105226b && this.f105227c == isdVar.f105227c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105227c) + s571.m77245d(Boolean.hashCode(this.f105225a) * 31, 31, this.f105226b);
    }
}
