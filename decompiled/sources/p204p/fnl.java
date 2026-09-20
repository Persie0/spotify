package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fnl implements knl {

    /* JADX INFO: renamed from: a */
    public final long f71318a;

    /* JADX INFO: renamed from: b */
    public final String f71319b;

    public fnl(long j, String str) {
        this.f71318a = j;
        this.f71319b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnl)) {
            return false;
        }
        fnl fnlVar = (fnl) obj;
        return this.f71318a == fnlVar.f71318a && wj50.m88271j(this.f71319b, fnlVar.f71319b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f71318a) * 31;
        String str = this.f71319b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
