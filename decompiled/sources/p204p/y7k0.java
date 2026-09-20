package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class y7k0 {

    /* JADX INFO: renamed from: a */
    public final Set f270099a;

    /* JADX INFO: renamed from: b */
    public final float f270100b;

    public y7k0(Set set, float f) {
        this.f270099a = set;
        this.f270100b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7k0)) {
            return false;
        }
        y7k0 y7k0Var = (y7k0) obj;
        return wj50.m88271j(this.f270099a, y7k0Var.f270099a) && ybs.m93301b(this.f270100b, y7k0Var.f270100b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f270100b) + (this.f270099a.hashCode() * 31);
    }
}
