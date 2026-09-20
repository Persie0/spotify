package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class dot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f51114a;

    public dot0(LinkedHashMap linkedHashMap) {
        this.f51114a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dot0) && this.f51114a.equals(((dot0) obj).f51114a);
    }

    public final int hashCode() {
        return this.f51114a.hashCode();
    }
}
