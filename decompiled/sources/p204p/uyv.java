package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uyv {

    /* JADX INFO: renamed from: a */
    public final String f235367a;

    /* JADX INFO: renamed from: b */
    public final int f235368b;

    /* JADX INFO: renamed from: c */
    public final String f235369c;

    public uyv(String str, int i, String str2) {
        this.f235367a = str;
        this.f235368b = i;
        this.f235369c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyv)) {
            return false;
        }
        uyv uyvVar = (uyv) obj;
        return wj50.m88271j(this.f235367a, uyvVar.f235367a) && this.f235368b == uyvVar.f235368b && wj50.m88271j(this.f235369c, uyvVar.f235369c);
    }

    public final int hashCode() {
        return this.f235369c.hashCode() + mt60.m62800g(this.f235368b, this.f235367a.hashCode() * 31, 31);
    }
}
