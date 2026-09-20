package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class cx01 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f42881a;

    public cx01(LinkedHashSet linkedHashSet) {
        this.f42881a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx01) && this.f42881a.equals(((cx01) obj).f42881a);
    }

    public final int hashCode() {
        return this.f42881a.hashCode();
    }
}
