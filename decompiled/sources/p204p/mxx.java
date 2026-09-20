package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mxx {

    /* JADX INFO: renamed from: a */
    public final boolean f148212a;

    /* JADX INFO: renamed from: b */
    public final String f148213b;

    public mxx(boolean z, String str) {
        this.f148212a = z;
        this.f148213b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxx)) {
            return false;
        }
        mxx mxxVar = (mxx) obj;
        return this.f148212a == mxxVar.f148212a && wj50.m88271j(this.f148213b, mxxVar.f148213b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f148212a) * 31;
        String str = this.f148213b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
