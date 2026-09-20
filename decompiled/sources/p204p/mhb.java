package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mhb implements phb {

    /* JADX INFO: renamed from: a */
    public final boolean f143764a;

    /* JADX INFO: renamed from: b */
    public final String f143765b;

    public mhb(boolean z, String str) {
        this.f143764a = z;
        this.f143765b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhb)) {
            return false;
        }
        mhb mhbVar = (mhb) obj;
        return this.f143764a == mhbVar.f143764a && wj50.m88271j(this.f143765b, mhbVar.f143765b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f143764a) * 31;
        String str = this.f143765b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
