package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fdm extends hdm {

    /* JADX INFO: renamed from: b */
    public static final fdm f68520b = new fdm("");

    private Object readResolve() {
        return f68520b;
    }

    @Override // p204p.hdm
    /* JADX INFO: renamed from: a */
    public final int compareTo(hdm hdmVar) {
        return hdmVar == this ? 0 : -1;
    }

    @Override // p204p.hdm
    /* JADX INFO: renamed from: b */
    public final void mo35749b(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // p204p.hdm
    /* JADX INFO: renamed from: c */
    public final void mo35750c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // p204p.hdm, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((hdm) obj) == this ? 0 : -1;
    }

    @Override // p204p.hdm
    /* JADX INFO: renamed from: d */
    public final Comparable mo35751d() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // p204p.hdm
    /* JADX INFO: renamed from: e */
    public final boolean mo35752e(Comparable comparable) {
        return true;
    }

    @Override // p204p.hdm
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
