package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class avk {

    /* JADX INFO: renamed from: a */
    public final Object f20204a;

    /* JADX INFO: renamed from: b */
    public final long f20205b;

    public avk(long j, Object obj) {
        this.f20204a = obj;
        this.f20205b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avk)) {
            return false;
        }
        avk avkVar = (avk) obj;
        return wj50.m88271j(this.f20204a, avkVar.f20204a) && this.f20205b == avkVar.f20205b;
    }

    public final int hashCode() {
        Object obj = this.f20204a;
        return Long.hashCode(this.f20205b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
