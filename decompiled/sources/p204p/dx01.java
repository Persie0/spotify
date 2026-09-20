package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class dx01 implements ktx {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f53816a;

    public dx01(LinkedHashSet linkedHashSet) {
        this.f53816a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx01) && this.f53816a.equals(((dx01) obj).f53816a);
    }

    public final int hashCode() {
        return this.f53816a.hashCode();
    }
}
