package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g2l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f75970a;

    public g2l(String str) {
        this.f75970a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2l) && wj50.m88271j(this.f75970a, ((g2l) obj).f75970a);
    }

    public final int hashCode() {
        return this.f75970a.hashCode();
    }
}
