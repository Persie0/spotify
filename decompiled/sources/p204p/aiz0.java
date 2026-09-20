package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aiz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f16115a;

    /* JADX INFO: renamed from: b */
    public final boolean f16116b;

    public aiz0(boolean z, boolean z2) {
        this.f16115a = z;
        this.f16116b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiz0)) {
            return false;
        }
        aiz0 aiz0Var = (aiz0) obj;
        return this.f16115a == aiz0Var.f16115a && this.f16116b == aiz0Var.f16116b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16116b) + (Boolean.hashCode(this.f16115a) * 31);
    }
}
