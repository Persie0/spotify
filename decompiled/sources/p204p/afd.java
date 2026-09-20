package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class afd extends efd {

    /* JADX INFO: renamed from: c */
    public final String f15117c;

    /* JADX INFO: renamed from: d */
    public final long f15118d;

    /* JADX INFO: renamed from: e */
    public final long f15119e;

    /* JADX INFO: renamed from: f */
    public final String f15120f;

    public afd(String str, long j, long j2, String str2) {
        this.f15117c = str;
        this.f15118d = j;
        this.f15119e = j2;
        this.f15120f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afd)) {
            return false;
        }
        afd afdVar = (afd) obj;
        return wj50.m88271j(this.f15117c, afdVar.f15117c) && this.f15118d == afdVar.f15118d && this.f15119e == afdVar.f15119e && wj50.m88271j(this.f15120f, afdVar.f15120f);
    }

    public final int hashCode() {
        return this.f15120f.hashCode() + dq60.m36605e(dq60.m36605e(this.f15117c.hashCode() * 31, this.f15118d, 31), this.f15119e, 31);
    }

    @Override // p204p.efd
    /* JADX INFO: renamed from: o */
    public final String mo25808o() {
        return this.f15120f;
    }
}
