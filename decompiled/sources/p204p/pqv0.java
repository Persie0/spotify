package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pqv0 {

    /* JADX INFO: renamed from: a */
    public final List f180435a;

    /* JADX INFO: renamed from: b */
    public final String f180436b;

    public pqv0(List list, String str) {
        this.f180435a = list;
        this.f180436b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqv0)) {
            return false;
        }
        pqv0 pqv0Var = (pqv0) obj;
        return wj50.m88271j(this.f180435a, pqv0Var.f180435a) && wj50.m88271j(this.f180436b, pqv0Var.f180436b);
    }

    public final int hashCode() {
        return this.f180436b.hashCode() + (this.f180435a.hashCode() * 31);
    }
}
