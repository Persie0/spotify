package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s69 {

    /* JADX INFO: renamed from: a */
    public final String f206032a;

    public s69(String str) {
        this.f206032a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s69) && wj50.m88271j(this.f206032a, ((s69) obj).f206032a);
    }

    public final int hashCode() {
        int iHashCode = t69.f217488a.hashCode() * 31;
        String str = this.f206032a;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
