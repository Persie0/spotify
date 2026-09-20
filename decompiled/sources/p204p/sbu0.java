package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class sbu0 {

    /* JADX INFO: renamed from: a */
    public final Object f207585a;

    public sbu0(List list) {
        this.f207585a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbu0) && this.f207585a.equals(((sbu0) obj).f207585a);
    }

    public final int hashCode() {
        return this.f207585a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final String toString() {
        return edb.m38563l("RawTranscript(wordsSize=", this.f207585a.size(), ")");
    }
}
