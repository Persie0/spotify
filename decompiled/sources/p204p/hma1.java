package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hma1 implements nma1 {

    /* JADX INFO: renamed from: a */
    public final String f92877a;

    public hma1(String str) {
        this.f92877a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hma1) && wj50.m88271j(this.f92877a, ((hma1) obj).f92877a);
    }

    @Override // p204p.nma1
    public final String getUri() {
        return this.f92877a;
    }

    public final int hashCode() {
        return this.f92877a.hashCode();
    }
}
