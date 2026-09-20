package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e1a implements g1a {

    /* JADX INFO: renamed from: a */
    public final String f55153a;

    public e1a(String str) {
        this.f55153a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1a) && wj50.m88271j(this.f55153a, ((e1a) obj).f55153a);
    }

    public final int hashCode() {
        return this.f55153a.hashCode();
    }
}
