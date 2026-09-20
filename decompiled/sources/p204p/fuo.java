package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fuo {

    /* JADX INFO: renamed from: a */
    public final String f73533a;

    /* JADX INFO: renamed from: b */
    public final String f73534b;

    public fuo(String str, String str2) {
        this.f73533a = str;
        this.f73534b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m42742a() {
        return this.f73533a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuo)) {
            return false;
        }
        fuo fuoVar = (fuo) obj;
        return wj50.m88271j(this.f73533a, fuoVar.f73533a) && wj50.m88271j(this.f73534b, fuoVar.f73534b);
    }

    public final int hashCode() {
        String str = this.f73533a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73534b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
