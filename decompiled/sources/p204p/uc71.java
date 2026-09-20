package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uc71 implements xc71 {

    /* JADX INFO: renamed from: a */
    public final Exception f228964a;

    public uc71(Exception exc) {
        this.f228964a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc71) && wj50.m88271j(this.f228964a, ((uc71) obj).f228964a);
    }

    public final int hashCode() {
        return this.f228964a.hashCode();
    }
}
