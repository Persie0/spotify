package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fye {

    /* JADX INFO: renamed from: a */
    public final String f74713a;

    /* JADX INFO: renamed from: b */
    public final String f74714b;

    /* JADX INFO: renamed from: c */
    public final int f74715c;

    public fye(String str, String str2, int i) {
        this.f74713a = str;
        this.f74714b = str2;
        this.f74715c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fye)) {
            return false;
        }
        fye fyeVar = (fye) obj;
        return wj50.m88271j(this.f74713a, fyeVar.f74713a) && wj50.m88271j(this.f74714b, fyeVar.f74714b) && this.f74715c == fyeVar.f74715c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f74715c) + s571.m77243b(this.f74713a.hashCode() * 31, 31, this.f74714b);
    }
}
