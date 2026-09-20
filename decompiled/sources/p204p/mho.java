package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mho {

    /* JADX INFO: renamed from: a */
    public final long f143842a;

    /* JADX INFO: renamed from: b */
    public final gva f143843b;

    /* JADX INFO: renamed from: c */
    public final Long f143844c;

    /* JADX INFO: renamed from: d */
    public final boolean f143845d;

    /* JADX INFO: renamed from: e */
    public final int f143846e;

    /* JADX INFO: renamed from: f */
    public final long f143847f;

    /* JADX INFO: renamed from: g */
    public final boolean f143848g;

    public mho(long j, gva gvaVar, Long l, boolean z, int i, long j2, boolean z2) {
        this.f143842a = j;
        this.f143843b = gvaVar;
        this.f143844c = l;
        this.f143845d = z;
        this.f143846e = i;
        this.f143847f = j2;
        this.f143848g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mho)) {
            return false;
        }
        mho mhoVar = (mho) obj;
        return this.f143842a == mhoVar.f143842a && wj50.m88271j(this.f143843b, mhoVar.f143843b) && wj50.m88271j(this.f143844c, mhoVar.f143844c) && this.f143845d == mhoVar.f143845d && this.f143846e == mhoVar.f143846e && this.f143847f == mhoVar.f143847f && this.f143848g == mhoVar.f143848g;
    }

    public final int hashCode() {
        int iHashCode = (this.f143843b.hashCode() + (Long.hashCode(this.f143842a) * 31)) * 31;
        Long l = this.f143844c;
        return Boolean.hashCode(this.f143848g) + dq60.m36605e(f710.m40938f(this.f143846e, s571.m77245d((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.f143845d), 31), this.f143847f, 31);
    }
}
