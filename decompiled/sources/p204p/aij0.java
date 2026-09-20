package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class aij0 {

    /* JADX INFO: renamed from: a */
    public final boolean f16001a;

    /* JADX INFO: renamed from: b */
    public final boolean f16002b;

    /* JADX INFO: renamed from: c */
    public final boolean f16003c;

    /* JADX INFO: renamed from: d */
    public final boolean f16004d;

    public aij0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f16001a = z;
        this.f16002b = z2;
        this.f16003c = z3;
        this.f16004d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aij0)) {
            return false;
        }
        aij0 aij0Var = (aij0) obj;
        return this.f16001a == aij0Var.f16001a && this.f16002b == aij0Var.f16002b && this.f16003c == aij0Var.f16003c && this.f16004d == aij0Var.f16004d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16004d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f16001a) * 31, 31, this.f16002b), 31, this.f16003c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.f16001a);
        sb.append(", isValidated=");
        sb.append(this.f16002b);
        sb.append(", isMetered=");
        sb.append(this.f16003c);
        sb.append(", isNotRoaming=");
        return s571.m77253l(sb, this.f16004d, ')');
    }
}
