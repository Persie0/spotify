package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lmc0 extends nmc0 {

    /* JADX INFO: renamed from: a */
    public final String f134857a;

    public lmc0(String str) {
        this.f134857a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmc0) && wj50.m88271j(this.f134857a, ((lmc0) obj).f134857a);
    }

    public final int hashCode() {
        return this.f134857a.hashCode();
    }
}
