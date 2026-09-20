package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vjy implements yjy {

    /* JADX INFO: renamed from: a */
    public final String f242088a;

    public vjy(String str) {
        this.f242088a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjy) && wj50.m88271j(this.f242088a, ((vjy) obj).f242088a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f242088a.hashCode() * 31);
    }
}
