package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k7b {

    /* JADX INFO: renamed from: a */
    public final String f120031a;

    /* JADX INFO: renamed from: b */
    public final boolean f120032b;

    public k7b(String str, boolean z) {
        this.f120031a = str;
        this.f120032b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7b)) {
            return false;
        }
        k7b k7bVar = (k7b) obj;
        return wj50.m88271j(this.f120031a, k7bVar.f120031a) && this.f120032b == k7bVar.f120032b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120032b) + (this.f120031a.hashCode() * 31);
    }
}
