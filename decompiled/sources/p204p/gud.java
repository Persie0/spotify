package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gud {

    /* JADX INFO: renamed from: a */
    public final String f84450a;

    /* JADX INFO: renamed from: b */
    public final long f84451b;

    public gud(String str, long j) {
        this.f84450a = str;
        this.f84451b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gud)) {
            return false;
        }
        gud gudVar = (gud) obj;
        return wj50.m88271j(this.f84450a, gudVar.f84450a) && this.f84451b == gudVar.f84451b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f84451b) + (this.f84450a.hashCode() * 31);
    }
}
