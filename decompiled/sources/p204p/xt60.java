package p204p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xt60 {

    /* JADX INFO: renamed from: a */
    public final Set f265775a;

    /* JADX INFO: renamed from: b */
    public final Set f265776b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f265777c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f265778d;

    public xt60(Set set, Set set2, LinkedHashSet linkedHashSet) {
        this.f265775a = set;
        this.f265776b = set2;
        this.f265777c = linkedHashSet;
        this.f265778d = s601.m77309l0(set, linkedHashSet);
        s601.m77309l0(set2, linkedHashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt60)) {
            return false;
        }
        xt60 xt60Var = (xt60) obj;
        return this.f265775a.equals(xt60Var.f265775a) && this.f265776b.equals(xt60Var.f265776b) && this.f265777c.equals(xt60Var.f265777c);
    }

    public final int hashCode() {
        return this.f265777c.hashCode() + klh.m56830b(this.f265775a.hashCode() * 31, 31, this.f265776b);
    }
}
