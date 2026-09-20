package p204p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class udx extends i2h1 {

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f229343b;

    /* JADX INFO: renamed from: c */
    public final Set f229344c;

    public udx(LinkedHashSet linkedHashSet, Set set) {
        this.f229343b = linkedHashSet;
        this.f229344c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udx)) {
            return false;
        }
        udx udxVar = (udx) obj;
        return this.f229343b.equals(udxVar.f229343b) && this.f229344c.equals(udxVar.f229344c);
    }

    public final int hashCode() {
        return this.f229344c.hashCode() + (this.f229343b.hashCode() * 31);
    }
}
