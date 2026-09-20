package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yi71 implements cj71 {

    /* JADX INFO: renamed from: a */
    public final String f273060a;

    public yi71(String str) {
        this.f273060a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi71) && wj50.m88271j(this.f273060a, ((yi71) obj).f273060a);
    }

    public final int hashCode() {
        return this.f273060a.hashCode();
    }
}
