package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k2s {

    /* JADX INFO: renamed from: a */
    public final String f118685a;

    /* JADX INFO: renamed from: b */
    public final String f118686b;

    public k2s(String str, String str2) {
        this.f118685a = str;
        this.f118686b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2s)) {
            return false;
        }
        k2s k2sVar = (k2s) obj;
        return wj50.m88271j(this.f118685a, k2sVar.f118685a) && wj50.m88271j(this.f118686b, k2sVar.f118686b);
    }

    public final int hashCode() {
        return this.f118686b.hashCode() + (this.f118685a.hashCode() * 31);
    }
}
