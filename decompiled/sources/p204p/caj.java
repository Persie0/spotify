package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class caj {

    /* JADX INFO: renamed from: a */
    public final String f35823a;

    /* JADX INFO: renamed from: b */
    public final String f35824b;

    public caj(String str, String str2) {
        this.f35823a = str;
        this.f35824b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof caj)) {
            return false;
        }
        caj cajVar = (caj) obj;
        return wj50.m88271j(this.f35823a, cajVar.f35823a) && wj50.m88271j(this.f35824b, cajVar.f35824b);
    }

    public final int hashCode() {
        int iHashCode = this.f35823a.hashCode() * 31;
        String str = this.f35824b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
