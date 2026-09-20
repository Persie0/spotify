package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class x990 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f259304a;

    public x990(LinkedHashMap linkedHashMap) {
        this.f259304a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x990) && this.f259304a.equals(((x990) obj).f259304a);
    }

    public final int hashCode() {
        return this.f259304a.hashCode();
    }
}
