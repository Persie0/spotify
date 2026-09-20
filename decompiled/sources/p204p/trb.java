package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class trb {

    /* JADX INFO: renamed from: a */
    public final String f223029a;

    /* JADX INFO: renamed from: b */
    public final int f223030b;

    /* JADX INFO: renamed from: c */
    public final int f223031c;

    /* JADX INFO: renamed from: d */
    public final String f223032d;

    public trb(int i, String str, int i2, String str2) {
        this.f223029a = str;
        this.f223030b = i;
        this.f223031c = i2;
        this.f223032d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trb)) {
            return false;
        }
        trb trbVar = (trb) obj;
        return wj50.m88271j(this.f223029a, trbVar.f223029a) && this.f223030b == trbVar.f223030b && this.f223031c == trbVar.f223031c && wj50.m88271j(this.f223032d, trbVar.f223032d);
    }

    public final int hashCode() {
        return this.f223032d.hashCode() + mt60.m62800g(this.f223031c, mt60.m62800g(this.f223030b, this.f223029a.hashCode() * 31, 31), 31);
    }
}
