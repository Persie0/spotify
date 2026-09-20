package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class n7m {

    /* JADX INFO: renamed from: a */
    public final String f151186a;

    public n7m(String str) {
        this.f151186a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7m) && wj50.m88271j(this.f151186a, ((n7m) obj).f151186a);
    }

    public final int hashCode() {
        return this.f151186a.hashCode();
    }
}
