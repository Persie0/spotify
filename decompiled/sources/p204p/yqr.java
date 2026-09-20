package p204p;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class yqr implements rtr {

    /* JADX INFO: renamed from: a */
    public final ro0 f275280a;

    /* JADX INFO: renamed from: b */
    public final Set f275281b;

    public yqr(ro0 ro0Var, AbstractSet abstractSet) {
        this.f275280a = ro0Var;
        this.f275281b = abstractSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqr)) {
            return false;
        }
        yqr yqrVar = (yqr) obj;
        return wj50.m88271j(this.f275280a, yqrVar.f275280a) && wj50.m88271j(this.f275281b, yqrVar.f275281b);
    }

    public final int hashCode() {
        return this.f275281b.hashCode() + (this.f275280a.hashCode() * 31);
    }
}
