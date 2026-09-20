package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ulk {

    /* JADX INFO: renamed from: a */
    public final String f231578a;

    /* JADX INFO: renamed from: b */
    public final long f231579b;

    public ulk(String str, long j) {
        this.f231578a = str;
        this.f231579b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulk)) {
            return false;
        }
        ulk ulkVar = (ulk) obj;
        if (!wj50.m88271j(this.f231578a, ulkVar.f231578a)) {
            return false;
        }
        long j = ulkVar.f231579b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f231579b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f231578a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f231579b) + iHashCode;
    }
}
