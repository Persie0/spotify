package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k9v implements m9v {

    /* JADX INFO: renamed from: a */
    public final String f120694a;

    /* JADX INFO: renamed from: b */
    public final int f120695b;

    public k9v(String str, int i) {
        this.f120694a = str;
        this.f120695b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9v)) {
            return false;
        }
        k9v k9vVar = (k9v) obj;
        return wj50.m88271j(this.f120694a, k9vVar.f120694a) && this.f120695b == k9vVar.f120695b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120695b) + (this.f120694a.hashCode() * 31);
    }
}
