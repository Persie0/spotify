package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zji {

    /* JADX INFO: renamed from: a */
    public final String f283446a;

    /* JADX INFO: renamed from: b */
    public final String f283447b;

    public zji(String str, String str2) {
        this.f283446a = str;
        this.f283447b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zji)) {
            return false;
        }
        zji zjiVar = (zji) obj;
        return wj50.m88271j(this.f283446a, zjiVar.f283446a) && wj50.m88271j(this.f283447b, zjiVar.f283447b);
    }

    public final int hashCode() {
        String str = this.f283446a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f283447b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
