package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class srq0 {

    /* JADX INFO: renamed from: a */
    public final Object f213371a;

    public srq0(List list) {
        this.f213371a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srq0) && this.f213371a.equals(((srq0) obj).f213371a);
    }

    public final int hashCode() {
        return this.f213371a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final String toString() {
        return edb.m38563l("PreparedTranscript(rowsSize=", this.f213371a.size(), ")");
    }
}
