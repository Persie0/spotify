package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class e3b1 extends ov50 {

    /* JADX INFO: renamed from: e */
    public final Set f55733e;

    /* JADX INFO: renamed from: f */
    public final Set f55734f;

    public e3b1(Set set, Set set2) {
        super(3, 7);
        this.f55733e = set;
        this.f55734f = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3b1)) {
            return false;
        }
        e3b1 e3b1Var = (e3b1) obj;
        return wj50.m88271j(this.f55733e, e3b1Var.f55733e) && wj50.m88271j(this.f55734f, e3b1Var.f55734f);
    }

    public final int hashCode() {
        return this.f55734f.hashCode() + (this.f55733e.hashCode() * 31);
    }
}
