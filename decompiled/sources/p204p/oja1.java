package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class oja1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f166025a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f166026b;

    public oja1(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.f166025a = linkedHashSet;
        this.f166026b = linkedHashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oja1)) {
            return false;
        }
        oja1 oja1Var = (oja1) obj;
        return this.f166025a.equals(oja1Var.f166025a) && this.f166026b.equals(oja1Var.f166026b);
    }

    public final int hashCode() {
        return this.f166026b.hashCode() + (this.f166025a.hashCode() * 31);
    }
}
