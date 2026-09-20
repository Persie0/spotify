package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n8a0 implements o5a0 {

    /* JADX INFO: renamed from: a */
    public final String f151485a;

    public n8a0(String str) {
        this.f151485a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8a0) && wj50.m88271j(this.f151485a, ((n8a0) obj).f151485a);
    }

    @Override // p204p.o5a0
    public final String getUri() {
        return this.f151485a;
    }

    public final int hashCode() {
        return this.f151485a.hashCode();
    }
}
