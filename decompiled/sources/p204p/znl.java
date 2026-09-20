package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class znl {

    /* JADX INFO: renamed from: a */
    public final String f284519a;

    /* JADX INFO: renamed from: b */
    public final long f284520b;

    /* JADX INFO: renamed from: c */
    public final boolean f284521c;

    public znl(long j, String str, boolean z) {
        this.f284519a = str;
        this.f284520b = j;
        this.f284521c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znl)) {
            return false;
        }
        znl znlVar = (znl) obj;
        return wj50.m88271j(this.f284519a, znlVar.f284519a) && mu71.m62836c(this.f284520b, znlVar.f284520b) && this.f284521c == znlVar.f284521c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284521c) + dq60.m36605e(this.f284519a.hashCode() * 31, this.f284520b, 31);
    }
}
