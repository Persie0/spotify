package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lhr {

    /* JADX INFO: renamed from: a */
    public final boolean f133633a;

    /* JADX INFO: renamed from: b */
    public final boolean f133634b;

    /* JADX INFO: renamed from: c */
    public final int f133635c;

    /* JADX INFO: renamed from: d */
    public final boolean f133636d;

    /* JADX INFO: renamed from: e */
    public final boolean f133637e;

    /* JADX INFO: renamed from: f */
    public final String f133638f;

    /* JADX INFO: renamed from: g */
    public final int f133639g;

    public lhr(boolean z, boolean z2, int i, boolean z3, boolean z4, String str, int i2) {
        this.f133633a = z;
        this.f133634b = z2;
        this.f133635c = i;
        this.f133636d = z3;
        this.f133637e = z4;
        this.f133638f = str;
        this.f133639g = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m59003a() {
        return this.f133639g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhr)) {
            return false;
        }
        lhr lhrVar = (lhr) obj;
        return this.f133633a == lhrVar.f133633a && this.f133634b == lhrVar.f133634b && this.f133635c == lhrVar.f133635c && this.f133636d == lhrVar.f133636d && this.f133637e == lhrVar.f133637e && this.f133639g == lhrVar.f133639g;
    }

    public final int hashCode() {
        return (s571.m77245d(s571.m77245d(f710.m40938f(this.f133635c, s571.m77245d(Boolean.hashCode(this.f133633a) * 31, 31, this.f133634b), 31), 31, this.f133636d), 31, this.f133637e) + this.f133639g) * 31;
    }

    public /* synthetic */ lhr(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, 1, z3, z4, "", 2);
    }

    public lhr(int i, boolean z, boolean z2, boolean z3) {
        this(224, (i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, true);
    }
}
