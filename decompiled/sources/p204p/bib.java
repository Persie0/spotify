package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bib {

    /* JADX INFO: renamed from: a */
    public final String f27378a;

    public bib(String str) {
        this.f27378a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bib) && wj50.m88271j(this.f27378a, ((bib) obj).f27378a);
    }

    public final int hashCode() {
        return this.f27378a.hashCode();
    }
}
