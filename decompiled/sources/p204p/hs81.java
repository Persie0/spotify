package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hs81 {

    /* JADX INFO: renamed from: a */
    public final String f94632a;

    /* JADX INFO: renamed from: b */
    public final List f94633b;

    public hs81(String str, ae50 ae50Var) {
        this.f94632a = str;
        this.f94633b = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs81)) {
            return false;
        }
        hs81 hs81Var = (hs81) obj;
        return wj50.m88271j(this.f94632a, hs81Var.f94632a) && wj50.m88271j(this.f94633b, hs81Var.f94633b);
    }

    public final int hashCode() {
        return this.f94633b.hashCode() + (this.f94632a.hashCode() * 31);
    }
}
