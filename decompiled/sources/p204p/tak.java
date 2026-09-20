package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tak {

    /* JADX INFO: renamed from: a */
    public final String f218622a;

    /* JADX INFO: renamed from: b */
    public final String f218623b;

    public tak(String str, String str2) {
        this.f218622a = str;
        this.f218623b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tak)) {
            return false;
        }
        tak takVar = (tak) obj;
        return wj50.m88271j(this.f218622a, takVar.f218622a) && wj50.m88271j(this.f218623b, takVar.f218623b);
    }

    public final int hashCode() {
        String str = this.f218622a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f218623b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
