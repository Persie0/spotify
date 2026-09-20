package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l7m implements m7m {

    /* JADX INFO: renamed from: a */
    public final Integer f130699a;

    /* JADX INFO: renamed from: b */
    public final int f130700b;

    /* JADX INFO: renamed from: c */
    public final String f130701c;

    public l7m(int i, Integer num, String str) {
        this.f130699a = num;
        this.f130700b = i;
        this.f130701c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7m)) {
            return false;
        }
        l7m l7mVar = (l7m) obj;
        return this.f130699a.equals(l7mVar.f130699a) && this.f130700b == l7mVar.f130700b && wj50.m88271j(this.f130701c, l7mVar.f130701c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(0, mt60.m62800g(this.f130700b, this.f130699a.hashCode() * 31, 31), 31);
        String str = this.f130701c;
        return iM62800g + (str != null ? str.hashCode() : 0);
    }
}
