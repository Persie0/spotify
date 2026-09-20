package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class oy21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f171648a;

    public oy21(LinkedHashSet linkedHashSet) {
        this.f171648a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy21) && this.f171648a.equals(((oy21) obj).f171648a);
    }

    public final int hashCode() {
        return this.f171648a.hashCode();
    }
}
