package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ekv {

    /* JADX INFO: renamed from: a */
    public final String f60539a;

    /* JADX INFO: renamed from: b */
    public final String f60540b;

    /* JADX INFO: renamed from: c */
    public final int f60541c;

    public /* synthetic */ ekv(String str) {
        this(str, null, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekv)) {
            return false;
        }
        ekv ekvVar = (ekv) obj;
        return wj50.m88271j(this.f60539a, ekvVar.f60539a) && wj50.m88271j(this.f60540b, ekvVar.f60540b) && this.f60541c == ekvVar.f60541c;
    }

    public final int hashCode() {
        int iHashCode = this.f60539a.hashCode() * 31;
        String str = this.f60540b;
        return edb.m38547C(this.f60541c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public ekv(String str, String str2, int i) {
        this.f60539a = str;
        this.f60540b = str2;
        this.f60541c = i;
    }
}
