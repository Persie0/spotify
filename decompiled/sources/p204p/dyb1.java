package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dyb1 implements eyb1 {

    /* JADX INFO: renamed from: a */
    public final UnsupportedOperationException f54278a;

    public dyb1(UnsupportedOperationException unsupportedOperationException) {
        this.f54278a = unsupportedOperationException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyb1) && this.f54278a.equals(((dyb1) obj).f54278a);
    }

    public final int hashCode() {
        return this.f54278a.hashCode();
    }
}
