package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class w080 {

    /* JADX INFO: renamed from: a */
    public final boolean f246667a;

    /* JADX INFO: renamed from: b */
    public final int f246668b;

    public w080(boolean z, int i) {
        this.f246667a = z;
        this.f246668b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w080)) {
            return false;
        }
        w080 w080Var = (w080) obj;
        return this.f246667a == w080Var.f246667a && this.f246668b == w080Var.f246668b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f246668b) + (Boolean.hashCode(this.f246667a) * 31);
    }
}
