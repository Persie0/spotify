package p204p;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g40 {

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f76307b;

    /* JADX INFO: renamed from: a */
    public final Set f76306a = gbu.f78413a;

    /* JADX INFO: renamed from: c */
    public final Map f76308c = nau.f152117a;

    public g40(LinkedHashSet linkedHashSet) {
        this.f76307b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g40)) {
            return false;
        }
        g40 g40Var = (g40) obj;
        return wj50.m88271j(this.f76306a, g40Var.f76306a) && wj50.m88271j(this.f76307b, g40Var.f76307b) && wj50.m88271j(this.f76308c, g40Var.f76308c);
    }

    public final int hashCode() {
        return this.f76308c.hashCode() + ((this.f76307b.hashCode() + (this.f76306a.hashCode() * 31)) * 31);
    }
}
