package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lw90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final String f137490a;

    public lw90(String str) {
        this.f137490a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lw90) && wj50.m88271j(this.f137490a, ((lw90) obj).f137490a);
    }

    public final int hashCode() {
        return this.f137490a.hashCode();
    }
}
