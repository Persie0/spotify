package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tc71 implements xc71 {

    /* JADX INFO: renamed from: a */
    public final Exception f219038a;

    public tc71(Exception exc) {
        this.f219038a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc71) && wj50.m88271j(this.f219038a, ((tc71) obj).f219038a);
    }

    public final int hashCode() {
        return this.f219038a.hashCode();
    }
}
