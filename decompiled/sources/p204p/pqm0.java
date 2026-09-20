package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class pqm0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f180350a;

    /* JADX INFO: renamed from: b */
    public final Object f180351b;

    public pqm0(Object obj, Object obj2) {
        this.f180350a = obj;
        this.f180351b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public static pqm0 m70657a(pqm0 pqm0Var, Object obj) {
        Object obj2 = pqm0Var.f180350a;
        pqm0Var.getClass();
        return new pqm0(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqm0)) {
            return false;
        }
        pqm0 pqm0Var = (pqm0) obj;
        return wj50.m88271j(this.f180350a, pqm0Var.f180350a) && wj50.m88271j(this.f180351b, pqm0Var.f180351b);
    }

    public final int hashCode() {
        Object obj = this.f180350a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f180351b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f180350a + ", " + this.f180351b + ')';
    }
}
