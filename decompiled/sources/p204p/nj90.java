package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class nj90 {

    /* JADX INFO: renamed from: a */
    public final ss11 f154530a;

    /* JADX INFO: renamed from: b */
    public final Map f154531b;

    public nj90(ss11 ss11Var, Map map) {
        this.f154530a = ss11Var;
        this.f154531b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj90)) {
            return false;
        }
        nj90 nj90Var = (nj90) obj;
        return wj50.m88271j(this.f154530a, nj90Var.f154530a) && wj50.m88271j(this.f154531b, nj90Var.f154531b);
    }

    public final int hashCode() {
        return this.f154531b.hashCode() + (this.f154530a.hashCode() * 31);
    }
}
