package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ohz0 {

    /* JADX INFO: renamed from: a */
    public final String f165594a;

    /* JADX INFO: renamed from: b */
    public final long f165595b;

    public ohz0(String str, long j) {
        this.f165594a = str;
        this.f165595b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohz0)) {
            return false;
        }
        ohz0 ohz0Var = (ohz0) obj;
        return wj50.m88271j(this.f165594a, ohz0Var.f165594a) && this.f165595b == ohz0Var.f165595b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f165595b) + (this.f165594a.hashCode() * 31);
    }
}
