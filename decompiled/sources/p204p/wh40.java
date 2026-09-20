package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wh40 implements ci40 {

    /* JADX INFO: renamed from: a */
    public final String f251251a;

    public wh40(String str) {
        this.f251251a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh40) && wj50.m88271j(this.f251251a, ((wh40) obj).f251251a);
    }

    public final int hashCode() {
        return this.f251251a.hashCode();
    }
}
