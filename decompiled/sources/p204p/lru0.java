package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lru0 implements mru0 {

    /* JADX INFO: renamed from: a */
    public final String f136362a;

    public lru0(String str) {
        this.f136362a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lru0) && wj50.m88271j(this.f136362a, ((lru0) obj).f136362a);
    }

    public final int hashCode() {
        return this.f136362a.hashCode();
    }
}
