package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uf31 extends ag31 {

    /* JADX INFO: renamed from: a */
    public final String f229670a;

    public uf31(String str) {
        this.f229670a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf31) && wj50.m88271j(this.f229670a, ((uf31) obj).f229670a);
    }

    public final int hashCode() {
        return this.f229670a.hashCode();
    }
}
