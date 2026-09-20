package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xh40 implements ci40 {

    /* JADX INFO: renamed from: a */
    public final String f261437a;

    public xh40(String str) {
        this.f261437a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh40) && wj50.m88271j(this.f261437a, ((xh40) obj).f261437a);
    }

    public final int hashCode() {
        return this.f261437a.hashCode();
    }
}
