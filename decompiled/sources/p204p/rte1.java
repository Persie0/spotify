package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rte1 implements vte1 {

    /* JADX INFO: renamed from: a */
    public final String f202573a;

    public rte1(String str) {
        this.f202573a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rte1) && wj50.m88271j(this.f202573a, ((rte1) obj).f202573a);
    }

    public final int hashCode() {
        return this.f202573a.hashCode();
    }
}
