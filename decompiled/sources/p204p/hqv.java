package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hqv {

    /* JADX INFO: renamed from: a */
    public final String f94254a;

    /* JADX INFO: renamed from: b */
    public final String f94255b;

    public hqv(String str, String str2) {
        this.f94254a = str;
        this.f94255b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqv)) {
            return false;
        }
        hqv hqvVar = (hqv) obj;
        return wj50.m88271j(this.f94254a, hqvVar.f94254a) && wj50.m88271j(this.f94255b, hqvVar.f94255b);
    }

    public final int hashCode() {
        return this.f94255b.hashCode() + (this.f94254a.hashCode() * 31);
    }
}
