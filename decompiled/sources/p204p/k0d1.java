package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class k0d1 {

    /* JADX INFO: renamed from: a */
    public final String f117989a;

    /* JADX INFO: renamed from: b */
    public final List f117990b;

    public k0d1(String str, List list) {
        this.f117989a = str;
        this.f117990b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0d1)) {
            return false;
        }
        k0d1 k0d1Var = (k0d1) obj;
        return wj50.m88271j(this.f117989a, k0d1Var.f117989a) && wj50.m88271j(this.f117990b, k0d1Var.f117990b);
    }

    public final int hashCode() {
        return this.f117990b.hashCode() + (this.f117989a.hashCode() * 31);
    }
}
