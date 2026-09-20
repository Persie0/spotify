package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b1f {

    /* JADX INFO: renamed from: a */
    public final String f22307a;

    public b1f(String str) {
        this.f22307a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1f) && wj50.m88271j(this.f22307a, ((b1f) obj).f22307a);
    }

    public final int hashCode() {
        return this.f22307a.hashCode();
    }
}
