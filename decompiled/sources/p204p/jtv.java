package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jtv extends ktv {

    /* JADX INFO: renamed from: a */
    public final String f115974a;

    /* JADX INFO: renamed from: b */
    public final String f115975b;

    public jtv(String str, String str2) {
        this.f115974a = str;
        this.f115975b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtv)) {
            return false;
        }
        jtv jtvVar = (jtv) obj;
        return wj50.m88271j(this.f115974a, jtvVar.f115974a) && wj50.m88271j(this.f115975b, jtvVar.f115975b);
    }

    public final int hashCode() {
        int iHashCode = this.f115974a.hashCode() * 31;
        String str = this.f115975b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
