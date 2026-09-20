package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class luf {

    /* JADX INFO: renamed from: a */
    public final String f137076a;

    public luf(String str) {
        this.f137076a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luf) && wj50.m88271j(this.f137076a, ((luf) obj).f137076a);
    }

    public final int hashCode() {
        return this.f137076a.hashCode();
    }
}
