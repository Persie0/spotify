package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class tpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f222600a;

    public tpt0(LinkedHashMap linkedHashMap) {
        this.f222600a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpt0) && this.f222600a.equals(((tpt0) obj).f222600a);
    }

    public final int hashCode() {
        return this.f222600a.hashCode();
    }
}
