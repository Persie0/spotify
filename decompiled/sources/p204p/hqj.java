package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hqj implements jqj {

    /* JADX INFO: renamed from: a */
    public final String f94195a;

    /* JADX INFO: renamed from: b */
    public final eyy f94196b;

    public hqj(String str, eyy eyyVar) {
        this.f94195a = str;
        this.f94196b = eyyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqj)) {
            return false;
        }
        hqj hqjVar = (hqj) obj;
        return wj50.m88271j(this.f94195a, hqjVar.f94195a) && this.f94196b == hqjVar.f94196b;
    }

    public final int hashCode() {
        return this.f94196b.hashCode() + (this.f94195a.hashCode() * 31);
    }
}
