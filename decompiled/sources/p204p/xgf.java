package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xgf {

    /* JADX INFO: renamed from: a */
    public final String f261307a;

    /* JADX INFO: renamed from: b */
    public final String f261308b;

    public xgf(String str, String str2) {
        this.f261307a = str;
        this.f261308b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgf)) {
            return false;
        }
        xgf xgfVar = (xgf) obj;
        return wj50.m88271j(this.f261307a, xgfVar.f261307a) && wj50.m88271j(this.f261308b, xgfVar.f261308b);
    }

    public final int hashCode() {
        return this.f261308b.hashCode() + (this.f261307a.hashCode() * 31);
    }
}
