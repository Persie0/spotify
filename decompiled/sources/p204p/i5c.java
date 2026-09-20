package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i5c implements l5c {

    /* JADX INFO: renamed from: a */
    public final String f98883a;

    /* JADX INFO: renamed from: b */
    public final int f98884b;

    public i5c(String str, int i) {
        this.f98883a = str;
        this.f98884b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5c)) {
            return false;
        }
        i5c i5cVar = (i5c) obj;
        return wj50.m88271j(this.f98883a, i5cVar.f98883a) && this.f98884b == i5cVar.f98884b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98884b) + (this.f98883a.hashCode() * 31);
    }
}
