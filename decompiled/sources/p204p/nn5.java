package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class nn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f156330a;

    public nn5(LinkedHashMap linkedHashMap) {
        this.f156330a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn5) && this.f156330a.equals(((nn5) obj).f156330a);
    }

    public final int hashCode() {
        return this.f156330a.hashCode();
    }
}
