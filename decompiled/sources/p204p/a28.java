package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a28 {

    /* JADX INFO: renamed from: a */
    public final long f11590a;

    /* JADX INFO: renamed from: b */
    public final long f11591b;

    /* JADX INFO: renamed from: c */
    public final Set f11592c;

    public a28(long j, long j2, Set set) {
        this.f11590a = j;
        this.f11591b = j2;
        this.f11592c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a28) {
            a28 a28Var = (a28) obj;
            if (this.f11590a == a28Var.f11590a && this.f11591b == a28Var.f11591b && this.f11592c.equals(a28Var.f11592c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f11590a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f11591b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f11592c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f11590a + ", maxAllowedDelay=" + this.f11591b + ", flags=" + this.f11592c + "}";
    }
}
