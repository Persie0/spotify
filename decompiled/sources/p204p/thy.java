package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class thy {

    /* JADX INFO: renamed from: a */
    public final String f220514a;

    /* JADX INFO: renamed from: b */
    public final String f220515b;

    /* JADX INFO: renamed from: c */
    public final xhy f220516c;

    public thy(String str, String str2, xhy xhyVar) {
        this.f220514a = str;
        this.f220515b = str2;
        this.f220516c = xhyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thy)) {
            return false;
        }
        thy thyVar = (thy) obj;
        return wj50.m88271j(this.f220514a, thyVar.f220514a) && wj50.m88271j(this.f220515b, thyVar.f220515b) && wj50.m88271j(this.f220516c, thyVar.f220516c);
    }

    public final int hashCode() {
        int iHashCode = this.f220514a.hashCode() * 31;
        String str = this.f220515b;
        return this.f220516c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
