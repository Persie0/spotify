package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h0k {

    /* JADX INFO: renamed from: a */
    public final int f86307a;

    /* JADX INFO: renamed from: b */
    public final String f86308b;

    public h0k(int i, String str) {
        this.f86307a = i;
        this.f86308b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0k)) {
            return false;
        }
        h0k h0kVar = (h0k) obj;
        return this.f86307a == h0kVar.f86307a && wj50.m88271j(this.f86308b, h0kVar.f86308b);
    }

    public final int hashCode() {
        int i = this.f86307a;
        return s571.m77245d(s571.m77243b((i == 0 ? 0 : edb.m38547C(i)) * 31, 31, this.f86308b), 31, true);
    }
}
