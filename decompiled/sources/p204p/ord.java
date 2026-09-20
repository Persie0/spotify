package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ord {

    /* JADX INFO: renamed from: a */
    public final String f168536a;

    /* JADX INFO: renamed from: b */
    public final String f168537b;

    public ord(String str, String str2) {
        this.f168536a = str;
        this.f168537b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ord)) {
            return false;
        }
        ord ordVar = (ord) obj;
        return wj50.m88271j(this.f168536a, ordVar.f168536a) && wj50.m88271j(this.f168537b, ordVar.f168537b);
    }

    public final int hashCode() {
        String str = this.f168536a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f168537b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
