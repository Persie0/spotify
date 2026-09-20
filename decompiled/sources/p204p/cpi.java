package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cpi extends epi {

    /* JADX INFO: renamed from: a */
    public final cwi f40561a;

    public cpi(cwi cwiVar) {
        this.f40561a = cwiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpi) && wj50.m88271j(this.f40561a, ((cpi) obj).f40561a);
    }

    public final int hashCode() {
        return this.f40561a.hashCode();
    }
}
