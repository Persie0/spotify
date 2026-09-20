package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dan0 implements fan0 {

    /* JADX INFO: renamed from: a */
    public final String f47084a;

    public dan0(String str) {
        this.f47084a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dan0) && wj50.m88271j(this.f47084a, ((dan0) obj).f47084a);
    }

    @Override // p204p.fan0
    public final String getUri() {
        return this.f47084a;
    }

    public final int hashCode() {
        return this.f47084a.hashCode();
    }
}
