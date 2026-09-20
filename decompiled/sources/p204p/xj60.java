package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xj60 {

    /* JADX INFO: renamed from: a */
    public final Object f262054a;

    /* JADX INFO: renamed from: b */
    public final Object f262055b;

    public xj60(Object obj, Object obj2) {
        this.f262054a = obj;
        this.f262055b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj60)) {
            return false;
        }
        xj60 xj60Var = (xj60) obj;
        return wj50.m88271j(this.f262054a, xj60Var.f262054a) && wj50.m88271j(this.f262055b, xj60Var.f262055b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.f262054a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i = iHashCode * 31;
        Object obj2 = this.f262055b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f262054a + ", right=" + this.f262055b + ')';
    }
}
