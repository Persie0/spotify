package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lu50 {

    /* JADX INFO: renamed from: a */
    public final String f137003a;

    public lu50(String str) {
        this.f137003a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu50) && wj50.m88271j(this.f137003a, ((lu50) obj).f137003a);
    }

    public final int hashCode() {
        return this.f137003a.hashCode();
    }
}
