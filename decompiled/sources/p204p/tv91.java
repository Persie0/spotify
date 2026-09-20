package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tv91 {

    /* JADX INFO: renamed from: a */
    public final boolean f224100a;

    /* JADX INFO: renamed from: b */
    public final long f224101b;

    public tv91(boolean z, long j) {
        this.f224100a = z;
        this.f224101b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv91)) {
            return false;
        }
        tv91 tv91Var = (tv91) obj;
        return this.f224100a == tv91Var.f224100a && this.f224101b == tv91Var.f224101b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f224101b) + (Boolean.hashCode(this.f224100a) * 31);
    }
}
