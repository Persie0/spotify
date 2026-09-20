package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kc51 extends mc51 {

    /* JADX INFO: renamed from: a */
    public final Exception f121375a;

    public kc51(Exception exc) {
        this.f121375a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc51) && wj50.m88271j(this.f121375a, ((kc51) obj).f121375a);
    }

    public final int hashCode() {
        Exception exc = this.f121375a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }
}
