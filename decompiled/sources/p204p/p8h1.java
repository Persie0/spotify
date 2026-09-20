package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class p8h1 {

    /* JADX INFO: renamed from: a */
    public final String f174965a;

    public p8h1(String str) {
        this.f174965a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof p8h1) && this.f174965a.equals(((p8h1) obj).f174965a);
    }

    public final int hashCode() {
        return ((((this.f174965a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return dq60.m36616p(this.f174965a, ", enableFirelog=true, firelogEventType=1}", new StringBuilder("MLKitLoggingOptions{libraryName="));
    }
}
