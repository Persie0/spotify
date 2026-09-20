package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b1i implements e1i {

    /* JADX INFO: renamed from: a */
    public final String f22356a;

    public b1i(String str) {
        this.f22356a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1i) && wj50.m88271j(this.f22356a, ((b1i) obj).f22356a);
    }

    @Override // p204p.e1i
    public final String getUri() {
        return this.f22356a;
    }

    public final int hashCode() {
        return this.f22356a.hashCode();
    }
}
