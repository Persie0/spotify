package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class re11 implements ze11 {

    /* JADX INFO: renamed from: a */
    public final Set f198252a;

    /* JADX INFO: renamed from: b */
    public final Set f198253b;

    public re11(Set set, Set set2) {
        this.f198252a = set;
        this.f198253b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re11)) {
            return false;
        }
        re11 re11Var = (re11) obj;
        return wj50.m88271j(this.f198252a, re11Var.f198252a) && wj50.m88271j(this.f198253b, re11Var.f198253b);
    }

    public final int hashCode() {
        return this.f198253b.hashCode() + (this.f198252a.hashCode() * 31);
    }
}
