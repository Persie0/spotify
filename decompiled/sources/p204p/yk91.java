package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class yk91 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f273650a;

    /* JADX INFO: renamed from: b */
    public final Object f273651b;

    /* JADX INFO: renamed from: c */
    public final Object f273652c;

    public yk91(Object obj, Object obj2, Object obj3) {
        this.f273650a = obj;
        this.f273651b = obj2;
        this.f273652c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk91)) {
            return false;
        }
        yk91 yk91Var = (yk91) obj;
        return wj50.m88271j(this.f273650a, yk91Var.f273650a) && wj50.m88271j(this.f273651b, yk91Var.f273651b) && wj50.m88271j(this.f273652c, yk91Var.f273652c);
    }

    public final int hashCode() {
        Object obj = this.f273650a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f273651b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f273652c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f273650a + ", " + this.f273651b + ", " + this.f273652c + ')';
    }
}
