package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fbd extends jbd {

    /* JADX INFO: renamed from: c */
    public final String f67794c;

    public fbd(String str) {
        super(bsu.f30386c, null);
        this.f67794c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbd) && wj50.m88271j(this.f67794c, ((fbd) obj).f67794c);
    }

    public final int hashCode() {
        return this.f67794c.hashCode();
    }
}
