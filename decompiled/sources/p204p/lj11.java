package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lj11 extends mj11 {

    /* JADX INFO: renamed from: a */
    public final String f133936a;

    public lj11(String str) {
        this.f133936a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj11) && wj50.m88271j(this.f133936a, ((lj11) obj).f133936a);
    }

    public final int hashCode() {
        return this.f133936a.hashCode();
    }
}
