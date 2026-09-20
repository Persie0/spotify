package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lgw implements ngw {

    /* JADX INFO: renamed from: a */
    public final String f133304a;

    public lgw(String str) {
        this.f133304a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m58940a() {
        return this.f133304a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgw) && wj50.m88271j(this.f133304a, ((lgw) obj).f133304a);
    }

    public final int hashCode() {
        return this.f133304a.hashCode();
    }
}
