package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class luw0 implements puw0 {

    /* JADX INFO: renamed from: a */
    public final String f137164a;

    public luw0(String str) {
        this.f137164a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luw0) && wj50.m88271j(this.f137164a, ((luw0) obj).f137164a);
    }

    public final int hashCode() {
        return this.f137164a.hashCode();
    }
}
