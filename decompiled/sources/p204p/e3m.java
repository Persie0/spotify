package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e3m implements g3m {

    /* JADX INFO: renamed from: a */
    public final String f55824a;

    public e3m(String str) {
        this.f55824a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3m) && wj50.m88271j(this.f55824a, ((e3m) obj).f55824a);
    }

    public final int hashCode() {
        return this.f55824a.hashCode();
    }
}
