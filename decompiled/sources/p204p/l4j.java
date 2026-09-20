package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class l4j implements hes0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f129719a;

    public l4j(LinkedHashMap linkedHashMap) {
        this.f129719a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4j) && this.f129719a.equals(((l4j) obj).f129719a);
    }

    public final int hashCode() {
        return this.f129719a.hashCode();
    }
}
