package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class et20 implements gt20 {

    /* JADX INFO: renamed from: a */
    public final String f62596a;

    public et20(String str) {
        this.f62596a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et20) && wj50.m88271j(this.f62596a, ((et20) obj).f62596a);
    }

    public final int hashCode() {
        return this.f62596a.hashCode();
    }
}
