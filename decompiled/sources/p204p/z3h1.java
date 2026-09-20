package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class z3h1 {

    /* JADX INFO: renamed from: a */
    public final String f278959a;

    public z3h1(String str) {
        this.f278959a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof z3h1) && this.f278959a.equals(((z3h1) obj).f278959a);
    }

    public final int hashCode() {
        return ((((this.f278959a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return dq60.m36616p(this.f278959a, ", enableFirelog=true, firelogEventType=1}", new StringBuilder("MLKitLoggingOptions{libraryName="));
    }
}
